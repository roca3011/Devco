/**
 * 
 */
package com.devco.prueba.dominio.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.devco.prueba.dominio.excepcion.NumerosIncorrectos;
import com.devco.prueba.dominio.modelo.Romanos;
import com.devco.prueba.dominio.repositorio.RomanosRepositorio;

/**
 * @author robecafr
 *
 */
public class ServicioConvertirArabigo {
	
	private static final String ERRORNUMEROARABIGO = "Debe ingresar un número valido no mayor a 99";
	
	@Autowired
	private RomanosRepositorio romanosRepositorio;

	public Romanos transformarArabigosARomanos(Romanos romano){
		int numeroArabigo = romano.getNumeroArabigo();
		validarArabigo(numeroArabigo);
		return obtenerNumeroRomano(numeroArabigo);
	}
	
	private void validarArabigo(int  numeroArabigo){
		if(numeroArabigo ==0 || numeroArabigo>99){
			throw new NumerosIncorrectos(ERRORNUMEROARABIGO);
		}
	}
	
	private Romanos obtenerNumeroRomano(int numeroArabigo) {		
		Romanos romanos = romanosRepositorio.consultarNumeroRomano(numeroArabigo);
		/**Si el número arabigo completo no esta en la Bd, lo busca por partes*/
		if (StringUtils.isEmpty(romanos.getNumeroRomano())) {
			
			int unidades=numeroArabigo%10;
		    int decenas=(numeroArabigo/10)%10;
		    int centenas=numeroArabigo/100;
		    
		    String romanoCentenas = romanosRepositorio.consultarNumeroRomano(centenas*100).getNumeroRomano();
		    String romanoDecenas = romanosRepositorio.consultarNumeroRomano(decenas*10).getNumeroRomano();
		    String romanoUnidades = romanosRepositorio.consultarNumeroRomano(unidades).getNumeroRomano();
		    
		    String numeroRomano = (romanoCentenas == null?"":romanoCentenas);
		    numeroRomano = numeroRomano + (romanoDecenas == null?"":romanoDecenas);
		    numeroRomano = numeroRomano + (romanoUnidades == null?"":romanoUnidades);
		    
		    romanos.setNumeroRomano(numeroRomano);
		}
		return romanos;		
	}
	
}

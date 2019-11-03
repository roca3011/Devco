/**
 * 
 */
package com.devco.prueba.aplicacion.servicio;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devco.prueba.dominio.modelo.Romanos;
import com.devco.prueba.dominio.servicio.ServicioConvertirArabigo;

/**
 * @author robecafr
 *
 */
@Service
@Transactional
public class TransformarNumeroArabigos {

	private ServicioConvertirArabigo servicioConvertirArabigo;

	public TransformarNumeroArabigos(ServicioConvertirArabigo servicioConvertirArabigo) {
		this.servicioConvertirArabigo =  servicioConvertirArabigo;
	}

	public Romanos transformarArabigosARomanos(Romanos romano) {	
		return servicioConvertirArabigo.transformarArabigosARomanos(romano);
	}

}


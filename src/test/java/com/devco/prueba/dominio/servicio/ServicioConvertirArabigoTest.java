/**
 * 
 */
package com.devco.prueba.dominio.servicio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.devco.prueba.dominio.modelo.Romanos;
import com.devco.prueba.dominio.repositorio.RomanosRepositorio;

/**
 * @author robecafr
 *
 */
@SpringBootTest()
@RunWith(SpringRunner.class)
class ServicioConvertirArabigoTest {
	
	@Mock
	RomanosRepositorio romanosRepositorio;
	
	@Mock
	Romanos romanos;
	
	@InjectMocks
	ServicioConvertirArabigo servicioConvertirArabigo = new ServicioConvertirArabigo();	
	
	@Test
	public void dadoUnNumeroArabigoObtieneElNumeroRomano() {
				
		//arrange
		String numeroRomano = "X";
		int numeroArabigo = 10;
		
		Romanos romanosFinal = new Romanos(numeroArabigo);
		Romanos romanos = new Romanos();
		romanos.setNumeroRomano("X");
		
		//act
		when(romanosRepositorio.consultarNumeroRomano(numeroArabigo)).thenReturn(romanos);
	
		//asser
		assertEquals(numeroRomano, servicioConvertirArabigo.transformarArabigosARomanos(romanosFinal).getNumeroRomano());
	}

}

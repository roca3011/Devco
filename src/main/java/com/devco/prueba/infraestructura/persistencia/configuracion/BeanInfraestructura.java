/**
 * 
 */
package com.devco.prueba.infraestructura.persistencia.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.devco.prueba.dominio.servicio.ServicioConvertirArabigo;

/**
 * @author robecafr
 *
 */
@Configuration
public class BeanInfraestructura {
	
	@Bean
	public ServicioConvertirArabigo servicioConvertirArabigo() {
		return new ServicioConvertirArabigo();
	}

}

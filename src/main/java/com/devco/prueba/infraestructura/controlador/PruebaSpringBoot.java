/**
 * 
 */
package com.devco.prueba.infraestructura.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devco.prueba.aplicacion.servicio.TransformarNumeroArabigos;
import com.devco.prueba.dominio.modelo.Romanos;

/**
 * @author robecafr
 *
 */
@RestController
public class PruebaSpringBoot {
	
	@Autowired
	private TransformarNumeroArabigos transformarNumeroArabigos;

	@PostMapping("/romanos")
	public ResponseEntity<Romanos> transformarArabigosARomanos(@RequestBody Romanos romano){
		return new ResponseEntity<>(transformarNumeroArabigos.transformarArabigosARomanos(romano),HttpStatus.OK);
		
	}
	
}

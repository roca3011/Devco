/**
 * 
 */
package com.devco.prueba.dominio.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author robecafr
 *
 */
@Getter 
@Setter
@NoArgsConstructor
public class Romanos {
	
	private String numeroRomano;
	private int numeroArabigo;
	
	public Romanos(int numeroArabigo) {
		this.numeroArabigo = numeroArabigo;
	}

}

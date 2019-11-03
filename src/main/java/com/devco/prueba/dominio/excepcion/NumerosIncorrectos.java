/**
 * 
 */
package com.devco.prueba.dominio.excepcion;

/**
 * @author robecafr
 *
 */
public class NumerosIncorrectos extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public NumerosIncorrectos(String mensaje) {
		super(mensaje);
	}

}

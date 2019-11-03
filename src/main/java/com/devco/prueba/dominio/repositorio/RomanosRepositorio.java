/**
 * 
 */
package com.devco.prueba.dominio.repositorio;

import com.devco.prueba.dominio.modelo.Romanos;

/**
 * @author robecafr
 *
 */
public interface RomanosRepositorio {

	/** Obtiene a partir de un número arabigo su respectivo número romano*/
	public Romanos consultarNumeroRomano(int numeroArabigo);
}

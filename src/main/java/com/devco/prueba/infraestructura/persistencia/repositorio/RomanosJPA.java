/**
 * 
 */
package com.devco.prueba.infraestructura.persistencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devco.prueba.infraestructura.persistencia.entidad.RomanosEntidad;

/**
 * @author robecafr
 *
 */
public interface RomanosJPA extends JpaRepository<RomanosEntidad, Long>{

	RomanosEntidad findByArabigo(int arabigo);
}

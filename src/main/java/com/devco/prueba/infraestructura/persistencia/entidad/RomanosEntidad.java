/**
 * 
 */
package com.devco.prueba.infraestructura.persistencia.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author robecafr
 *
 */
@Entity
@Table(name = "romanos")
@Getter 
@Setter
public class RomanosEntidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_romano")
	private long idRomano;
	
	@Column(name = "arabigo")
	private int arabigo;
	
	@Column(name = "romano")
	private String romano;

}

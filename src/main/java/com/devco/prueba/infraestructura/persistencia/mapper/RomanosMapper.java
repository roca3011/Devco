package com.devco.prueba.infraestructura.persistencia.mapper;

import com.devco.prueba.dominio.modelo.Romanos;
import com.devco.prueba.infraestructura.persistencia.entidad.RomanosEntidad;

public class RomanosMapper {
	
	private RomanosMapper() {
	}
	
	public static RomanosEntidad convertirAEntidad(int arabigo) {
		RomanosEntidad romanosEntidad = new RomanosEntidad();
		
		romanosEntidad.setArabigo(arabigo);
		return romanosEntidad;
	}
	
	public static Romanos convertirAModelo(RomanosEntidad romanosEntidad) {
		Romanos romanos =  new Romanos();
		romanos.setNumeroArabigo(romanosEntidad.getArabigo());
		romanos.setNumeroRomano(romanosEntidad.getRomano());
		
		return romanos;
	}
}

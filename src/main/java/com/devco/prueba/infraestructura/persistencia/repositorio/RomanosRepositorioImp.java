package com.devco.prueba.infraestructura.persistencia.repositorio;

import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.devco.prueba.dominio.modelo.Romanos;
import com.devco.prueba.dominio.repositorio.RomanosRepositorio;
import com.devco.prueba.infraestructura.persistencia.entidad.RomanosEntidad;
import com.devco.prueba.infraestructura.persistencia.mapper.RomanosMapper;

@Repository
public class RomanosRepositorioImp implements RomanosRepositorio{

	private final RomanosJPA romanosJPA;
	
	public RomanosRepositorioImp(final RomanosJPA romanosJPA) {
		this.romanosJPA = romanosJPA;
	}
	
	@Override
	public Romanos consultarNumeroRomano(int numeroArabigo) {
		
		RomanosEntidad romanosEntidad = RomanosMapper.convertirAEntidad(numeroArabigo);		
		romanosEntidad = romanosJPA.findByArabigo(romanosEntidad.getArabigo());		
		return !StringUtils.isEmpty(romanosEntidad)?RomanosMapper.convertirAModelo(romanosEntidad):new Romanos(numeroArabigo);
	}

	
}

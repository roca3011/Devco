/**
 * 
 */
package com.devco.prueba.integracion;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.devco.prueba.PruebaApplication;
import com.devco.prueba.aplicacion.servicio.TransformarNumeroArabigos;
import com.devco.prueba.dominio.modelo.Romanos;
import com.devco.prueba.infraestructura.controlador.PruebaSpringBoot;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author robecafr
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PruebaApplication.class)
@AutoConfigureMockMvc
public class PruebaControladorTest {
	
	@Autowired
	private WebApplicationContext context;
		
	private MockMvc mockMvc;
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void transformarNumeroArabigoARomanoTest() throws JsonProcessingException, Exception {
		Romanos romanos = new Romanos();
		romanos.setNumeroArabigo(10);
		
		mockMvc.perform(post("/romanos")
				.content(new ObjectMapper().writeValueAsString(romanos))
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());

	}

}

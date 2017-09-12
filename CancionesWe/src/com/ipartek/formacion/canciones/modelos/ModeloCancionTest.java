package com.ipartek.formacion.canciones.modelos;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ipartek.formacion.canciones.pojo.Cancion;
import com.sun.javafx.sg.prism.NGShape.Mode;

public class ModeloCancionTest {

	@Test
	public void test() {
		ModeloCancionImpl model = ModeloCancionImpl.getInstance();
		
		assertEquals(10, model.getAll().size());
		
		Cancion c = new Cancion("Corazon de mimbre", "Marea", "5.37");
		
		assertTrue("No ha podido insertar la cancion", model.insert(c));
		assertEquals("No ha generado bien el id", 526, c.getId());
		
		//buscar por ID
		assertNull( model.getByPosicion(-1));
		assertNull( model.getByPosicion(500));
		assertNotNull( model.getByPosicion(8));
		
		//elimiar
		assertFalse(model.eliminar(-1));
		assertTrue("fallo al eliminar",model.eliminar(526));
		assertEquals(10, model.getAll().size());
		assertNull( model.getByPosicion(526));
		
		//update
		assertTrue("No ha podido insertar la cancion", model.insert(c));
		c.setTitulo("Mareado");
		c.setArtista("El drogas");
		assertTrue(model.update(c));
		assertEquals("Mareado", model.getByPosicion(c.getId()).getTitulo());
		assertEquals("El drogas", model.getByPosicion(c.getId()).getArtista());
		assertFalse(model.update(null));
		Cancion c2 = new Cancion("Corazon de mimbre2", "Mare2a", "5.327");
		assertFalse(model.update(c2));
	}

}

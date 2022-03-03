package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CursoTest {


	Persona p = new Persona("11111111L", "angel", "ramirez");
	Persona p1 = new Persona("11111111W", "manolo", "lopez");
	Persona p2 = new Persona("11111111Q", "antonio", "serrano");
	Persona p3 = new Persona("11111111P", "jose", "garcia");
	Curso c = new Curso();

	@Test
	void testEliminarAlumno() throws Exception {
		c.aniadirAlumno(p);
		c.aniadirAlumno(p1);
		c.aniadirAlumno(p2);
		c.aniadirAlumno(p3);
		boolean esperado = false;
		c.eliminarAlumno(p.getDni());

		assertEquals(esperado, c.estaRegistrado(p.getDni()));
	}
	@Test
	void testAniadirAlumno() {
		c.aniadirAlumno(p);
		boolean esperado = true;
		c.aniadirAlumno(p);

		assertEquals(esperado, c.estaRegistrado(p.getDni()));
	}
	@Test
	void testEstaRegistrado() {
		c.aniadirAlumno(p);
		boolean esperado = true;
		c.aniadirAlumno(p);

		assertEquals(esperado, c.estaRegistrado(p.getDni()));
	}

}

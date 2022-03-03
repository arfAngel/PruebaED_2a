package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {

	Persona p = new Persona("11111111L", "angel", "ramirez");

	@Test
	void testPersona() {
		Persona real = new Persona("11111111L", "angel", "ramirez");
		assertEquals(p, real);
	}

	@Test
	void testGetDni() {
		String esperado ="11111111L";
		String real = p.getDni();
		assertEquals(esperado, real);
	}
	@Test
	void testSetDni() throws Exception {
		String esperado ="22222222Z";
		 p.setDni("22222222Z");
		assertEquals(esperado, p.getDni());
	}
	@Test
	void testGetNombre() {
		String esperado ="angel";
		String real = p.getNombre();
		assertEquals(esperado, real);
	}
	@Test
	void testSetNombre() {
		String esperado ="carlos";
		p.setNombre(esperado);
		assertEquals(esperado, p.getNombre());
	}
	@Test
	void testGetApellido() {
		String esperado ="ramirez";
		String real = p.getApellido1();
		assertEquals(esperado, real);
	}
}

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
}

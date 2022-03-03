package com.iescomercio.ed.bloque2.repaso.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private List<Persona> listaAlumnos;

	/**
	 * Metodo que sirve para eliminar un alumno.
	 * @param dni
	 * @throws Exception
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/**
	 * Metodo que sirve para aniadir un alumno.
	 * @param p
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	/**
	 * Metodo que sirve para saber si un alumno esta registrado.
	 * @param dni
	 * @return boolean 
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	/**
	 * Metodo que sirve para crear una lista de alumnos.
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	/**
	 * Metodo que sirve para contar la cantidad de alumnos.
	 * @return Integer
	 */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}

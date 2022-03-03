package com.iescomercio.ed.bloque2.repaso.modelo;

public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	/**
	 * Metodo que sirve para crear una persona.
	 * @param dni
	 * @param nombre
	 * @param apellido1
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/**
	 * Metodo que sirve para monstrar el dni de una persona.
	 * @return dni
	 */
	public String getDni() {
		return dni;
	}
	
	
	/**
	 * Metodo que sirve para cambiar el dni de una persona.
	 * @param dni
	 * @throws Exception
	 */
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	/***
	 * Metodo que sirve para monstrar el nombre de una persona.
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo que sirve para cambiar el nombre de una persona.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Metodo que sirve para monstrar el apellido de una persona.
	 * @return apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	/***
	 * Metodo que sirve para cambiar el apellido de una persona.
	 * @param apellido1
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}

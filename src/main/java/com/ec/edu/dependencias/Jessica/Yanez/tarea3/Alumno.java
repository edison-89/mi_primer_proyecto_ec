package com.ec.edu.dependencias.Jessica.Yanez.tarea3;

public class Alumno {

	private String nombre;
	private String apellido;
	private String semestre;
	
	public Alumno() {
		
	}

	
	
	public Alumno(String nombre, String apellido, String semestre) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.semestre = semestre;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
	
	
	
	
	
	
	
	
	
}

package com.ec.edu.dependencias;

public class EstudianteOdontologia extends Estudiante {
	
	private String ciudadRural;
	
	public void pagarServiPagos(String nombre) {
		System.out.println(nombre + " hace el pago");
		System.out.println(nombre + " presenta el pago");
		System.out.println(nombre + " EFECTIVO");
	}

	//
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getCiudadRural() {
		return ciudadRural;
	}

	public void setCiudadRural(String ciudadRural) {
		this.ciudadRural = ciudadRural;
	}
}

package com.ec.edu.inyeccion.dependecias.extendida;

public class Estudiante {

	protected String nombre;
	protected String apellido;
	protected Direccion direccion;
	
	public void pagarServiPagos(String nombre) {
		System.out.println(nombre + " hace el pago");
		System.out.println(nombre + " presenta el pago");
		System.out.println(nombre + " TARJETA");
	}

	// Metodos SET y GET
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

	@Override
	public String toString() {	
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + "]";
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
}

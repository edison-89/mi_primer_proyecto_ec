package com.ec.edu.inyeccion.dependencias.modelos;

public class CuentaCorriente implements ICuenta {
	private float montoMinimo;

	@Override
	public void calcularDescuento(String numero) {
		System.out.println("Calculando corriente......");

	}

	@Override
	public void calcularBeneficio() {
		System.out.println("Calculando beneficio corriente");
	}

	// Metodos SET y GET
	public float getMontoMinimo() {
		return montoMinimo;
	}

	public void setMontoMinimo(float montoMinimo) {
		this.montoMinimo = montoMinimo;
	}

}

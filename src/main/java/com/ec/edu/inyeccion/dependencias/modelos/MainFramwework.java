package com.ec.edu.inyeccion.dependencias.modelos;

import java.util.Scanner;

public class MainFramwework {

	public static void main(String[] args) {
		Scanner scannerInt = new Scanner(System.in);


		System.out.println("Ingrese Tipo:");
		int tipo = scannerInt.nextInt();
		ICuenta cuenta = null;
		if(tipo==1) {
			cuenta = new CuentaCorriente();
		}else if(tipo==2) {
			cuenta = new CuentaAhorros();
		}else if(tipo==3) {
			cuenta = new CuentaFuturo();
			cuenta = new ICuenta() {
				
				@Override
				public void calcularDescuento(String numero) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void calcularBeneficio() {
					// TODO Auto-generated method stub
					
				}
			};
		}
		
		GestorCuenta gestor=new GestorCuenta(cuenta);
		gestor.registrarCuentaHabiente();

	}

}

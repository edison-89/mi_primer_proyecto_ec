package com.ec.edu.dependencias;

import java.util.Scanner;

public class MainUCE {
	private static final int IVA = 12;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scannerInt = new Scanner(System.in);
		System.out.println("Ingrese Nombre:");
		String nombre = scanner.nextLine();

		System.out.println("Ingrese Apellido:");
		String apellido = scanner.nextLine();

		System.out.println("Ingrese Calle:");
		String calle = scanner.nextLine();

		System.out.println("Ingrese Numeracion:");
		String numeracion = scanner.nextLine();

		System.out.println("Ingrese Tipo:");
		int tipo = scannerInt.nextInt();

		// TODO Auto-generated method stub

		Matricula matricula = new Matricula();
		matricula.setAnio(2015);
		matricula.setSemestre("Sexto");

		String mensaje = matricula.matricular(nombre, apellido, calle, numeracion, tipo);
		System.out.println(mensaje);
	}

}

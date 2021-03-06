package com.ec.edu.dependencias;

public class Matricula {

	private String semestre;
	private int anio;
	private Estudiante estudiante;

	public String matricular(String nombre, String apellido, String calle, String numero,int tipo) {
		if(tipo==1) {
			this.estudiante = new Estudiante();//JVM: heap //ID
			
		}else if(tipo==2) {
			this.estudiante = new EstudianteOdontologia();//JVM: heap //ID
		} else if(tipo==3) {
			this.estudiante = new EstudianteArquitecura();//JVM: heap //ID
		}else {
			this.estudiante = new EstudiantesAdministracion();//JVM: heap //ID
		}
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);

		Direccion direccion = new Direccion();
		direccion.setCallePrincipal(calle);
		direccion.setNumeracion(numero);

		this.estudiante.setDireccion(direccion);

		// logica para guadar en la base de datos los datos de la matricula
		// y el estudiante
		System.out.println(this.estudiante);

		this.estudiante.pagarServiPagos(nombre);
		

		
		return "Estudiante Guardado con Exito";
	}

	// Metodos SET y GET
	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

}

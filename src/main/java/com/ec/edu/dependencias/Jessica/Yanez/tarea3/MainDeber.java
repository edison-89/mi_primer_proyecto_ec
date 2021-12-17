package com.ec.edu.dependencias.Jessica.Yanez.tarea3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDeber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("com/uce/edu/archivo/beansTarea.xml");//pasar como parametro la ruta del archivo beans
		
		Profesor prof=(Profesor)app.getBean("profesor");
		Alumno paciente=(Alumno)app.getBean("alumno");
		System.out.println("**********prfe");
		System.out.println(prof.getNombre());
		System.out.println(prof.getApellido());
		System.out.println(prof.getProfesion());
		System.out.println(prof.getUniversidad());
		System.out.println("**********paciente");
		System.out.println(paciente.getNombre());
		System.out.println(paciente.getApellido());
		System.out.println(paciente.getSemestre());
		
	}

}

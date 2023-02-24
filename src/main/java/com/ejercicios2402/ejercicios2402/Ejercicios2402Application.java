package com.ejercicios2402.ejercicios2402;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ejercicios2402.ejercicios2402.models.Usuario;
import com.ejercicios2402.ejercicios2402.models.UsuarioAdmin;

@SpringBootApplication
public class Ejercicios2402Application {

	public static void main(String[] args) {
		HashMap <String, Integer> birthdayDiego = new HashMap<String, Integer>();
		birthdayDiego.put("Día", 2);
		birthdayDiego.put("Mes", 01);
		birthdayDiego.put("Año", 2000);

		ArrayList <String> projectsDiego = new ArrayList<String>();
		projectsDiego.add("Proyecto1");
		projectsDiego.add("Proyecto2");
		projectsDiego.add("Proyecto3");

		HashMap <String, Integer> birthdayYago = new HashMap<String, Integer>();
		birthdayDiego.put("Día", 8);
		birthdayDiego.put("Mes", 4);
		birthdayDiego.put("Año", 2003);

		ArrayList <String> projectsYago = new ArrayList<String>();
		projectsDiego.add("Proyecto1");
		projectsDiego.add("Proyecto2");
		projectsDiego.add("Proyecto3");

		ArrayList <String> projectsAdmin = new ArrayList<String>();
		projectsDiego.add("Proyecto1");
		projectsDiego.add("Proyecto2");
		projectsDiego.add("Proyecto3");

		Usuario usuarioEjemplo = new Usuario("diegoperez", "secreto", "diegoperez@gmail.com", "Diego", "Perez", "Hombre", "Soy estudiante de generation :)", 23, birthdayDiego, "usuarioNormal", projectsDiego, projectsAdmin);
		UsuarioAdmin usuarioAdminEjemplo = new UsuarioAdmin("yagoellen", "clave", "yagoellen@correo.cl", "Yago", "Ellen", "Hombre", "Soy admin:)", 19, birthdayYago, "usuarioAdmin", projectsYago, projectsAdmin);


	}

}

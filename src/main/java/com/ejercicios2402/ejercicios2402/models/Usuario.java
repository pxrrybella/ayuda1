package com.ejercicios2402.ejercicios2402.models;
import java.util.ArrayList;
import java.util.HashMap;

public class Usuario {
    public String username;
    private String password;
    public String email;
    public String name;
    public String lastname;
    public String gender;
    //public String photo;
    public String descProfile;
    public Integer age;
    public HashMap<String, Integer> birthday;
    // Día -> 24
    // Mes -> 01
    // Año -> 2001
    public String rol;
    public ArrayList projectList;
    public ArrayList adminProjectsList;

    //CONSTRUCTORES
    public Usuario() {
    }

    public Usuario(String username, String password, String email, String name, String lastname, String gender,
            String descProfile, Integer age, HashMap<String, Integer> birthday, String rol, ArrayList projectList, ArrayList adminProjectsList) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.descProfile = descProfile;
        this.age = age;
        this.birthday = birthday;
        this.rol = rol;
        this.projectList = projectList;
        this.adminProjectsList = adminProjectsList;
    }

    //MÉTODOS
    public void createProject(){
        //TE VUELVE ADMIN DE ESTE PROYECTO
        //AÑADIR USUARIOS
        //PONER NOMBRE A PROYECTO
    }

    public void crearNuevaTarea(){
        //TAREAS DENTRO DE PROYECTO
    }

    

    

}

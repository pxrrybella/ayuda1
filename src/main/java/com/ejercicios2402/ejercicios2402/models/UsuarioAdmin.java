package com.ejercicios2402.ejercicios2402.models;

import java.util.ArrayList;
import java.util.HashMap;

public class UsuarioAdmin extends Usuario {


    public UsuarioAdmin() {
        super();
    }

    public UsuarioAdmin(String username, String password, String email, String name, String lastname, String gender,
            String descProfile, Integer age, HashMap<String, Integer> birthday, String rol, ArrayList projectList,
            ArrayList adminProjectsList) {
        super(username, password, email, name, lastname, gender, descProfile, age, birthday, rol, projectList, adminProjectsList);
    }


    public void createSprint(){
        //sakjdakdaaaa
    }

    public void activateSurvey(){
        //ksdjakjdhajhdka
    }
}

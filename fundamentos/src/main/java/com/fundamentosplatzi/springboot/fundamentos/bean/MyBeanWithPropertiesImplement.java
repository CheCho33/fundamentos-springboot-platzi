package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class MyBeanWithPropertiesImplement implements MyBeanWithProperties{
    private String nombre;
    private String apellido;

    @Autowired
    public MyBeanWithPropertiesImplement(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String fuction() {
        return nombre + "-"+ apellido;
    }
}

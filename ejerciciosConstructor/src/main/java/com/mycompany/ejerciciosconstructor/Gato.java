/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosconstructor;

/**
 *
 * @author erika
 */
public class Gato {

    private int edad;
    private String nombre;

    public Gato(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public void maullar() {
        System.out.println("miau");
    }

    public int laEdad() {
        System.out.println("La edad es: " + this.edad);
        return this.edad;
    }

    public int getEdad() {
        return this.edad;

    }
    
    public void setEdad (int edad) {
        this.edad=edad;
    }

  
   
    
}
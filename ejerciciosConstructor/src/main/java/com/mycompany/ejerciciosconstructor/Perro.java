/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosconstructor;

/**
 *
 * @author erika
 */
public class Perro {
private int edad;
private String nombre;

public Perro(String nombre,int edad) {
this.nombre = nombre;
this.edad = edad;
    
}

public void ladrar (){
    System.out.println("guaw");
}
}
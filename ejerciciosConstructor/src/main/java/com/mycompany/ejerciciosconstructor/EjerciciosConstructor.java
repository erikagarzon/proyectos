/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosconstructor;

/**
 *
 * @author erika
 */
public class EjerciciosConstructor {

    public static void main(String[] args) {
    System.out.println("Hello World!");
    Perro kogita= new Perro ("koga garzon", 1);
    kogita.ladrar();
    Gato shippo= new Gato  ("shippo garzon", 3); 
    shippo.maullar();
    int edadMetodoLaEdad;
    edadMetodoLaEdad= shippo.laEdad();
    System.out.println("La edad de shippo con metodo laEdad es: "+edadMetodoLaEdad);
    int edad;
    edad=shippo.getEdad();
    System.out.println("La edad de shippo con metodo getter es: "+edad);
    
    
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmodepilas;

import java.util.Stack;

/**
 *
 * @author erika
 */
public class GestionarPilas {
     private int id=0;
    private Stack<Contenedor> pilaDeEspera= new Stack<>();
     public void ingresarContenedor(String producto) {
         
        for (Stack<Contenedor> pila : AlgoritmoDePilas.pilas) {
            if (pila.size() < AlgoritmoDePilas.capContenedoresXPila) {
                this.id+=1;
                pila.push(new Contenedor(this.id,producto));
                System.out.println("Contenedor agregado a pila existente.");
                return;
            }
        }

        if (AlgoritmoDePilas.pilas.size() < AlgoritmoDePilas.numPilasPermitidas) {
            Stack<Contenedor> nuevaPila = new Stack<>();
            this.id+=1;
            nuevaPila.push(new Contenedor(this.id,producto));
            AlgoritmoDePilas.pilas.add(nuevaPila);
            System.out.println("Contenedor agregado en nueva pila.");
        } else {
            System.out.println("Error: No hay espacio en la bodega.");
        }
    }
     
     public void consultarPilas(){
           for (Stack<Contenedor> pila : AlgoritmoDePilas.pilas) {
               System.out.println("Pila: "+pila.toString());
           }
     }
     
     public void retirarContenedor(int id){
         boolean containsIdProd= false;
        for (Stack<Contenedor> pila : AlgoritmoDePilas.pilas) {
            containsIdProd=pila.stream().anyMatch(c -> c.getId() == id);
           if(containsIdProd){
                while (!pila.isEmpty()) {
                Contenedor tope = pila.pop(); // Sacamos el de arriba
                if (tope.getId() == id) {
                 System.out.println("Contenedor retirado: " + tope);
                break; // Lo encontramos, dejamos de recorrer
                } else {
                pilaDeEspera.push(tope); // Lo pasamos a la pila de espera
                }
                }
                while (!pilaDeEspera.isEmpty()) {
                pila.push(pilaDeEspera.pop()); 
                }
                return;
           }
        }
         if(!containsIdProd){
               System.out.println("Contenedor no encontrado");
         }
     }
}

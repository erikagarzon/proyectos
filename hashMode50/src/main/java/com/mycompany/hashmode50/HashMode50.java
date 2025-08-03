/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hashmode50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author erika
 */
public class HashMode50 {
    private static HashMap<Integer,Integer> tablaHash =new HashMap<>();

    public static void main(String[] args) {
         System.out.println("---------------------Caso Trabajo ---------------------");
        inicializadorDeDatos();
    
        tablaHash.entrySet()
         .stream()
         .sorted(Map.Entry.comparingByKey())  // Ordena por clave (hash)
         .forEach(entry -> System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue())); 
        
         casoReal();
    }
     private static void casoReal (){
         System.out.println(" ---------------------Caso Real ---------------------");
         List<Integer> valores = new ArrayList<>();
         Random random = new Random();
        // Genera 10,000 valores aleatorios entre 0 y 1,000,000
        for (int i = 0; i < 10000; i++) {
            valores.add(random.nextInt(1_000_000));
        }
        
        List<Integer> valoresHash=metodoHashMod50(valores);
        
     }
     
    private static void inicializadorDeDatos (){
        List<Integer> valores = new ArrayList<>();
        valores.add(40);
        valores.add(50);
        valores.add(62);
        valores.add(103);
        valores.add(204);
        valores.add(304);
        valores.add(328);
        List<Integer> valoresHash=metodoHashMod50(valores);
        
     }
    
    private static List<Integer> metodoHashMod50(List<Integer> valores){
        List<Integer> valoresHash= new ArrayList<>();
       valores.forEach(valor->{
           Integer valorHash= valor %50;
           Integer valorHashFinal;
           valorHashFinal=busquedaLinealColisiones(valoresHash,valorHash);
           valorHashFinal= busquedaBinariaColisiones(valoresHash, valorHash);
           valorHashFinal = busquedaColisionesMetodoHashMap(tablaHash, valorHash);
           valoresHash.add(valorHashFinal);
           tablaHash.put(valorHashFinal, valor);
           
       });
       
        return valoresHash;
    }

     private static Integer busquedaLinealColisiones(List<Integer> listaHash, Integer valorHash){
         long init= System.nanoTime();
         long timeProcess=0;
         for (int i=0; i<listaHash.size(); i++  ){
            if(listaHash.get(i).equals(valorHash)){
                timeProcess=System.nanoTime()-init;
                System.out.println("El tiempo en encontrar colisión LINEALMENTE es: "+ timeProcess +" ns para el hash " +(valorHash+1));
                return  valorHash+1;
            }
         }

         return valorHash;
     }
     
     
      private static Integer busquedaBinariaColisiones(List<Integer> listaHash, Integer valorHash){
         Collections.sort(listaHash); 
         //partimos de que la lista esta ordenada
       
         long timeProcess=0;
         int izquierda=0;
         int derecha= listaHash.size()-1 ;
         int medio=0;
         long init= System.nanoTime();
         while(izquierda<=derecha){
             medio= (izquierda+derecha)/2;
             if(valorHash.equals(listaHash.get(medio))){
                timeProcess=System.nanoTime()-init;
                System.out.println("El tiempo en encontrar colisión es por algoritmmo BINARIO es: "+ timeProcess +" ns para el hash " +(valorHash+1));
                return medio+1;
             }
             if(listaHash.get(medio)<valorHash){
                 izquierda= medio+1;
             }else{
                 derecha=medio-1;
             }
         }
    
         return valorHash;
     }
      
      private static Integer busquedaColisionesMetodoHashMap(HashMap<Integer,Integer> tablaHash, Integer valorHash){
         long timeProcess=0;
         long init= System.nanoTime();
         if(tablaHash.containsKey(valorHash)) {
           timeProcess=System.nanoTime()-init;
           System.out.println("El tiempo en encontrar colisión es por clase HASHMAP es: "+ timeProcess+" ns para el hash " +(valorHash+1));
           return valorHash+1;
         }
         return valorHash;
      }
}

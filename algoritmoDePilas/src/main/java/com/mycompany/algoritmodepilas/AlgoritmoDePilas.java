/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmodepilas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author erika
 */
public class AlgoritmoDePilas {
    public static List<Stack<Contenedor>> pilas =new ArrayList<>();
    public static int numPilasPermitidas;
    public static int capContenedoresXPila;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de pilas:");
        numPilasPermitidas= sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese capacidad de contenedores por pila:");
        capContenedoresXPila=sc.nextInt();
        sc.nextLine();
          int opcion;
        GestionarPilas gestionar = new GestionarPilas();

        do {
            System.out.println("==== MENÚ BODEGA ====");
            System.out.println("1. Ingresar contenedor");
            System.out.println("2. Retirar contenedor");
            System.out.println("3. Ver estado de la bodega");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String producto = sc.nextLine();
                    gestionar.ingresarContenedor(producto);
                    break;
                case 2:
                    System.out.print("Ingrese el ID del contenedor a retirar: ");
                    int id = sc.nextInt();
                     gestionar.retirarContenedor(id);
                    break;
                case 3:
                    gestionar.consultarPilas();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("❗ Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
          
        
      
    }
}

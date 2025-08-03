/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmodepilas;

/**
 *
 * @author erika
 */
public class Contenedor {


    
    private int id;
    private String producto;
    
    public Contenedor(int id, String producto) {
        this.id = id;
        this.producto = producto;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Contenedor{" + "id=" + id + ", producto=" + producto + '}';
    }


    
    
}

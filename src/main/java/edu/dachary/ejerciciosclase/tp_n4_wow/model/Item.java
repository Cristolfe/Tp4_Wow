/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.dachary.ejerciciosclase.tp_n4_wow.model;

/**
 *
 * @author wowle
 */
public class Item {
    private Articulo articulo;
    private int cantidad;

    public Item(Articulo articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }
    
     double calcularMonto() {
        double total=0;
        return  total += articulo.getPrecio() * cantidad;
        
    }
    
}

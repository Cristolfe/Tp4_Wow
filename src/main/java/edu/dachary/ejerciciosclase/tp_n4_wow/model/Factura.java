/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.dachary.ejerciciosclase.tp_n4_wow.model;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author wowle
 */
public class Factura {
    private LocalDate fecha;
    private long nroFactura;
    private char letra;
    private ArrayList<Item> items;

    public Factura(LocalDate fecha, long nroFactura, char letra) {
        this.fecha = fecha;
        this.nroFactura = nroFactura;
        this.letra = letra;
    }
    
    private void addItem(Item i){
        items.add(i);
    }
    
    public double informarTotalPagar(){
        double total=0;
        for(Item i: items){
            total +=i.calcularMonto();
        }
        return total;
    }
    
    
}

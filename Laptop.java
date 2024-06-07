/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalpro2;

/**
 *
 * @author leida
 */// se tuvo que crear una clase Laptop para tener en el sistema
public class Laptop implements IProducto {

    private String nombre;
    private String marca;
    private double precio;
    private int numPuertos;

    // Definir el constructor
    public Laptop(String nombre, String marca, double precio, int numPuertos) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.numPuertos = numPuertos;
    }

    // Implementar los métodos de la interfaz IProducto
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getModelo() {
        return nombre;
    }
//con esot imprimo los detales de los productos o de tmabien de los objetos laptop

    @Override
    public void imprimeDetallesProducto() {
        System.out.println("Laptop: " + nombre + ", Marca: " + marca + ", Precio: " + precio + ", Puertos: " + numPuertos);
    }
    // Métodos específicos de Laptop

    public int getNumPuertos() {
        return numPuertos;
    }

    public void setNumPuertos(int numPuertos) {
        this.numPuertos = numPuertos;
    }

}

package com.mycompany.finalpro2;

public class Telefono implements IProducto {

    private String nombre;
    private String marca;
    private double precio;

    //Definir el constructor
    public Telefono(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    //Implementar los métodos que son originario de IProduct
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
//con esot imprimo los detales de los productos o de tmabien de los objetos telefonos

    @Override
    public void imprimeDetallesProducto() {
        System.out.println("Telefono: " + nombre + ", Marrca: " + marca + ", Precio: " + precio);
    }
}

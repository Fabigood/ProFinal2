package com.mycompany.finalpro2;

public interface IProducto {

    String getModelo();

    String getMarca();

    String getNombre();

    double getPrecio();

    void imprimeDetallesProducto();

    void setNombre(String nombre);

    void setMarca(String marca);

    void setPrecio(double precio);

}

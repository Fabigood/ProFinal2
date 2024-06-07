package com.mycompany.finalpro2;

import java.util.ArrayList;
import java.util.List;

public class Tienda implements ITienda {
//alamcaenamiento de productos en lista

    private List<IProducto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }

    //Implementar los métodos provenietne de la Itienda
    @Override
    public void agregarProducto(IProducto producto) {
        productos.add(producto);
    }

    @Override
    public void listarProductos() {
        for (IProducto producto : productos) {
            producto.imprimeDetallesProducto();
        }
    }

    @Override
    public double obtenerPromedioPrecioProductos() {
        if (productos.isEmpty()) {
            return 0.0;
        }
        double suma = 0.0;
        for (IProducto producto : productos) {
            suma += producto.getPrecio();
        }
        return suma / productos.size();
    }

    @Override
    public IProducto obtenerProductoMasCostoso() {
        if (productos.isEmpty()) {
            return null;
        }
        IProducto masCostoso = productos.get(0);
        for (IProducto producto : productos) {
            if (producto.getPrecio() > masCostoso.getPrecio()) {
                masCostoso = producto;
            }
        }
        return masCostoso;
    }

    //Punto extra. El valor a buscar puede ser parte del nombre.
    @Override
    public boolean buscarProductoPorNombre(String nombre) {
        for (IProducto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }

        return false;
    }
}

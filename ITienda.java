package com.mycompany.finalpro2;

public interface ITienda {

    void agregarProducto(IProducto producto);

    void listarProductos();

    double obtenerPromedioPrecioProductos(); // SE DEBE AGREGAR ESTO PARA PODER OBTNER EL PROMEDIO DE PRECO DE PRODUCTODS

    IProducto obtenerProductoMasCostoso(); // SE TIENE ESTO PARA TENER EL PRODUCTO MAS COSTOSO

    boolean buscarProductoPorNombre(String nombre);//poder busacar por nombre un producto
}

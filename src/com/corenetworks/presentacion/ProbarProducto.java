package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;

public class ProbarProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto(3,"ordenadores",30);
        p1.compraProducto(5);
        System.out.println("Compra de 5 " + p1.getCantidadExistencia());
        p1.compraProducto(-5);
        System.out.println("Compra en negativo "+ p1.getCantidadExistencia());
        p1.ventaProducto(15);
        System.out.println("Venta de 15 " + p1.getCantidadExistencia());
        p1.ventaProducto(25);
        System.out.println("Venta de 25 " + p1.getCantidadExistencia());
        System.out.println(p1.toString());
    }
}

package com.corenetworks.presentacion;

import com.corenetworks.modelo.Cuenta;

public class ProbarCuenta {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Pedro Vazquez", 2_500);
        c1.ingresar(100);
        System.out.println("ingresar cantidad positiva " + c1.getCantidad());
        c1.ingresar(-100);
        System.out.println("ingresar cantidad negativa " + c1.getCantidad());
        c1.retirar(200);
        System.out.println("Retirar cantidad menor a cantidad -> "+ c1.getCantidad());
        c1.retirar(2_600);
        System.out.println("Retirar cantidad mayor a cantidad -> " + c1.getCantidad());
    }
}

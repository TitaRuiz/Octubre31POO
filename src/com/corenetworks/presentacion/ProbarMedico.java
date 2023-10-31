package com.corenetworks.presentacion;


import com.corenetworks.modelo.Medico;

import java.util.Scanner;

public class ProbarMedico {
    public static void main(String[] args) {
        Medico m1 = new Medico(123,"Carlos","Pelaez","1234X");
        System.out.println(m1.toString());
        //Recibir los datos por consola
        Scanner teclado = new Scanner(System.in);
        Medico m2 = new Medico();

        System.out.println("Escriba el id del médico ->");
        m2.setIdMedico(teclado.nextInt());
        teclado.nextLine();

        System.out.println("Escriba el nombre del médico ->");
        m2.setNombres(teclado.nextLine());

        System.out.println("Escriba el apellido del médico ->");
        m2.setApellidos(teclado.nextLine());

        System.out.println("Escriba el cmp ->");
        m2.setCmp(teclado.nextLine());

        System.out.println(m2.toString());
    }

}

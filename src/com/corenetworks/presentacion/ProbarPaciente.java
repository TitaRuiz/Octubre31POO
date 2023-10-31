package com.corenetworks.presentacion;

import com.corenetworks.modelo.Paciente;

public class ProbarPaciente {
    public static void main(String[] args) {
        Paciente p1 = new Paciente();
        p1.setIdPaciente(1);
        p1.setNombre("Juanito");
        p1.setApellido("López");
        p1.setDni("12345678A");
        p1.setDireccion("C/Real 25");
        p1.setTelefono("12345678");
        p1.setEmail("jlopez@gmail.com");

        System.out.println("id paciente "+ p1.getIdPaciente());

        System.out.println(p1.toString());

        //Instanciar otra vez la clase
        Paciente p2 = new Paciente(2,"Manolo",
                "Gonzalez","12345678B",
                "Calle real 55","67890987","mgonzalez@gmail.com");
        System.out.println(p2.toString());

    }
}

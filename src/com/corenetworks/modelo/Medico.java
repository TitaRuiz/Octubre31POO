package com.corenetworks.modelo;

public class Medico {

    private int idMedico;
    private String nombres;
    private String apellidos;
    private String cmp;

    @Override
    public String toString() {
        return "Medico{" +
                "idMedico=" + idMedico +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cmp='" + cmp + '\'' +
                '}';
    }

    public Medico() {
    }

    public Medico(int idMedico, String nombres, String apellidos, String cmp) {
        this.idMedico = idMedico;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cmp = cmp;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCmp() {
        return cmp;
    }

    public void setCmp(String cmp) {
        this.cmp = cmp;
    }
}

package com.corenetworks.modelo;

public class Cuenta {
    //1.Atributos
    private String titular;
    private double cantidad;
    //2. Metodos
    public void ingresar(double importe){
        if(importe >0){
            cantidad= cantidad + importe;
           // this.cantidad+=cantidad;
        }
    }

    public void retirar(double cantidad){
        if(cantidad<= this.cantidad){
            this.cantidad = this.cantidad - cantidad;
           // this.cantidad -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
    //3. Constructores

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }
    //4. Setters y Getters

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}

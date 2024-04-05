package com.softtek.modelo.Ejercicio2;

public class Empleado {
    protected String nombre;
    protected double sueldo;
    protected double PORCENTAJE = 0.75;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public double calcularNomina(){
        return sueldo * PORCENTAJE;
    }
}

package com.softtek.modelo.Ejercicio2;

public class Vendedor extends Empleado {
    private double ventas;
    private double comision;

    public Vendedor(String nombre, double sueldo, double ventas, double comision) {
        super(nombre, sueldo);
        this.ventas = ventas;
        this.comision = comision;
    }

    @Override
    public double calcularNomina() {
        return (super.calcularNomina() + (ventas * comision)) * PORCENTAJE;
    }
}

package com.softtek.modelo.Ejercicio2;

public class Gerente extends Empleado{

    private double bono;

    public Gerente(String nombre, double sueldo, double bono) {
        super(nombre, sueldo);
        this.bono = bono;
    }

    @Override
    public double calcularNomina() {
        return super.calcularNomina() + bono;
    }
}

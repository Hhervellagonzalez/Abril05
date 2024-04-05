package com.softtek.modelo.Ejercicio2;

public class Operador extends Empleado{
    private int piezas;
    private double incentivo;

    public Operador(String nombre, double sueldo, int piezas, double incentivo) {
        super(nombre, sueldo);
        this.piezas = piezas;
        this.incentivo = incentivo;
    }

    @Override
    public double calcularNomina() {
        return (super.calcularNomina() + (piezas * incentivo))* PORCENTAJE;
    }
}

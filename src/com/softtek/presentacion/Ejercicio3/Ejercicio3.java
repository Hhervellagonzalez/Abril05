package com.softtek.presentacion.Ejercicio3;

import com.softtek.modelo.Ejercicio3.Cuadrado;
import com.softtek.modelo.Ejercicio3.Figura;
import com.softtek.modelo.Ejercicio3.Triangulo;

public class Ejercicio3 {
    public static void main(String[] args) {
        Cuadrado cPeque = new Cuadrado(0,0, 0);
        cPeque.setX(1);
        cPeque.setY(1);
        cPeque.setLado(5);
        Cuadrado cMediano = new Cuadrado(5,5,10);

        Triangulo tPeque = new Triangulo(0,0,0,0);
        tPeque.setX(10);
        tPeque.setY(10);
        tPeque.setBase(2);
        tPeque.setAltura(3);
        Triangulo tMediano = new Triangulo(12,12,4,5);


        Figura[] figuras = {cPeque,cMediano,tPeque,tMediano};

        for (Figura figura: figuras) {
            System.out.println(figura.calcularArea());
        }
    }
}

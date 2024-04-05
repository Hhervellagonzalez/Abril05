package com.softtek.presentacion.Ejercicio1;

import com.softtek.modelo.Ejercicio1.Producto;
import com.softtek.modelo.Ejercicio1.ProductoPerecedero;

import java.time.LocalDate;

public class Ejercicio1 {
    public static void main(String[] args) {
        LocalDate fabricacion = LocalDate.of(2024, 2,10);
        LocalDate caducidad = LocalDate.of(2024, 4,22);

        Producto p1 = new Producto("Manzana", 10, 2);
        System.out.println("Cantidad a pagar de el producto "+ p1.getNombre() +": " +p1.cantidadAPagar());
        ProductoPerecedero pp1 = new ProductoPerecedero("manzana" ,10,2,fabricacion,caducidad);

        System.out.println("Tiempo de consumicion: " + pp1.tiempoConsumicion());
    }
}

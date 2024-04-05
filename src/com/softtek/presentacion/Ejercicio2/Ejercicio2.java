package com.softtek.presentacion.Ejercicio2;

import com.softtek.modelo.Ejercicio2.Empleado;
import com.softtek.modelo.Ejercicio2.Gerente;
import com.softtek.modelo.Ejercicio2.Operador;
import com.softtek.modelo.Ejercicio2.Vendedor;

public class Ejercicio2 {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("pepe", 2200.0);
        System.out.println("Nomina de el empleado : " + e1.calcularNomina());

        Gerente g1 = new Gerente("paco", 2200.0, 500.0);
        System.out.println("Nomina de el Gerente : " + g1.calcularNomina());

        Vendedor v1 = new Vendedor("Ana", 2200.0, 20, 5);
        System.out.println("Nomina del vendedor : " + v1.calcularNomina());

        Operador op1 = new Operador("Pablo" , 2200 , 15, 4);
        System.out.println("Nomina de el Operador : " + op1.calcularNomina());
    }
}

package com.softtek.presentacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
    //EJERCICIOS JAVA_TIME
        //1
        LocalDate fechainicio = LocalDate.of(2024,4,2);
        LocalDate suma = fechainicio.plusDays(10);
        System.out.println("a = " +suma);
        //2
        LocalDateTime hoy = LocalDateTime.now();
        System.out.println("b = "+hoy);
        //3
        LocalDateTime horaAustralia = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println("c = "+horaAustralia);
        //4
        LocalDate dia100 = LocalDate.ofYearDay(2024, 100);
        System.out.println("d = "+dia100);
        //5
        LocalDate navidad = LocalDate.of(2024, 12,25);
        LocalDate nocheVieja = LocalDate.of(2024,12,31);
        System.out.println(" e = ");
        System.out.println(navidad.isAfter(nocheVieja));
        System.out.println(nocheVieja.isBefore(navidad));
        //6
        LocalDate fecha1 = LocalDate.of(2024,3,15);
        LocalDate fechaResultante = fecha1.plusMonths(15);
        System.out.println("f = "+fechaResultante);
        //7
        LocalDate trabajador = LocalDate.of(2012,7,6);
        LocalDate fechaHoy = LocalDate.now();
        Period periodo = Period.between(trabajador,fechaHoy);
        System.out.println("g = "+periodo);
        //8
        LocalDate nacimiento = LocalDate.of(2007, 8, 7);
        Period period = Period.between(nacimiento, fechaHoy);
        int edad = period.getYears();
        System.out.println("h = " + edad + " Años");
        //9
        LocalDate fechaEntrega = LocalDate.of(2024, 10,2);
        LocalDate inicio = fechaEntrega.minusDays(200);
        System.out.println("i = " + inicio);
        //10
        LocalDate inicio2 = LocalDate.of(2024,3,15);
        LocalDate fin = LocalDate.of(2024,10,20);
        Period peridoEntrega = Period.between(inicio2, fin);
        System.out.println("j = " + peridoEntrega.getDays()+ " Dias, " +peridoEntrega.getMonths() +" meses." );
    }
}

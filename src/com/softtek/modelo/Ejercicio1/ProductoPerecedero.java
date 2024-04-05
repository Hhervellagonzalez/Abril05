package com.softtek.modelo.Ejercicio1;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto{

    private LocalDate fCaducidad;
    private LocalDate fFabricacion;

    public ProductoPerecedero(String nombre, int cantidad, double pvp, LocalDate fCaducidad, LocalDate fFabricacion) {
        super(nombre, cantidad, pvp);
        this.fCaducidad = fCaducidad;
        this.fFabricacion = fFabricacion;
    }

    public long tiempoConsumicion(){
        long consummicion;

        consummicion = fFabricacion.until(LocalDate.now()).getDays();

        return consummicion;
    }
}

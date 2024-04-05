package com.softtek.modelo.Ejercicio4;

public class Bateria extends InstrumentoMusical{
    private int noPlatillos;

    public Bateria(String marca, int noPlatillos) {
        super(marca);
        this.noPlatillos = noPlatillos;
    }

    @Override
    public String emitirSonido() {
        return "Sonido de bateria";
    }
}

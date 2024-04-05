package com.softtek.modelo.Ejercicio4;

public class InstrumentoMusical {
    protected String marca;

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }

    public String emitirSonido(){
        return "Sonido";
    }
}

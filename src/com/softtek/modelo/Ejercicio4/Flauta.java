package com.softtek.modelo.Ejercicio4;

public class Flauta extends InstrumentoMusical{
    private String material;

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    @Override
    public String emitirSonido() {
        return "Sonido de Flauta";
    }
}

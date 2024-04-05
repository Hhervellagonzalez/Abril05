package com.softtek.modelo.Ejercicio4;

public class Guitarra extends InstrumentoMusical{
    private String tipoCuerdas;

    public Guitarra(String marca, String tipoCuerdas) {
        super(marca);
        this.tipoCuerdas = tipoCuerdas;
    }

    @Override
    public String emitirSonido() {
        return "Sonido de Guitarra";
    }
}

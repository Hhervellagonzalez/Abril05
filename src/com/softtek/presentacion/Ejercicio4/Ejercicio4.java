package com.softtek.presentacion.Ejercicio4;

import com.softtek.modelo.Ejercicio4.Bateria;
import com.softtek.modelo.Ejercicio4.Flauta;
import com.softtek.modelo.Ejercicio4.Guitarra;
import com.softtek.modelo.Ejercicio4.InstrumentoMusical;

public class Ejercicio4 {
    public static void main(String[] args) {
        Guitarra guido = new Guitarra("Ibanez", "Acusticas");
        Bateria bataca = new Bateria( "Pearl",3);
        Flauta ham = new Flauta("yamaha", "Madera");

        InstrumentoMusical[] instrumentos = {guido,bataca,ham};

        for (InstrumentoMusical instrumento: instrumentos) {
            System.out.println(instrumento.emitirSonido());
        }
    }
}

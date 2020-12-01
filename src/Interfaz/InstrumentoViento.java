/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author Alex
 */
public abstract class InstrumentoViento extends Object implements InstrumentoMusical {

    public InstrumentoViento() {
    }
    public void tocar(){
        System.out.println("Estoy tocando un instrumento de viento");
    }
    public void afinar(){
        System.out.println("Estoy afinando un instrumento de viento");
    }
    /** @return Tipo de instrumento */
    public String tipoInstrumento(){
        return "Instrumento de viento";
    }

    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
}
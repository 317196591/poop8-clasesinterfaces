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
public class Flauta extends InstrumentoViento{

    /** Constructor sin parámetros */
    public Flauta() {
    }
    /** @return Tipo del instrumento */
    public String tipoInstrumento(){
        return "Flauta";
    }

    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    
}

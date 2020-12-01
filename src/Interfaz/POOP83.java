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
public class POOP83 {
    public static void main(String[] args){
        //InstrumentoMusical instrumento = new InstrumentoMusical();
        System.out.println("Actividad 4");
        InstrumentoMusical instrumento;
        instrumento = new Flauta();
        instrumento.tocar();
        instrumento.afinar();
        System.out.println(instrumento.tipoInstrumento());
        System.out.println(instrumento);
    }
}

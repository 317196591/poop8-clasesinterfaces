/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Alex
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println("Actividad 1:");
        Poligono p1 = new Poligono();
        /* Las clases base pueden comportarse como sus subclases */
        System.out.println("Poligono: "+p1);
        Object objeto = new Object();
        System.out.println("Object: "+objeto);
        objeto = p1;
        System.out.println("Object como poligono: "+p1);
        Object objeto2 = p1;
        System.out.println("Object2: "+objeto2);
        Object objeto3 = new Poligono();
        System.out.println("Object3: "+objeto3);
        System.out.println("Actividad 2:");
        p1 = new Triangulo();
        System.out.println(p1);
        selectorPoligonos(p1);
        p1 = new Cuadrilatero();
        System.out.println(p1);
        selectorPoligonos(p1);
        Poligono p2 = new Poligono();
        System.out.println(p2);
        selectorPoligonos(p2);
    }
    public static void selectorPoligonos(Poligono p1){
        if(p1 instanceof Triangulo){
            System.out.println("El objeto es un triangulo");
        }
        else if (p1 instanceof Cuadrilatero){
            System.out.println("El objeto es un cuadrilatero");
        }
        else if (p1 instanceof Poligono){
            System.out.println("El objeto es un poligono");
        }
        else{
            System.out.println("El objeto es otra figura");
        }
    }
}

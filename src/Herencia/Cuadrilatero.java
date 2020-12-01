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
public class Cuadrilatero extends Poligono {
    private float a,b,base,altura;
    private int alpha,beta;

    /** Constructor sin parámetros */
    public Cuadrilatero() {
    }
    /** Constructor con parámetros */
    public Cuadrilatero(float a, float b, float base, float altura, int alpha, int beta) {
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
        this.alpha = alpha;
        this.beta = beta;
    }
    /** @return Lado A */
    public float getA() {
        return a;
    }
    /** Lado A */
    public void setA(float a) {
        this.a = a;
    }
    /** @return Lado B */
    public float getB() {
        return b;
    }
    /** Lado B */
    public void setB(float b) {
        this.b = b;
    }
    /** @return Base del cuadrilátero */
    public float getBase() {
        return base;
    }
    /** Base del cuadrilátero */
    public void setBase(float base) {
        this.base = base;
    }
    /** @return Altura del cuadrilátero */
    public float getAltura() {
        return altura;
    }
    /** Altura del cuadrilátero */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /** @return Ángulo alfa */
    public int getAlpha() {
        return alpha;
    }
    /** Ángulo alfa */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    /** @return Ángulo beta */
    public int getBeta() {
        return beta;
    }
    /** Ángulo beta */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    @Override
    /** @return Datos del cuadrilátero */
    public String toString() {
        return "Cuadrilatero{" + "a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + ", alpha=" + alpha + ", beta=" + beta + '}';
    }
    
}

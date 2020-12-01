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
public class Triangulo extends Poligono {
    private float a,b,c,base,altura;
    private int alpha,beta,gamma;
    /** Constructor sin parámetros */
    public Triangulo() {
    }
    /** Constructor con parámetros */
    public Triangulo(float a, float b, float c, float base, float altura, int alpha, int beta, int gamma) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
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
    /** @return Lado C */
    public float getC() {
        return c;
    }
    /** Lado C */
    public void setC(float c) {
        this.c = c;
    }
    /** @return Base del triángulo */
    public float getBase() {
        return base;
    }
    /** Base del triángulo */
    public void setBase(float base) {
        this.base = base;
    }
    /** @return Altura del triángulo */
    public float getAltura() {
        return altura;
    }
    /** Altura del triángulo */
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
    /** @return Ángulo gamma */
    public int getGamma() {
        return gamma;
    }
    /** Ángulo gamma */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    @Override
    /** Datos del triángulo */
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + ", alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + '}';
    }
    
}

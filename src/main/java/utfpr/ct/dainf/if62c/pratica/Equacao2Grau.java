/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author fernando
 * @param <a> Tipo generico do coeficiente a
 * @param <b> Tipo generico do coeficiente b
 * @param <c> Tipo generico do coeficiente c
 */
public class Equacao2Grau<a extends Number,b extends Number,c extends Number> {
    private a a;
    private b b;
    private c c;
    
    public Equacao2Grau(a a,b b,c c){
        if(a.doubleValue() == 0){
            throw new RuntimeException("O coeficiente 'a' não pode ser zero");
        }
        else{
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public double getRaiz1(){
        if((b.doubleValue()*b.doubleValue()-4*a.doubleValue()*c.doubleValue()) < 0.0){
            throw new RuntimeException(toString()+" não possue raizes reais");
        }
        return ((-1*b.doubleValue()+Math.sqrt(b.doubleValue()*b.doubleValue()
                -4*a.doubleValue()*c.doubleValue()))/(2*a.doubleValue()));
    }
    
    public double getRaiz2(){
        if((b.doubleValue()*b.doubleValue()-4*a.doubleValue()*c.doubleValue()) < 0.0){
            throw new RuntimeException(toString()+" não possue raizes reais");
        }
        return ((-1*b.doubleValue()-Math.sqrt(b.doubleValue()*b.doubleValue()
                -4*a.doubleValue()*c.doubleValue()))/(2*a.doubleValue()));
    }

    public a getA() {
        return a;
    }

    public b getB() {
        return b;
    }

    public c getC() {
        return c;
    }

    public void setA(a a) {
        this.a = a;
    }

    public void setB(b b) {
        this.b = b;
    }

    public void setC(c c) {
        this.c = c;
    }
    
    @Override
    public String toString(){
        return String.format("equação %.2f*x^2+%.2f*x+%.2f",a.doubleValue(),b.doubleValue(),c.doubleValue());
    }
}

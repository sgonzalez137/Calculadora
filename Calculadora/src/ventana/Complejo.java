/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

public class Complejo {

    private double real;
    private double imaginario;

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
    
    public Complejo() {
        this.real = 0;
        this.imaginario = 0;
    }
    
    public Complejo(Complejo c) {
        this.real = c.real;
        this.imaginario = c.imaginario;
    }
    

    
    
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    public Complejo suma(Complejo c) {
        Complejo sum = new Complejo();
        sum.real = c.real - this.real;
        sum.imaginario = c.imaginario - this.imaginario;
        return sum;
    }

    public Complejo resta(Complejo c) {
        Complejo res = new Complejo();
        res.real = c.real - this.real;
        res.imaginario = c.imaginario - this.imaginario;
        return res;
    }

    public Complejo conjugado(Complejo c) {
        Complejo conj = new Complejo();
        conj.real = this.real;
        conj.imaginario = -this.imaginario;
        return conj;
    }

    public Complejo multiplicacion(Complejo c) {
        Complejo mult = new Complejo();
        mult.real = ((c.real * this.real) - (c.imaginario * this.imaginario));
        mult.imaginario = ((c.real * this.imaginario) + (this.real * c.imaginario));
        return mult;
    }

    public Complejo division(Complejo c) {
        Complejo div = new Complejo();
        div.imaginario = (((c.imaginario * this.real) - (c.real * this.imaginario)) / ((this.real * this.real) + (this.imaginario * this.imaginario)));
        div.real = (((this.real * c.real) + (this.imaginario * c.imaginario) / (this.real * this.real) + (this.imaginario * this.imaginario)));
        return div;
    }
    public double norma(Complejo c){
        double nom;
        nom=(Math.sqrt((Math.pow(c.real,2))+(Math.pow(c.imaginario,2))));
        return nom;
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodeapuestas;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Dado {
    private int numero;
    private int caras;
    public Dado(){
        this.caras = 6;
        this.numero = 0;
    }
    public Dado(int caras){
        this.caras = caras;
        this.numero = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }   
    public void soltar(){
        Random r = new Random();
        this.numero = 1 + r.nextInt(this.caras);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodeapuestas;

/**
 *
 * @author Estudiantes
 */
public class LogicaJuego {
    private Dado dado1;
    private Dado dado2;
    private Participante parA;
    private int valApostado;
    
    private int prevDado;
    private int conLanza;
    private int conEstado;
    
    
    public LogicaJuego(Participante parA, int valApostado){
        this.parA = parA;
        this.valApostado = valApostado;
        this.dado1 = new Dado();
        this.dado2 = new Dado();
    }
    
    public void lanzar(){
        this.dado1.soltar();
        this.dado2.soltar();
        this.conLanza++;
        int sumDado = this.dado1.getNumero() + this.dado2.getNumero();
        if((sumDado == 7 || sumDado == 11) && this.conLanza == 1){
            
            this.conEstado = 1;
        }
        else if((sumDado == 2 || sumDado == 3 || sumDado == 12) && this.conLanza == 1){
            //Pierde
            this.valApostado = -this.valApostado;
            this.conEstado = 2;
        }
        else if(this.conLanza == 1){
            this.prevDado = sumDado; 
        }
        else{
            if(sumDado == this.prevDado){
                this.conEstado = 1;
            }
            else if(sumDado == 7){
                this.valApostado = -this.valApostado;
                this.conEstado = 2;
            }        
        }
    }
    public void terminarJuegoAntes(){
        this.valApostado = -this.valApostado;
        this.conEstado = 2;
    }

    public Dado getDado1() {
        return dado1;
    }

    public Dado getDado2() {
        return dado2;
    }

    public int getValApostado() {
        return valApostado;
    }

    public Participante getParA() {
        return parA;
    }

    public int getconEstado() {
        return conEstado;
    }
    
    
    
}

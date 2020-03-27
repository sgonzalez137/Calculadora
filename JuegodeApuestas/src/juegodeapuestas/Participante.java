/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodeapuestas;

import java.io.Serializable;

/**
 *
 * @author Estudiantes
 */
public class Participante implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String usuario;
    private String pass;
    private int saldo;
    private int juegosGanados;    
    private int juegosPerdidos;
    public Participante(){
        this.nombre = "";
        this.usuario = "";
        this.pass = "";
        this.saldo = 0;
        this.juegosGanados = 0;
        this.juegosPerdidos = 0;
    }
    public Participante(String usuario, String pass, String nombre, int saldo,int juegosGanados, int juegosPerdidos ){
        this.nombre = nombre;
        this.usuario = usuario;
        this.pass = pass;
        this.saldo = saldo;
        this.juegosGanados = juegosGanados;
        this.juegosPerdidos = juegosPerdidos;
    }    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getJuegosGanados() {
        return juegosGanados;
    }

    public void setJuegosGanados(int juegosGanados) {
        this.juegosGanados = juegosGanados;
    }

    public int getJuegosPerdidos() {
        return juegosPerdidos;
    }

    public void setJuegosPerdidos(int juegosPerdidos) {
        this.juegosPerdidos = juegosPerdidos;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nUsuario: " + usuario + "\nPass: " + pass + "\nSaldo: " + String.valueOf(saldo) + "\nJuego Ganados: " + String.valueOf(juegosGanados) + "\nJuegos Perdidos: " + String.valueOf(juegosPerdidos);
    }
}

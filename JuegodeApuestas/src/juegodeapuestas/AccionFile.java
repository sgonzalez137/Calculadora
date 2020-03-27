/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodeapuestas;

/**
 *
 * @author Bryant
 */
public class AccionFile {
    private Boolean Estado;
    private String Situacion;
    private Participante par;

    public AccionFile(){
        this.Estado = false;
        this.Situacion = "";
        this.par = new Participante();
    }
    public AccionFile(Boolean respuesta, String mensaje){
        this.Estado = respuesta;
        this.Situacion = mensaje;
        this.par = new Participante();
    }
    public AccionFile(Boolean respuesta, String mensaje, Participante par){
        this.Estado = respuesta;
        this.Situacion = mensaje;
        this.par = par;
    }
    
    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }

    public String getSituacion() {
        return Situacion;
    }

    public void setSituacion(String Situacion) {
        this.Situacion = Situacion;
    }

    public Participante getPar() {
        return par;
    }

    public void setPar(Participante par) {
        this.par = par;
    }
}

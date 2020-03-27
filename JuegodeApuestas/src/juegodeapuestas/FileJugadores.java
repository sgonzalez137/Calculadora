/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodeapuestas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Bryant
 */
public class FileJugadores {

    private String Envio;
    private File Info;

    public FileJugadores() {
        this.Envio = "InfoJugadores.txt";
        this.Info = new File(this.Envio);
        this.crearArchivo();
    }

    private void crearArchivo() {
        try {
            Info.createNewFile();
        } catch (IOException ex) {
            System.out.println("An error occurred." + ex);
        }
    }

    public AccionFile crearJugador(Participante ParticipantesReg) {
        AccionFile Acc = new AccionFile(false, "Error al crear jugador");
        ArrayList<Participante> listaPar = new ArrayList<>();
        try {
            FileInputStream f1 = new FileInputStream(this.Info);
            ObjectInputStream o1 = new ObjectInputStream(f1);
            if (f1.available() > 0) {
                @SuppressWarnings("unchecked")
                ArrayList<Participante> ParticipantesAn = (ArrayList<Participante>) o1.readObject();
                for (Participante par : ParticipantesAn) {
                    if (par.getUsuario().equals(ParticipantesReg.getUsuario())) {
                        Acc.setSituacion("Error el usuario ya existe!");
                        return Acc;
                    } else {
                        listaPar.add(par);
                    }
                }
            }
            o1.close();
            f1.close();

        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Error clase no encontrada");
        } catch (Exception e) {
            System.out.println("Error desconocido");
        }
        
        try {
            FileOutputStream f2 = new FileOutputStream(this.Info);
            ObjectOutputStream o2 = new ObjectOutputStream(f2);

            // Write objects to file
            listaPar.add(ParticipantesReg);
            o2.writeObject(listaPar);

            o2.close();
            f2.close();
            Acc.setEstado(true);

            return Acc;
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        } catch (IOException e) {
            System.out.println(e);
        }
        return Acc;
    }
    public AccionFile iniciarSesion(String usuario, String pass){
        AccionFile Acc = new AccionFile();
        try {
            FileInputStream f1 = new FileInputStream(this.Info);
            ObjectInputStream o1 = new ObjectInputStream(f1);
            if (f1.available() > 0) {
                @SuppressWarnings("unchecked")
                ArrayList<Participante> ParticipantesAn = (ArrayList<Participante>) o1.readObject();
                for (Participante par : ParticipantesAn) {
                    if (par.getUsuario().equals(usuario) && par.getPass().equals(pass)) {
                        Acc.setPar(par);
                        Acc.setEstado(true);
                        return Acc;
                    } 
                }
            }
            o1.close();
            f1.close();
            Acc.setSituacion("Error no se ha encontrado el usuario");
            Acc.setEstado(false);
            return Acc;
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Error clase no encontrada");
        }

        
        return Acc;
    }
    public AccionFile terminarJuego(LogicaJuego juego) {
        AccionFile Acc = new AccionFile(false, "Error al modificar Saldo");
        ArrayList<Participante> listaPar = new ArrayList<>();
        try {
            FileInputStream f1 = new FileInputStream(this.Info);
            ObjectInputStream o1 = new ObjectInputStream(f1);
            if (f1.available() > 0) {
                @SuppressWarnings("unchecked")
                ArrayList<Participante> ParticipantesAn = (ArrayList<Participante>) o1.readObject();
                ParticipantesAn.forEach((par) -> {
                    if (par.getUsuario().equals(juego.getParA().getUsuario())) {
                        par.setSaldo(juego.getParA().getSaldo() + juego.getValApostado());
                        if(juego.getconEstado() == 1){
                            par.setJuegosGanados(juego.getParA().getJuegosGanados() + 1);
                        }
                        else if(juego.getconEstado() == 2){
                            par.setJuegosPerdidos(juego.getParA().getJuegosPerdidos()+ 1);
                        }
                        listaPar.add(par);
                        Acc.setPar(par);
                        
                    } else {
                        listaPar.add(par);
                    }
                });
            }
            o1.close();
            f1.close();

        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Error clase no encontrada");
        }
        try {
            FileOutputStream f2 = new FileOutputStream(this.Info);
            ObjectOutputStream o2 = new ObjectOutputStream(f2);

            // Write objects to file
            
            o2.writeObject(listaPar);

            o2.close();
            f2.close();
            Acc.setEstado(true);

            return Acc;
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        } catch (IOException e) {
            System.out.println(e);
        }
        return Acc;
    }
    public AccionFile cambiarSaldo(Participante ParA, int nuevoSaldo) {
        AccionFile Acc = new AccionFile(false, "Error al modificar saldo");
        ArrayList<Participante> listaPar = new ArrayList<>();
        try {
            FileInputStream f1 = new FileInputStream(this.Info);
            ObjectInputStream o1 = new ObjectInputStream(f1);
            if (f1.available() > 0) {
                @SuppressWarnings("unchecked")
                ArrayList<Participante> ParticipantesAn = (ArrayList<Participante>) o1.readObject();
                ParticipantesAn.forEach((par) -> {
                    if (par.getUsuario().equals(ParA.getUsuario())) {
                        par.setSaldo(nuevoSaldo);
                        listaPar.add(par);
                        Acc.setPar(par);
                        
                    } else {
                        listaPar.add(par);
                    }
                });
            }
            o1.close();
            f1.close();

        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Error clase no encontrada");
        }
        try {
            FileOutputStream f2 = new FileOutputStream(this.Info);
            ObjectOutputStream o2 = new ObjectOutputStream(f2);

            // Write objects to file
            
            o2.writeObject(listaPar);

            o2.close();
            f2.close();
            Acc.setEstado(true);

            return Acc;
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        } catch (IOException e) {
            System.out.println(e);
        }
        return Acc;
    }

}

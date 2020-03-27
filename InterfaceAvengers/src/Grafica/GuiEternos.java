/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author esjae
 */
public class GuiEternos extends JFrame implements ActionListener{
    private JPanel VEternos;
    private ImageIcon IEternos2;
    private JLabel lbIEternos;
    private int WIDTH2=300, HEIGHT2=200;
    private JButton Atacar;
    private JButton Bloquear;
    private JButton Destruir;
    private JButton Esquivar;
    private JButton Volver1;
    private ImageIcon EXIT;
    public GuiEternos(){
        iniciarComponentes2();
        Acciones2(); 
        this.setTitle("Super Heroes");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void iniciarComponentes2(){
        crearPanel2();
        colocarImagen2();
        colocarLabel2();
        colocarBotones2();
    }
    public void Acciones2(){
        Atacar.setActionCommand("Atacar");
        Atacar.addActionListener(this);
        
        Bloquear.setActionCommand("Bloquear");
        Bloquear.addActionListener(this);
        
        Destruir.setActionCommand("Destruir");
        Destruir.addActionListener(this);
        
        Esquivar.setActionCommand("Esquivar");
        Esquivar.addActionListener(this);
        
        Volver1.setActionCommand("Volver1");
        Volver1.addActionListener(this);
    }
    public void crearPanel2(){
        VEternos= new JPanel();
        this.getContentPane().setLayout(null);
        this.setBounds(500, 50, 790, 530);
        this.getContentPane().add(VEternos);
        VEternos.setBounds(0, 0, 790, 530);
        VEternos.setBackground(Color.BLACK);
        VEternos.setLayout(null);
    }
    public void colocarLabel2(){
        lbIEternos = new JLabel();
        lbIEternos.setBounds(250,50,WIDTH2,HEIGHT2);
        lbIEternos.setIcon(new ImageIcon(IEternos2.getImage().getScaledInstance(lbIEternos.getWidth(),lbIEternos.getHeight(), Image.SCALE_SMOOTH)));
        VEternos.add(lbIEternos);
    }
    public void colocarImagen2(){
        IEternos2 = new ImageIcon("src/Imagenes/Eternos.jpg");
        EXIT = new ImageIcon("src/Imagenes/EXIT.jpg");
    }
    public void colocarBotones2(){
        
        Atacar = new JButton();
        Atacar.setText("Atacar");
        Atacar.setBounds(50, 350, 150, 70);
        Atacar.setEnabled(true);
        Atacar.setForeground(Color.WHITE);
        Atacar.setFont(new Font("cooper black", 3, 20));
        Atacar.setBackground(Color.BLACK);
        VEternos.add(Atacar);
        
        Bloquear = new JButton();
        Bloquear.setText("Bloquear");
        Bloquear.setBounds(220, 350, 150, 70);
        Bloquear.setEnabled(true);
        Bloquear.setForeground(Color.WHITE);
        Bloquear.setFont(new Font("cooper black", 3, 20));
        Bloquear.setBackground(Color.BLACK);
        VEternos.add(Bloquear);
        
        Destruir = new JButton();
        Destruir.setText("Destruir");
        Destruir.setBounds(390, 350, 150, 70);
        Destruir.setEnabled(true);
        Destruir.setForeground(Color.WHITE);
        Destruir.setFont(new Font("cooper black", 3, 20));
        Destruir.setBackground(Color.BLACK);
        VEternos.add(Destruir);
        
        Esquivar = new JButton();
        Esquivar.setText("Esquivar");
        Esquivar.setBounds(560, 350, 150, 70);
        Esquivar.setEnabled(true);
        Esquivar.setForeground(Color.WHITE);
        Esquivar.setFont(new Font("cooper black", 3, 20));
        Esquivar.setBackground(Color.BLACK);
        VEternos.add(Esquivar);
        
        Volver1 = new JButton();
        Volver1.setBounds(600, 150, 70, 70);
        Volver1.setIcon(new ImageIcon(EXIT.getImage().getScaledInstance(Volver1.getWidth(), Volver1.getHeight(), Image.SCALE_SMOOTH)));
        Volver1.setBackground(Color.BLACK);
        VEternos.add(Volver1);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Volver1")){
            this.dispose();
            GuiIntroRazas eter = new GuiIntroRazas();
            eter.setVisible(true);
        }
        else if(e.getActionCommand().equals("Atacar")){
            JOptionPane.showMessageDialog(null, "Con su fuerza titanica, embiste hacia el oponente, causandole un gran daño", "Atacar", JOptionPane.DEFAULT_OPTION);
        }
        else if(e.getActionCommand().equals("Bloquear")){
            JOptionPane.showMessageDialog(null, "Usa su alta resistencia y fuerza para poder parar los ataques del rival", "Bloquear", JOptionPane.DEFAULT_OPTION);
        }
        else if(e.getActionCommand().equals("Destruir")){
            JOptionPane.showMessageDialog(null, "Usando las gemas del infinito, puede con un chasquido de sus dedos eliminar a la mitad del universo", "Destruir", JOptionPane.DEFAULT_OPTION);
        }
        else if(e.getActionCommand().equals("Esquivar")){
            JOptionPane.showMessageDialog(null, "Por su gran experiencia en batalla, es capaz de esquivar los golpes de sus oponentes", "Esquivar", JOptionPane.DEFAULT_OPTION);
        }
    }
    
}

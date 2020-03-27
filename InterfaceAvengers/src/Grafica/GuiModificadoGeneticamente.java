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
public class GuiModificadoGeneticamente extends JFrame implements ActionListener{

    private JPanel VModificadoGeneticamente;
    private ImageIcon IModificadoGeneticamente;
    private JLabel lbIModificadoGentenicamente;
    private int WIDTH2=300, HEIGHT2=200;
    private JButton Bloquear;
    private JButton Pegar;
    private JButton Esquivar;
    private JButton PredecirGolpes;
    private JButton Volver4;
    private ImageIcon EXIT;
    public GuiModificadoGeneticamente(){
        iniciarComponentes4();
        Acciones4(); 
        this.setTitle("Super Heroes");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void iniciarComponentes4(){
        crearPanel4();
        colocarImagen4();
        colocarLabel4();
        colocarBotones4();
    }
    public void Acciones4(){
        Bloquear.setActionCommand("Bloquear");
        Bloquear.addActionListener(this);
        
        Pegar.setActionCommand("Pegar");
        Pegar.addActionListener(this);
        
        Esquivar.setActionCommand("Esquivar");
        Esquivar.addActionListener(this);
        
        PredecirGolpes.setActionCommand("PredecirGolpe");
        PredecirGolpes.addActionListener(this);
        
        Volver4.setActionCommand("Volver4");
        Volver4.addActionListener(this);
    }
    public void crearPanel4(){
        VModificadoGeneticamente= new JPanel();
        this.getContentPane().setLayout(null);
        this.setBounds(500, 50, 790, 530);
        this.getContentPane().add(VModificadoGeneticamente);
        VModificadoGeneticamente.setBounds(0, 0, 790, 530);
        VModificadoGeneticamente.setBackground(Color.BLACK);
        VModificadoGeneticamente.setLayout(null);
    }
    public void colocarLabel4(){
        lbIModificadoGentenicamente = new JLabel();
        lbIModificadoGentenicamente.setBounds(250,50,WIDTH2,HEIGHT2);
        lbIModificadoGentenicamente.setIcon(new ImageIcon(IModificadoGeneticamente.getImage().getScaledInstance(lbIModificadoGentenicamente.getWidth(),lbIModificadoGentenicamente.getHeight(), Image.SCALE_SMOOTH)));
        VModificadoGeneticamente.add(lbIModificadoGentenicamente);
    }
    public void colocarImagen4(){
        IModificadoGeneticamente = new ImageIcon("src/Imagenes/ModificadoGeneticamente.jpg");
        EXIT = new ImageIcon("src/Imagenes/EXIT.jpg");
    }
    public void colocarBotones4(){
        
        Bloquear = new JButton();
        Bloquear.setText("Bloquear");
        Bloquear.setBounds(50, 350, 150, 70);
        Bloquear.setEnabled(true);
        Bloquear.setForeground(Color.WHITE);
        Bloquear.setFont(new Font("cooper black", 3, 20));
        Bloquear.setBackground(Color.BLACK);
        VModificadoGeneticamente.add(Bloquear);
        
        Pegar = new JButton();
        Pegar.setText("Pegar");
        Pegar.setBounds(220, 350, 150, 70);
        Pegar.setEnabled(true);
        Pegar.setForeground(Color.WHITE);
        Pegar.setFont(new Font("cooper black", 3, 20));
        Pegar.setBackground(Color.BLACK);
        VModificadoGeneticamente.add(Pegar);
        
        Esquivar = new JButton();
        Esquivar.setText("Esquivar");
        Esquivar.setBounds(390, 350, 150, 70);
        Esquivar.setEnabled(true);
        Esquivar.setForeground(Color.WHITE);
        Esquivar.setFont(new Font("cooper black", 3, 20));
        Esquivar.setBackground(Color.BLACK);
        VModificadoGeneticamente.add(Esquivar);
        
        PredecirGolpes = new JButton();
        PredecirGolpes.setText("PredecirGolpe");
        PredecirGolpes.setBounds(560, 350, 150, 70);
        PredecirGolpes.setEnabled(true);
        PredecirGolpes.setForeground(Color.WHITE);
        PredecirGolpes.setFont(new Font("cooper black", 3, 20));
        PredecirGolpes.setBackground(Color.BLACK);
        VModificadoGeneticamente.add(PredecirGolpes);
        
        Volver4 = new JButton();
        Volver4.setBounds(600, 150, 70, 70);
        Volver4.setIcon(new ImageIcon(EXIT.getImage().getScaledInstance(Volver4.getWidth(), Volver4.getHeight(), Image.SCALE_SMOOTH)));
        Volver4.setBackground(Color.BLACK);
        VModificadoGeneticamente.add(Volver4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Volver4")){
            this.dispose();
            GuiIntroRazas HuSu = new GuiIntroRazas();
            HuSu.setVisible(true);
        }
        else if(e.getActionCommand().equals("Bloquear")){
            JOptionPane.showMessageDialog(null, "Con su escudo es capaz de repeler el ataque del enemigo", "Bloquear", JOptionPane.DEFAULT_OPTION);
        }
        else if(e.getActionCommand().equals("Pegar")){
            JOptionPane.showMessageDialog(null, "Usando su escudo o sus puños puede golpear a sus enemigos provocandoles un gran daño", "Pegar", JOptionPane.DEFAULT_OPTION);
        }
        else if(e.getActionCommand().equals("Esquivar")){
            JOptionPane.showMessageDialog(null, "Usando el suelo del super soldado es capaz de evitar el ataque de su rival", "Esquivar", JOptionPane.DEFAULT_OPTION);
        }
        else if(e.getActionCommand().equals("PredecirGolpe")){
            JOptionPane.showMessageDialog(null, "Por su experiencia de batalla puede predecir con facilidad los ataques de su contrincante", "PredecirGolpe", JOptionPane.DEFAULT_OPTION);
        }
    }
    
}

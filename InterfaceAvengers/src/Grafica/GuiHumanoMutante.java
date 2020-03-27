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
public class GuiHumanoMutante extends JFrame implements ActionListener{
    private JPanel VHumanoMutante;
    private ImageIcon IHumanoMutante2;
    private JLabel lbIHumanoMutante;
    private int WIDTH2=300, HEIGHT2=200;
    private JButton Atacar;
    private JButton Aplastar;
    private JButton Alzar;
    private JButton Bloquear;
    private JButton Volver2;
    private ImageIcon EXIT;
    public GuiHumanoMutante(){
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
        
        Aplastar.setActionCommand("Aplastar");
        Aplastar.addActionListener(this);
        
        Alzar.setActionCommand("Alzar");
        Alzar.addActionListener(this);
        
        Bloquear.setActionCommand("Bloquear");
        Bloquear.addActionListener(this);
        
        Volver2.setActionCommand("Volver2");
        Volver2.addActionListener(this);
    }
    public void crearPanel2(){
        VHumanoMutante= new JPanel();
        this.getContentPane().setLayout(null);
        this.setBounds(500, 50, 790, 530);
        this.getContentPane().add(VHumanoMutante);
        VHumanoMutante.setBounds(0, 0, 790, 530);
        VHumanoMutante.setBackground(Color.BLACK);
        VHumanoMutante.setLayout(null);
    }
    public void colocarLabel2(){
        lbIHumanoMutante = new JLabel();
        lbIHumanoMutante.setBounds(250,50,WIDTH2,HEIGHT2);
        lbIHumanoMutante.setIcon(new ImageIcon(IHumanoMutante2.getImage().getScaledInstance(lbIHumanoMutante.getWidth(),lbIHumanoMutante.getHeight(), Image.SCALE_SMOOTH)));
        VHumanoMutante.add(lbIHumanoMutante);
    }
    public void colocarImagen2(){
        IHumanoMutante2 = new ImageIcon("src/Imagenes/HumanoMutante.jpg");
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
        VHumanoMutante.add(Atacar);
        
        Aplastar = new JButton();
        Aplastar.setText("Aplastar");
        Aplastar.setBounds(220, 350, 150, 70);
        Aplastar.setEnabled(true);
        Aplastar.setForeground(Color.WHITE);
        Aplastar.setFont(new Font("cooper black", 3, 20));
        Aplastar.setBackground(Color.BLACK);
        VHumanoMutante.add(Aplastar);
        
        Alzar = new JButton();
        Alzar.setText("Alzar");
        Alzar.setBounds(390, 350, 150, 70);
        Alzar.setEnabled(true);
        Alzar.setForeground(Color.WHITE);
        Alzar.setFont(new Font("cooper black", 3, 20));
        Alzar.setBackground(Color.BLACK);
        VHumanoMutante.add(Alzar);
        
        Bloquear = new JButton();
        Bloquear.setText("Bloquear");
        Bloquear.setBounds(560, 350, 150, 70);
        Bloquear.setEnabled(true);
        Bloquear.setForeground(Color.WHITE);
        Bloquear.setFont(new Font("cooper black", 3, 20));
        Bloquear.setBackground(Color.BLACK);
        VHumanoMutante.add(Bloquear);
        
        Volver2 = new JButton();
        Volver2.setBounds(600, 150, 70, 70);
        Volver2.setIcon(new ImageIcon(EXIT.getImage().getScaledInstance(Volver2.getWidth(), Volver2.getHeight(), Image.SCALE_SMOOTH)));
        Volver2.setBackground(Color.BLACK);
        VHumanoMutante.add(Volver2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Volver2")){
            this.dispose();
            GuiIntroRazas HuMu = new GuiIntroRazas();
            HuMu.setVisible(true);
        }
        else if(e.getActionCommand().equals("Atacar")){
            JOptionPane.showMessageDialog(null, "Usa su fuerza sobrehumana para golpear a sus enemigos", "Atacar", JOptionPane.DEFAULT_OPTION);
        }
        else if(e.getActionCommand().equals("Aplastar")){
            JOptionPane.showMessageDialog(null, "Con su fuerza puede tomar objetos o enemigos y destruirlos facilmente", "Aplastar", JOptionPane.DEFAULT_OPTION);
        }
        else if(e.getActionCommand().equals("Alzar")){
            JOptionPane.showMessageDialog(null, "Por medio de su fuerza puede levantar objetos muy pesados y lanzarlos o usarlos para protegerse", "Alzar", JOptionPane.DEFAULT_OPTION);
        }
        else if(e.getActionCommand().equals("Bloquear")){
            JOptionPane.showMessageDialog(null, "Por las mutaciones por los rayos gama en su cuerpo es capaz de soportar mucho daño sin tener repercusiones en su cuerpo", "Bloquear", JOptionPane.DEFAULT_OPTION);
        }
    }
}

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
import javax.swing.JPanel;

/**
 *
 * @author esjae
 */
public class GuiIntroRazas extends JFrame implements ActionListener {
    private JPanel VInicio;
    private ImageIcon IEternos;
    private ImageIcon IHumanoMutante;
    private ImageIcon IHumanoSuperdotado;
    private ImageIcon IModificadoGeneticamente;
    private JButton BEternos;
    private JButton BHumanoMutante;
    private JButton BHumanoSuperdotado;
    private JButton BModificadoGeneticamente;
    private JLabel TituloIntro;
    private JLabel lbIDerechos;
    private int WIDTH=250, HEIGHT=150;
    
    public GuiIntroRazas(){
        iniciarComponentes();
        Acciones(); 
        this.setTitle("Super Heroes");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void iniciarComponentes(){
        crearPanel();
        colocarLabel();
        colocarImagen();
        colocarBotones();
    }
    
    public void Acciones(){
        BEternos.setActionCommand("Eternos");
        BEternos.addActionListener(this);
        
        BHumanoMutante.setActionCommand("HumanoMutante");
        BHumanoMutante.addActionListener(this);
        
        BHumanoSuperdotado.setActionCommand("HumanoSuperdotado");
        BHumanoSuperdotado.addActionListener(this);
        
        BModificadoGeneticamente.setActionCommand("ModificadoGeneticamente");
        BModificadoGeneticamente.addActionListener(this);
    }
    
    public void crearPanel(){
        VInicio= new JPanel();
        this.getContentPane().setLayout(null);
        this.setBounds(500, 50, 790, 530);
        this.getContentPane().add(VInicio);
        VInicio.setBounds(0, 0, 790, 530);
        VInicio.setBackground(Color.BLACK);
        VInicio.setLayout(null);
    }
    public void colocarLabel(){
        TituloIntro = new JLabel("Interface AVENGERS");
        TituloIntro.setBounds(10, 10, 700, 50);
        TituloIntro.setHorizontalAlignment(JLabel.CENTER);
        TituloIntro.setFont(new Font ("Arial", Font.BOLD + Font.ITALIC, 50));
        TituloIntro.setForeground(Color.WHITE);
        VInicio.add(TituloIntro);
        
        lbIDerechos = new JLabel ("sebasdavgon@hotmail.com<<Sebastian Gonzalez<<20182020070<<Heroes>>20182020097>>Carlos Robayo>>carlosjrobayo@gmail.com");
        lbIDerechos.setBounds(50,450,700,20);
        lbIDerechos.setHorizontalAlignment(JLabel.CENTER);
        lbIDerechos.setFont(new Font ("Arial", Font.BOLD + Font.ITALIC, 8));
        lbIDerechos.setForeground(Color.WHITE);
        VInicio.add(lbIDerechos);
    }
    public void colocarImagen(){
        IEternos = new ImageIcon("src/Imagenes/Eternos.jpg");
        IHumanoMutante = new ImageIcon("src/Imagenes/HumanoMutante.jpg");
        IHumanoSuperdotado = new ImageIcon("src/Imagenes/HumanoSuperdotado.jpg");
        IModificadoGeneticamente = new ImageIcon("src/Imagenes/ModificadoGeneticamente.jpg");
        
    }
    public void colocarBotones(){
        
        BEternos = new JButton();
        BEternos.setBounds(50, 100, WIDTH, HEIGHT);
        BEternos.setIcon(new ImageIcon(IEternos.getImage().getScaledInstance(BEternos.getWidth(), BEternos.getHeight(), Image.SCALE_SMOOTH)));
        VInicio.add(BEternos);
        
        BHumanoMutante = new JButton();
        BHumanoMutante.setBounds(50, 290, WIDTH, HEIGHT);
        BHumanoMutante.setIcon(new ImageIcon(IHumanoMutante.getImage().getScaledInstance(BHumanoMutante.getWidth(), BHumanoMutante.getHeight(), Image.SCALE_SMOOTH)));
        VInicio.add(BHumanoMutante);
        
        BHumanoSuperdotado = new JButton();
        BHumanoSuperdotado.setBounds(460, 290, WIDTH, HEIGHT);
        BHumanoSuperdotado.setIcon(new ImageIcon(IHumanoSuperdotado.getImage().getScaledInstance(BHumanoSuperdotado.getWidth(), BHumanoSuperdotado.getHeight(), Image.SCALE_SMOOTH)));
        VInicio.add(BHumanoSuperdotado);
        
        BModificadoGeneticamente = new JButton();
        BModificadoGeneticamente.setBounds(460, 100, WIDTH, HEIGHT);
        BModificadoGeneticamente.setIcon(new ImageIcon(IModificadoGeneticamente.getImage().getScaledInstance(BModificadoGeneticamente.getWidth(), BModificadoGeneticamente.getHeight(), Image.SCALE_SMOOTH)));
        VInicio.add(BModificadoGeneticamente);
    }
    

    @Override
    public void actionPerformed(ActionEvent s) {
        if(s.getActionCommand().equals("Eternos")){
            this.dispose();
            GuiEternos eter = new GuiEternos();
            eter.setVisible(true);
        }
        else if(s.getActionCommand().equals("HumanoMutante")){
            this.dispose();
            GuiHumanoMutante HuMu = new GuiHumanoMutante();
            HuMu.setVisible(true);
        }
        else if(s.getActionCommand().equals("HumanoSuperdotado")){
            this.dispose();
            GuiHumanoSuperdotado HuSu = new GuiHumanoSuperdotado();
            HuSu.setVisible(true);
        }
        else if(s.getActionCommand().equals("ModificadoGeneticamente")){
            this.dispose();
            GuiModificadoGeneticamente MoGe = new GuiModificadoGeneticamente();
            MoGe.setVisible(true);
        }
        
    }
    
}

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
public class GuiHumanoSuperdotado extends JFrame implements ActionListener{
    private JPanel VHumanoSuperdotado;
    private ImageIcon IHumanoSuperdotado;
    private JLabel lbIHumanoSuperdotado;
    private int WIDTH2=300, HEIGHT2=200;
    private JButton Atacar;
    private JButton SurcarCielo;
    private JButton Esquivar;
    private JButton PredecirGolpes;
    private JButton Volver3;
    private ImageIcon EXIT;
    public GuiHumanoSuperdotado(){
        iniciarComponentes3();
        Acciones3(); 
        this.setTitle("Super Heroes");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void iniciarComponentes3(){
        crearPanel3();
        colocarImagen3();
        colocarLabel3();
        colocarBotones3();
    }
    public void Acciones3(){
        Atacar.setActionCommand("Atacar");
        Atacar.addActionListener(this);
        
        SurcarCielo.setActionCommand("SurcarCielo");
        SurcarCielo.addActionListener(this);
        
        Esquivar.setActionCommand("Esquivar");
        Esquivar.addActionListener(this);
        
        PredecirGolpes.setActionCommand("PredecirGolpes");
        PredecirGolpes.addActionListener(this);
        
        Volver3.setActionCommand("Volver3");
        Volver3.addActionListener(this);
    }
    public void crearPanel3(){
        VHumanoSuperdotado= new JPanel();
        this.getContentPane().setLayout(null);
        this.setBounds(500, 50, 790, 530);
        this.getContentPane().add(VHumanoSuperdotado);
        VHumanoSuperdotado.setBounds(0, 0, 790, 530);
        VHumanoSuperdotado.setBackground(Color.BLACK);
        VHumanoSuperdotado.setLayout(null);
    }
    public void colocarLabel3(){
        lbIHumanoSuperdotado = new JLabel();
        lbIHumanoSuperdotado.setBounds(250,50,WIDTH2,HEIGHT2);
        lbIHumanoSuperdotado.setIcon(new ImageIcon(IHumanoSuperdotado.getImage().getScaledInstance(lbIHumanoSuperdotado.getWidth(),lbIHumanoSuperdotado.getHeight(), Image.SCALE_SMOOTH)));
        VHumanoSuperdotado.add(lbIHumanoSuperdotado);
    }
    public void colocarImagen3(){
        IHumanoSuperdotado = new ImageIcon("src/Imagenes/HumanoSuperdotado.jpg");
        EXIT = new ImageIcon("src/Imagenes/EXIT.jpg");
    }
    public void colocarBotones3(){
        
        Atacar = new JButton();
        Atacar.setText("Atacar");
        Atacar.setBounds(50, 350, 150, 70);
        Atacar.setEnabled(true);
        Atacar.setForeground(Color.WHITE);
        Atacar.setFont(new Font("cooper black", 3, 20));
        Atacar.setBackground(Color.BLACK);
        VHumanoSuperdotado.add(Atacar);
        
        SurcarCielo = new JButton();
        SurcarCielo.setText("SurcarCielo");
        SurcarCielo.setBounds(220, 350, 150, 70);
        SurcarCielo.setEnabled(true);
        SurcarCielo.setForeground(Color.WHITE);
        SurcarCielo.setFont(new Font("cooper black", 3, 20));
        SurcarCielo.setBackground(Color.BLACK);
        VHumanoSuperdotado.add(SurcarCielo);
        
        Esquivar = new JButton();
        Esquivar.setText("Esquivar");
        Esquivar.setBounds(390, 350, 150, 70);
        Esquivar.setEnabled(true);
        Esquivar.setForeground(Color.WHITE);
        Esquivar.setFont(new Font("cooper black", 3, 20));
        Esquivar.setBackground(Color.BLACK);
        VHumanoSuperdotado.add(Esquivar);
        
        PredecirGolpes = new JButton();
        PredecirGolpes.setText("PredecirGolpes");
        PredecirGolpes.setBounds(560, 350, 150, 70);
        PredecirGolpes.setEnabled(true);
        PredecirGolpes.setForeground(Color.WHITE);
        PredecirGolpes.setFont(new Font("cooper black", 3, 20));
        PredecirGolpes.setBackground(Color.BLACK);
        VHumanoSuperdotado.add(PredecirGolpes);
        
        Volver3 = new JButton();
        Volver3.setBounds(600, 150, 70, 70);
        Volver3.setIcon(new ImageIcon(EXIT.getImage().getScaledInstance(Volver3.getWidth(), Volver3.getHeight(), Image.SCALE_SMOOTH)));
        Volver3.setBackground(Color.BLACK);
        VHumanoSuperdotado.add(Volver3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Volver3")){
            this.dispose();
            GuiIntroRazas HuSu = new GuiIntroRazas();
            HuSu.setVisible(true);
        }
        else if(e.getActionCommand().equals("Atacar")){
            JOptionPane.showMessageDialog(null, "Usa sus rayos de energia para atacar a los enemigos que esten cerca", "Atacar", JOptionPane.DEFAULT_OPTION);
        }
        else if(e.getActionCommand().equals("SurcarCielo")){
            JOptionPane.showMessageDialog(null, "Usando su traje es capaz de volar usando propulsores de energia", "SurcarCielo", JOptionPane.DEFAULT_OPTION);
        }
        else if(e.getActionCommand().equals("Esquivar")){
            JOptionPane.showMessageDialog(null, "Usando su armadura puede propulsarse y evitar ataques", "Esquivar", JOptionPane.DEFAULT_OPTION);
        }
        else if(e.getActionCommand().equals("PredecirGolpes")){
            JOptionPane.showMessageDialog(null, "Usando la inteligencia artificial de su traje, es capaz de calcular los ataques para evitarlos", "PredecirGolpes", JOptionPane.DEFAULT_OPTION);
        }
    }
    
}

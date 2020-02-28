/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodedadosapuestas;
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author esjae
 */
public class GuiInicial extends JFrame implements ActionListener {
    
    private JPanel VInicio;
    private JLabel lbTituloprincipal;
    private ImageIcon imagenlogo;
    private JLabel lbImagenlogo;
    private JLabel lbIUsuario;
    private JTextField txtIUsuario;
    private JLabel lbIPass;
    private JPasswordField txtIPass;
    private JButton botonIIngresar;
    private JButton botonIRegistro;
    private File archivo;
    private JLabel lbIDerechos;
    
    public GuiInicial(){
        archivo = new File();
        iniciarComponentes();
        this.setTitle("Juego Dados");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        botonIIngresar.setActionCommand("Ingresar");
        botonIIngresar.addActionListener(this);
        
        botonIRegistro.setActionCommand("Ingresar");
        botonIRegistro.addActionListener(this);
    }
    private void iniciarComponentes(){
        crearPanel();
        colocarLabel();
        colocarText();
        colocarBotones();
    }
    private void crearPanel(){
        VInicio= new JPanel();
        this.getContentPane().setLayout(null);
        this.setBounds(500, 50, 400, 530);
        this.getContentPane().add(VInicio);
        VInicio.setBounds(0, 0, 400, 530);
        VInicio.setBackground(Color.BLACK);
        VInicio.setLayout(null);
    }
    private void colocarLabel(){
        lbTituloprincipal = new JLabel("Juego de dados y apuestas");
        lbTituloprincipal.setBounds(5,5,395,20);
        lbTituloprincipal.setHorizontalAlignment(JLabel.CENTER);
        lbTituloprincipal.setFont(new Font("monospaced", Font.BOLD + Font.ITALIC, 20));
        lbTituloprincipal.setForeground(Color.WHITE);
        VInicio.add(lbTituloprincipal);
        
        imagenlogo = new ImageIcon("C:\\Users\\esjae\\OneDrive\\Escritorio\\Sebastian Gonzalez Gutierrez\\Tareas Universidad\\Segundo Semestre\\Programacion Orientada a Objetos\\JuegodeDadosapuestas\\src\\main\\java\\resource\\LogoDados.jpeg");
        lbImagenlogo = new JLabel(imagenlogo);
        lbImagenlogo.setBounds(22,35,340,200);
        lbImagenlogo.setIcon(new ImageIcon(imagenlogo.getImage().getScaledInstance(340,200, Image.SCALE_SMOOTH)));
        VInicio.add(lbImagenlogo);
        
        lbIUsuario = new JLabel ("Usuario");
        lbIUsuario.setBounds(22, 150, 110, 235);
        lbIUsuario.setHorizontalAlignment(JLabel.LEFT);
        lbIUsuario.setFont(new Font ("Arial", Font.BOLD + Font.ITALIC, 20));
        lbIUsuario.setForeground(Color.WHITE);
        VInicio.add(lbIUsuario);
        
        lbIPass = new JLabel ("Contraseña");
        lbIPass.setBounds(22,120,110,395);
        lbIPass.setHorizontalAlignment(JLabel.LEFT);
        lbIPass.setFont(new Font ("Arial", Font.BOLD + Font.ITALIC, 20));
        lbIPass.setForeground(Color.WHITE);
        VInicio.add(lbIPass);
        
        lbIDerechos = new JLabel ("sebasdavgon@hotmail.com<<Sebastian Gonzalez<<20182020070<<Juego de dados");
        lbIDerechos.setBounds(22,210,340,530);
        lbIDerechos.setHorizontalAlignment(JLabel.LEFT);
        lbIDerechos.setFont(new Font ("Arial", Font.BOLD + Font.ITALIC, 8));
        lbIDerechos.setForeground(Color.WHITE);
        VInicio.add(lbIDerechos);
    }
    private void colocarBotones(){
        botonIIngresar = new JButton ("Ingresar");
        botonIIngresar.setBounds(22, 360, 160, 30);
        VInicio.add(botonIIngresar);
        
        botonIRegistro = new JButton ("Registro");
        botonIRegistro.setBounds(202, 360, 160, 30);
        VInicio.add(botonIRegistro);
    }
    private void colocarText(){
        txtIUsuario = new JTextField();
        txtIUsuario.setBounds(150, 250, 170, 30);
        VInicio.add(txtIUsuario);
        
        txtIPass = new JPasswordField();
        txtIPass.setBounds(150, 300, 170, 30);
        VInicio.add(txtIPass);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Registro")){
            this.dispose();
            GuiRegis regis = new GuiRegis();      
        }
    }
}
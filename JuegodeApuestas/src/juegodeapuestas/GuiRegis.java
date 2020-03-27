/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodeapuestas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Bryant
 */
public class GuiRegis extends JFrame implements ActionListener {
    private JPanel VRegistro;
    private FileJugadores archivo;
    private JLabel lbRTitulo;
    private JLabel lbRNombre;
    private JLabel lbRUsuario;
    private JLabel lbRPass;
    private JLabel lbRSaldo;
    private JLabel lbRFondo;
    private ImageIcon Fondo;
    private JTextField txtRNombre;
    private JTextField txtRUsuario;
    private JPasswordField txtRPass;
    private JFormattedTextField txtRSaldo;
    private JButton botonRVolver;
    private JButton botonRContinuar;
            
    
    public GuiRegis(){
        archivo = new FileJugadores();
        iniciarcomponentes2();
        Acciones2();
        this.setTitle("Juego de Apuestas");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void iniciarcomponentes2(){
        crearPanel2();
        colocarLabel2();
        colocarText2();
        colocarBotones2();
    }
    private void crearPanel2(){
        VRegistro = new JPanel();
        VRegistro.setBounds(0, 0, 400, 530);
        VRegistro.setBackground(Color.BLACK);
        VRegistro.setLayout(null);
        this.getContentPane().setLayout(null);
        this.setBounds(500, 50, 400, 530);
        this.getContentPane().add(VRegistro);
    }
    private void colocarLabel2(){
        lbRTitulo = new JLabel("Registro del Usuario");
        lbRTitulo.setBounds(5,5,395,20);
        lbRTitulo.setHorizontalAlignment(JLabel.CENTER);
        lbRTitulo.setFont(new Font("monospaced", Font.BOLD + Font.ITALIC, 20));
        lbRTitulo.setForeground(Color.WHITE);
        VRegistro.add(lbRTitulo);
        
        lbRNombre = new JLabel ("Nombre");
        lbRNombre.setBounds(22, 70, 110, 15);
        lbRNombre.setHorizontalAlignment(JLabel.LEFT);
        lbRNombre.setFont(new Font ("Arial", Font.BOLD + Font.ITALIC, 20));
        lbRNombre.setForeground(Color.WHITE);
        VRegistro.add(lbRNombre);
        
        lbRUsuario = new JLabel ("Usuario");
        lbRUsuario.setBounds(22, 130, 90, 15);
        lbRUsuario.setHorizontalAlignment(JLabel.LEFT);
        lbRUsuario.setFont(new Font ("Arial", Font.BOLD + Font.ITALIC, 20));
        lbRUsuario.setForeground(Color.WHITE);
        VRegistro.add(lbRUsuario);
        
        lbRPass = new JLabel ("Contraseña");
        lbRPass.setBounds(22, 190, 110, 15);
        lbRPass.setHorizontalAlignment(JLabel.LEFT);
        lbRPass.setFont(new Font ("Arial", Font.BOLD + Font.ITALIC, 20));
        lbRPass.setForeground(Color.WHITE);
        VRegistro.add(lbRPass);
        
        lbRSaldo = new JLabel ("Saldo");
        lbRSaldo.setBounds(140, 270, 110, 15);
        lbRSaldo.setHorizontalAlignment(JLabel.CENTER);
        lbRSaldo.setFont(new Font ("Arial", Font.BOLD + Font.ITALIC, 20));
        lbRSaldo.setForeground(Color.WHITE);
        VRegistro.add(lbRSaldo);
        
        Fondo = new ImageIcon("src/Imagenes/FondoDados.jpg");
        lbRFondo = new JLabel(Fondo);
        lbRFondo.setBounds(0,0,400,530);
        lbRFondo.setIcon(new ImageIcon(Fondo.getImage().getScaledInstance(200,530, Image.SCALE_SMOOTH)));
        VRegistro.add(lbRFondo);
    }
    private void colocarText2(){
        
        NumberFormat formato = NumberFormat.getIntegerInstance();
        formato.setGroupingUsed(false);
        NumberFormatter parametro1 = new NumberFormatter(formato);
        parametro1.setValueClass(Integer.class);
        parametro1.setMinimum(0);
        parametro1.setMaximum(Integer.MAX_VALUE);
        parametro1.setAllowsInvalid(false);
        parametro1.setCommitsOnValidEdit(true);
        
        txtRNombre = new JTextField();
        txtRNombre.setBounds(150, 65, 170, 30);
        VRegistro.add(txtRNombre);
        
        txtRUsuario = new JTextField();
        txtRUsuario.setBounds(150, 125, 170, 30);
        VRegistro.add(txtRUsuario);
        
        txtRPass = new JPasswordField();
        txtRPass.setBounds(150, 185, 170, 30);
        VRegistro.add(txtRPass);
        
        
        txtRSaldo = new JFormattedTextField(parametro1);
        txtRSaldo.setBounds(140, 300, 110, 30);
        VRegistro.add(txtRSaldo);
    }
    private void colocarBotones2(){
        botonRVolver = new JButton("Volver");
        botonRVolver.setBounds(30, 370, 150, 30);
        VRegistro.add(botonRVolver);
        
        botonRContinuar = new JButton("Continuar");
        botonRContinuar.setBounds (200,370, 150, 30);
        VRegistro.add(botonRContinuar);
    }
    private void Acciones2(){
        botonRVolver.addActionListener(this);
        botonRVolver.setActionCommand("Volver");
        
        botonRContinuar.addActionListener(this);
        botonRContinuar.setActionCommand("Continuar");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("volver")){
            this.dispose();
            GuiInicial juego = new GuiInicial();
            juego.setVisible(true);
        }
        else if(e.getActionCommand().equals("Continuar")){
            Boolean error = false; 
            if(this.txtRNombre.getText().equals("") || this.txtRUsuario.getText().equals("") || this.txtRPass.getPassword().equals("") || this.txtRSaldo.getText().equals("")){
                error = true;    
            }
            try{
                if(Integer.parseInt(this.txtRSaldo.getText()) <= 0){
                    JOptionPane.showMessageDialog(null, "El saldo debe ser superior a 0", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch(NumberFormatException err){
                    JOptionPane.showMessageDialog(null, "Ha ingresado un valor invalido!", "Error", JOptionPane.ERROR_MESSAGE);
                    txtRSaldo.setText("0");
            }
            catch(Exception err){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error desconocido", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println(err);
            }
            
            
            if(error){
                JOptionPane.showMessageDialog(null, "Error completa todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                try{
                    Participante jug1 = new Participante(this.txtRUsuario.getText(), new String(this.txtRPass.getPassword()), this.txtRNombre.getText(), Integer.parseInt(this.txtRSaldo.getText()), 0, 0);
                    AccionFile res = archivo.crearJugador(jug1);
                    if(!res.getEstado()){
                        JOptionPane.showMessageDialog(null, res.getSituacion(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Usuario registrado satisfactoriamente", "Bienvenido", JOptionPane.DEFAULT_OPTION);
                        this.dispose();
                        GuiJuego juegoInt = new GuiJuego(jug1);
                    }
                }catch(NumberFormatException err){
                    JOptionPane.showMessageDialog(null, "Ha ingresado un valor invalido!", "Error", JOptionPane.ERROR_MESSAGE);
                    txtRSaldo.setText("0");
               
                }
                catch(Exception err){
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error desconocido", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println(err);
                }
                
                
            }
        }
    }
    
}

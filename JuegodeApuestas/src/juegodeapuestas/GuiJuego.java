/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodeapuestas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Transparency;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Bryant
 */
public class GuiJuego extends JFrame implements ActionListener {
    private Participante par1;
    private JPanel PanelB;
    private JLabel lbIntroB;
    private JLabel lbNoUsuario;
    private JLabel lbJSaldo;
    private JLabel lbNumerodeJuegos;
    private JLabel lbNumerodeJuegosGanados;
    private JLabel lbNumerodeJuegosPerdidos;
    private JButton BJugar;
    private JButton BCambiarSaldo;
    private JButton BCerrarSesion;
    private JTextField txtSaldo;
    private JTextField txtAposta;
    private JLabel lbApostar;
    private FileJugadores archivos;
    public GuiJuego(Participante par1){
        
        
        this.par1 = par1;
        archivos = new FileJugadores();
        PanelB = new JPanel();
        lbIntroB = new JLabel("Listo para Apuesta");
        lbNoUsuario = new JLabel(par1.getNombre());
        lbJSaldo = new JLabel("Su saldo: ");
        lbNumerodeJuegos = new JLabel("Numero de Juegos: "+String.valueOf(par1.getJuegosGanados() + par1.getJuegosPerdidos()));
        lbNumerodeJuegosGanados = new JLabel("Numero de Juegos Ganados: "+String.valueOf(par1.getJuegosGanados()));
        lbNumerodeJuegosPerdidos = new JLabel("Numeros de Juegos Perdidos: "+String.valueOf(par1.getJuegosPerdidos()));
        BJugar = new JButton("Jugar");
        BCambiarSaldo = new JButton(new ImageIcon("src/resource/edit-button.png"));
        BCerrarSesion = new JButton(new ImageIcon("src/resource/cerrar.png"));
        txtSaldo = new JTextField(String.valueOf(par1.getSaldo()));
        lbApostar = new JLabel("Valor apostar?");
        txtAposta = new JTextField("100");
        this.getContentPane().setLayout(null);
        this.setBounds(500, 50, 300, 400);
        this.getContentPane().add(PanelB);
           
        PanelB.setBounds(0, 0, 300, 400);
        PanelB.setBackground(Color.BLACK);
        PanelB.setLayout(null);
        
        PanelB.add(lbIntroB);
        lbIntroB.setBounds(15, 15, 300, 30);
        lbIntroB.setHorizontalAlignment(JLabel.LEFT);
        lbIntroB.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 20));
        lbIntroB.setForeground(Color.WHITE);
        
        PanelB.add(lbNoUsuario);
        lbNoUsuario.setBounds(15, 45, 220, 30);
        lbNoUsuario.setHorizontalAlignment(JLabel.CENTER);
        lbNoUsuario.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 30));
        lbNoUsuario.setForeground(Color.WHITE);
        PanelB.add(lbJSaldo);
        lbJSaldo.setBounds(15, 100, 220, 30);
        lbJSaldo.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 30));
        lbJSaldo.setForeground(Color.WHITE);
        
        PanelB.add(txtSaldo);
        txtSaldo.setBounds(195, 100, 75, 30);
        
        PanelB.add(BCambiarSaldo);
        BCambiarSaldo.setBounds(190, 100, 30, 30);
        BCambiarSaldo.setBorder(null);
        BCambiarSaldo.setBackground(Color.WHITE);
        BCambiarSaldo.setContentAreaFilled(false);
        BCambiarSaldo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        
        PanelB.add(lbNumerodeJuegos);
        lbNumerodeJuegos.setBounds(15, 130, 220, 30);
        lbNumerodeJuegos.setForeground(Color.WHITE);
        PanelB.add(lbNumerodeJuegosGanados);
        lbNumerodeJuegosGanados.setBounds(15, 160, 220, 30);
        lbNumerodeJuegosGanados.setForeground(Color.WHITE);
        PanelB.add(lbNumerodeJuegosPerdidos);
        lbNumerodeJuegosPerdidos.setBounds(15, 190, 220, 30);
        lbNumerodeJuegosPerdidos.setForeground(Color.WHITE);
        
        
        PanelB.add(BCerrarSesion);
        BCerrarSesion.setBounds(200, 330, 30, 30);
        BCerrarSesion.setBorder(null);
        BCerrarSesion.setBackground(Color.WHITE);
        BCerrarSesion.setContentAreaFilled(false);
        BCerrarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        
        PanelB.add(lbApostar);
        lbApostar.setBounds(15, 230, 100, 30);
        lbApostar.setForeground(Color.WHITE);
        
        PanelB.add(txtAposta);
        txtAposta.setBounds(115, 230, 120, 30);
        
        PanelB.add(BJugar);
        BJugar.setBounds(15, 290, 260, 30);
        BJugar.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 30));
        BJugar.setBackground(Color.BLACK);
        BJugar.setForeground(Color.WHITE);
        
        this.setTitle("Juego Dados");
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BJugar.setActionCommand("jugar");
        BJugar.addActionListener(this);
        BCambiarSaldo.addActionListener(this);
        BCambiarSaldo.setActionCommand("cambiarSaldo");
        
        BCerrarSesion.addActionListener(this);
        BCerrarSesion.setActionCommand("cerrarSesion");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("jugar")){
            this.dispose();
            LogicaJuego juego = new LogicaJuego(this.par1, Integer.parseInt(this.txtAposta.getText()));
            GuiInteraccion jugar = new GuiInteraccion(juego);
        }
        else if(e.getActionCommand().equals("cambiarSaldo")){
            AccionFile res = archivos.cambiarSaldo(this.par1, Integer.parseInt(txtSaldo.getText()));
            if(!res.getEstado()){
                JOptionPane.showMessageDialog(null, res.getSituacion(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Saldo modificado satisfactoriamente", "Saldo Modificado", JOptionPane.DEFAULT_OPTION);
            }
        }
        else if(e.getActionCommand().equals("cerrarSesion")){
            this.dispose();
            GuiInicial inicio = new GuiInicial();
        }
    }
    
    
    
    
    
}

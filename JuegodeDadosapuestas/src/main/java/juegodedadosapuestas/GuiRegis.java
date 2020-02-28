
package juegodedadosapuestas;

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

public class GuiRegis extends JFrame implements ActionListener {
    private JPanel VRegistro;
    private File archivo;
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
    private JButton botonRRegistro;
    
    
    
    public GuiRegis(){
        archivo = new File();
    
        iniciarcomponentes2();
        this.setTitle("Juego Dados");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        botonRVolver.addActionListener(this);
        botonRVolver.setActionCommand("volver");
        
        botonRRegistro.addActionListener(this);
        botonRRegistro.setActionCommand("registro");
    }

    private void iniciarcomponentes2(){
        crearPanel2();
        colocarLabel2();
        colocarText2();
        colocarBotones2();
    }
    private void crearPanel2(){
        VRegistro = new JPanel();
        this.getContentPane().setLayout(null);
        this.setBounds(500, 50, 400, 530);
        this.getContentPane().add(VRegistro);
        VRegistro.setBounds(0, 0, 400, 530);
        VRegistro.setBackground(Color.BLACK);
        VRegistro.setLayout(null);
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
        
        Fondo = new ImageIcon("C:\\Users\\esjae\\OneDrive\\Escritorio\\Sebastian Gonzalez Gutierrez\\Tareas Universidad\\Segundo Semestre\\Programacion Orientada a Objetos\\JuegodeDadosapuestas\\src\\main\\java\\resource\\FondoDados.jpg");
        lbRFondo = new JLabel(Fondo);
        lbRFondo.setBounds(0,0,400,530);
        lbRFondo.setIcon(new ImageIcon(Fondo.getImage().getScaledInstance(200,530, Image.SCALE_SMOOTH)));
        VRegistro.add(lbRFondo);
    }
    private void colocarText2(){
        
        NumberFormat formato = NumberFormat.getIntegerInstance();
        formato.setGroupingUsed(true);
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
        
        botonRRegistro = new JButton("Continuar");
        botonRRegistro.setBounds (200,370, 150, 30);
        VRegistro.add(botonRRegistro);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("volver")){
            this.dispose();
            GuiInteraccion juego = new GuiInteraccion();
            
        }
    }
}

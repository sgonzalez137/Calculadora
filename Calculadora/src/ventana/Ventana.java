/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author goztian
 */
public class Ventana extends JFrame{
    private int cont;
    public JPanel panel;
    private JTextField etiqueta1,etiqueta2;
    private JButton boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,botonPunto,boton0,botonIgual,botonSuma,
            botonResta,botonMultiplicacion,botonDivision,botonNorma,botonConjugado;
    public Ventana(){
        setSize(320,500);
        setTitle("Calculadora Complejos");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200,200));
        inciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }
    
    private void inciarComponentes(){
       crearPanel();
       colocarEtiqeutas();
       colocarBotones();
    }
    private void crearPanel(){
        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        this.getContentPane().add(panel);
        
        
    }
    
    private void colocarEtiqeutas(){
        
        etiqueta1 = new JTextField();
        etiqueta1.setBounds(10,130,145,60);
        etiqueta1.setForeground(Color.BLACK);
        etiqueta1.setOpaque(true);
        etiqueta1.setBackground(Color.WHITE);
        etiqueta1.setFont(new Font("arial",Font.PLAIN,20));
        panel.add(etiqueta1);
        etiqueta2 = new JTextField();
        etiqueta2.setBounds(165,130,145,60);
        etiqueta2.setForeground(Color.BLACK);
        etiqueta2.setOpaque(true);
        etiqueta2.setBackground(Color.WHITE);
        etiqueta2.setFont(new Font("arial",Font.PLAIN,20));
        panel.add(etiqueta2);
        JLabel etiqueta3 = new JLabel("PARTE REAL");
        etiqueta3.setBounds(10,195,145,30);
        etiqueta3.setForeground(Color.BLACK);
        etiqueta3.setOpaque(true);
        etiqueta3.setBackground(Color.WHITE);
        etiqueta3.setFont(new Font("arial",Font.PLAIN,20));
        panel.add(etiqueta3);
        JLabel etiqueta4 = new JLabel("PARTE IMAGINARIA");
        etiqueta4.setBounds(165,195,145,30);
        etiqueta4.setForeground(Color.BLACK);
        etiqueta4.setOpaque(true);
        etiqueta4.setBackground(Color.WHITE);
        etiqueta4.setFont(new Font("arial",Font.PLAIN,20));
        panel.add(etiqueta4);
        
        
        
        JLabel etiqueta6 = new JLabel();
        etiqueta6.setBounds(170,400,137,30);
        etiqueta6.setForeground(Color.BLACK);
        etiqueta6.setOpaque(true);
        etiqueta6.setBackground(Color.WHITE);
        etiqueta6.setFont(new Font("arial",Font.PLAIN,20));
        panel.add(etiqueta6);
        
        ImageIcon imagen = new ImageIcon("descarga.png");
        JLabel etiquetalogo = new JLabel();
        etiquetalogo.setBounds(10, 10, 300, 110);
        etiquetalogo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(300,110, Image.SCALE_SMOOTH)));
        panel.add(etiquetalogo); 
        JLabel etiquetaOn = new JLabel("On");
        etiquetaOn.setBounds(170,375,20,20);
        etiquetaOn.setForeground(Color.BLACK);
        etiquetaOn.setOpaque(true);
        etiquetaOn.setBackground(Color.WHITE);
        etiquetaOn.setFont(new Font("arial",Font.PLAIN,10));
        panel.add(etiquetaOn);
        JLabel etiquetaOff = new JLabel("Off");
        etiquetaOff.setBounds(210,375,20,20);
        etiquetaOff.setForeground(Color.BLACK);
        etiquetaOff.setOpaque(true);
        etiquetaOff.setBackground(Color.WHITE);
        etiquetaOff.setFont(new Font("arial",Font.PLAIN,10));
        panel.add(etiquetaOff);
    }
    private void colocarBotones(){
        JRadioButton on=new JRadioButton();
        on.setBounds(170, 345, 30, 30);
        panel.add(on);
        JRadioButton off=new JRadioButton();
        off.setBounds(210, 345, 30, 30);
        panel.add(off); 
        ButtonGroup bg=new ButtonGroup();
        bg.add(on);
        bg.add(off);
        JButton botonDz=new JButton();
        botonDz.setBounds(240, 345, 35, 55);
        botonDz.setText("C");
        botonDz.setEnabled(true);
        botonDz.setMnemonic('z');
        panel.add(botonDz);
        JButton botonNextD=new JButton();
        botonNextD.setBounds(275, 345, 35, 20);
        botonNextD.setText("->");
        botonNextD.setEnabled(true);
        botonNextD.setMnemonic('j');
        panel.add(botonNextD);
        
        JButton botonNextI=new JButton();
        botonNextI.setBounds(275, 375, 35, 20);
        botonNextI.setText("<--");
        botonNextI.setEnabled(true);
        botonNextI.setMnemonic('h');
        panel.add(botonNextI);
        
        boton1=new JButton();
        boton1.setBounds(10, 245, 40, 40);
        boton1.setText("1");
        boton1.setEnabled(true);
        boton1.setMnemonic('1');
        panel.add(boton1);
        
        
        boton2=new JButton();
        boton2.setBounds(60, 245, 40, 40);
        boton2.setText("2");
        boton2.setEnabled(true);
        boton2.setMnemonic('2');
        panel.add(boton2);
        boton3=new JButton();
        boton3.setBounds(110, 245, 40, 40);
        boton3.setText("3");
        boton3.setEnabled(true);
        boton3.setMnemonic('3');
        panel.add(boton3);
        boton4=new JButton();
        boton4.setBounds(10, 295, 40, 40);
        boton4.setText("4");
        boton4.setEnabled(true);
        boton4.setMnemonic('4');
        panel.add(boton4);
        boton5=new JButton();
        boton5.setBounds(60, 295, 40, 40);
        boton5.setText("5");
        boton5.setEnabled(true);
        boton5.setMnemonic('5');
        panel.add(boton5);
        boton6=new JButton();
        boton6.setBounds(110, 295, 40, 40);
        boton6.setText("6");
        boton6.setEnabled(true);
        boton6.setMnemonic('6');
        panel.add(boton6);
        boton7=new JButton();
        boton7.setBounds(10, 345, 40, 40);
        boton7.setText("7");
        boton7.setEnabled(true);
        boton7.setMnemonic('7');
        panel.add(boton7);
        boton8=new JButton();
        boton8.setBounds(60, 345, 40, 40);
        boton8.setText("8");
        boton8.setEnabled(true);
        boton8.setMnemonic('8');
        panel.add(boton8);
        boton9=new JButton();
        boton9.setBounds(110, 345, 40, 40);
        boton9.setText("9");
        boton9.setEnabled(true);
        boton9.setMnemonic('9');
        panel.add(boton9);
        botonPunto=new JButton();
        botonPunto.setBounds(10, 395, 40, 40);
        botonPunto.setText(".");
        botonPunto.setEnabled(true);
        botonPunto.setMnemonic('.');
        panel.add(botonPunto);
        boton0=new JButton();
        boton0.setBounds(60, 395, 40, 40);
        boton0.setText("0");
        boton0.setEnabled(true);
        boton0.setMnemonic('0');
        panel.add(boton0);
        botonIgual=new JButton();
        botonIgual.setBounds(110, 395, 40, 40);
        botonIgual.setText("=");
        botonIgual.setEnabled(true);
        botonIgual.setMnemonic('=');
        panel.add(botonIgual);
        botonSuma=new JButton();
        botonSuma.setBounds(170, 245, 40, 40);
        botonSuma.setText("+");
        botonSuma.setEnabled(true);
        botonSuma.setMnemonic('+');
        panel.add(botonSuma);
        botonResta=new JButton();
        botonResta.setBounds(220, 245, 40, 40);
        botonResta.setText("-");
        botonResta.setEnabled(true);
        botonResta.setMnemonic('-');
        panel.add(botonResta);
        botonMultiplicacion=new JButton();
        botonMultiplicacion.setBounds(270, 245, 40, 40);
        botonMultiplicacion.setText("x");
        botonMultiplicacion.setEnabled(true);
        botonMultiplicacion.setMnemonic('x');
        panel.add(botonMultiplicacion);
        botonDivision=new JButton();
        botonDivision.setBounds(170, 295, 40, 40);
        botonDivision.setText("/");
        botonDivision.setEnabled(true);
        botonDivision.setMnemonic('/');
        panel.add(botonDivision);
        botonConjugado=new JButton();
        botonConjugado.setBounds(220, 295, 40, 40);
        botonConjugado.setText("Conj");
        botonConjugado.setEnabled(true);
        botonConjugado.setMnemonic('C');
        panel.add(botonConjugado);
        botonNorma=new JButton();
        botonNorma.setBounds(270, 295, 40, 40);
        botonNorma.setText("Nor");
        botonNorma.setEnabled(true);
        botonNorma.setMnemonic('N');
        panel.add(botonNorma);
        
        ActionListener oyeBotonh;
        oyeBotonh = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                    ActionListener oyeBoton1=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta1.setText(etiqueta1.getText()+"1");
                        }
                    };
                    boton1.addActionListener(oyeBoton1);
                    ActionListener oyeBoton2=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta1.setText(etiqueta1.getText()+"2");
                        }
                    };
                    boton2.addActionListener(oyeBoton2);
                    ActionListener oyeBoton3=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta1.setText(etiqueta1.getText()+"3");
                        }
                    };
                    boton3.addActionListener(oyeBoton3);
                    ActionListener oyeBoton4=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta1.setText(etiqueta1.getText()+"4");
                        }
                    };
                    boton4.addActionListener(oyeBoton4);
                    ActionListener oyeBoton5=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta1.setText(etiqueta1.getText()+"5");
                        }
                    };
                    boton5.addActionListener(oyeBoton5);
                    ActionListener oyeBoton6=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta1.setText(etiqueta1.getText()+"6");
                        }
                    };
                    boton6.addActionListener(oyeBoton6);
                    ActionListener oyeBoton7=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta1.setText(etiqueta1.getText()+"7");
                        }
                    };
                    boton7.addActionListener(oyeBoton7);
                    ActionListener oyeBoton8=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta1.setText(etiqueta1.getText()+"8");
                        }
                    };
                    boton8.addActionListener(oyeBoton8);
                    ActionListener oyeBoton9=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta1.setText(etiqueta1.getText()+"9");
                        }
                    };
                    boton9.addActionListener(oyeBoton9);
                    ActionListener oyeBoton0=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta1.setText(etiqueta1.getText()+"0");
                        }
                    };
                    boton0.addActionListener(oyeBoton0);
                    
                }
            
        };
        botonNextD.addActionListener(oyeBotonh);
        
        ActionListener oyeBotonj;
        oyeBotonj = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                    ActionListener oyeBoton1=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta2.setText(etiqueta2.getText()+"1");
                        }
                    };
                    boton1.addActionListener(oyeBoton1);
                    ActionListener oyeBoton2=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta2.setText(etiqueta2.getText()+"2");
                        }
                    };
                    boton2.addActionListener(oyeBoton2);
                    ActionListener oyeBoton3=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta2.setText(etiqueta2.getText()+"3");
                        }
                    };
                    boton3.addActionListener(oyeBoton3);
                    ActionListener oyeBoton4=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta2.setText(etiqueta2.getText()+"4");
                        }
                    };
                    boton4.addActionListener(oyeBoton4);
                    ActionListener oyeBoton5=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta2.setText(etiqueta2.getText()+"5");
                        }
                    };
                    boton5.addActionListener(oyeBoton5);
                    ActionListener oyeBoton6=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta2.setText(etiqueta2.getText()+"6");
                        }
                    };
                    boton6.addActionListener(oyeBoton6);
                    ActionListener oyeBoton7=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta2.setText(etiqueta2.getText()+"7");
                        }
                    };
                    boton7.addActionListener(oyeBoton7);
                    ActionListener oyeBoton8=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta2.setText(etiqueta2.getText()+"8");
                        }
                    };
                    boton8.addActionListener(oyeBoton8);
                    ActionListener oyeBoton9=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta2.setText(etiqueta2.getText()+"9");
                        }
                    };
                    boton9.addActionListener(oyeBoton9);
                    ActionListener oyeBoton0=new ActionListener() {
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta2.setText(etiqueta2.getText()+"0");
                        }
                    };
                    boton0.addActionListener(oyeBoton0);
                    
                }
                
            
        };
        botonNextI.addActionListener(oyeBotonj);
        
        
    }
}

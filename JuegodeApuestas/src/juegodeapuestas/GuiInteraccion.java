
package juegodeapuestas;

import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Bryant
 */
public class GuiInteraccion extends JFrame implements ActionListener{
    private Timer timer;
    private TimerTask task;
    private int estado; 
    private FileJugadores archivos;
    private JPanel panelJugar;
    private JLabel lbJuego;
    private JLabel lbValorApostado;
    private JButton btnLanzar;
    private ImageIcon imgDado1;
    private ImageIcon imgDado2;
    private JLabel lbDado1;
    private JLabel lbDado2;
    private LogicaJuego juego;
    private int contador;
    public GuiInteraccion(LogicaJuego juego){
        estado = 0;
        contador = 0;
        this.juego = juego;
        archivos = new FileJugadores();
        panelJugar = new JPanel();
        lbJuego = new JLabel("Juego No: " + String.valueOf(juego.getParA().getJuegosGanados() + juego.getParA().getJuegosPerdidos() + 1));
        btnLanzar = new JButton("Lanzar");
        lbValorApostado = new JLabel("Valor apostado: " + String.valueOf(juego.getValApostado()));
        imgDado1 = new ImageIcon("src/Imagenes/dado1.png");        
        imgDado2 = new ImageIcon("src/Imagenes/dado1.png");
        lbDado1 = new JLabel(imgDado1);
        lbDado2 = new JLabel(imgDado2);
        
        
        this.getContentPane().setLayout(null);
        this.setBounds(500, 50, 400, 400);
        this.getContentPane().add(panelJugar);
        
        panelJugar.setBounds(0, 0, 400, 400);
        panelJugar.setBackground(Color.BLACK);
        panelJugar.setLayout(null);
        
        panelJugar.add(lbJuego);
        lbJuego.setFont(new Font("monospaced", Font.BOLD + Font.ITALIC, 24));
        lbJuego.setHorizontalAlignment(JLabel.CENTER);
        lbJuego.setBounds(15, 15, 220, 50);
        lbJuego.setForeground(Color.WHITE);
        
        panelJugar.add(lbValorApostado);
        lbValorApostado.setFont(new Font("monospaced", Font.BOLD + Font.ITALIC, 20));
        lbValorApostado.setHorizontalAlignment(JLabel.CENTER);
        lbValorApostado.setBounds(15, 75, 300, 50);
        lbValorApostado.setForeground(Color.WHITE);
        
        panelJugar.add(btnLanzar);
        btnLanzar.setBounds(15, 200, 220, 50);
        btnLanzar.setFont(new Font("monospaced", Font.BOLD + Font.ITALIC, 24));
        btnLanzar.setBackground(Color.BLACK);
        btnLanzar.setForeground(Color.WHITE);
        
        panelJugar.add(lbDado1);
        lbDado1.setBounds(50, 290, 50, 50);
        
        panelJugar.add(lbDado2);
        lbDado2.setBounds(150, 290, 50, 50);
        
        timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                if(estado == 0){
                    
                }
                if(estado == 1 && contador<15){
                    Random r = new Random();
                    int dadoR1 = r.nextInt(juego.getDado1().getCaras()) + 1;
                    int dadoR2 = r.nextInt(juego.getDado2().getCaras()) + 1;
                    imgDado1 = new ImageIcon("src/Imagenes/dado"+String.valueOf(dadoR1)+".png");
                    imgDado2 = new ImageIcon("src/Imagenes/dado"+String.valueOf(dadoR2)+".png");
                    lbDado1.setIcon(imgDado1);
                    lbDado2.setIcon(imgDado2);
                    contador++;
                     
                }
                else if(estado == 1 && contador == 15){
                   estado = 2;
                    System.out.println(contador);
                }
                else if(estado == 2){
                    System.out.println(contador);
                    imgDado1 = new ImageIcon("src/Imagenes/dado"+String.valueOf(juego.getDado1().getNumero())+".png");
                    imgDado2 = new ImageIcon("src/Imagenes/dado"+String.valueOf(juego.getDado2().getNumero())+".png");
                    lbDado1.setIcon(imgDado1);
                    lbDado2.setIcon(imgDado2);
                    contador = 0;
                    if(juego.getconEstado() == 1){
                        AccionFile res = archivos.terminarJuego(juego);
                        JOptionPane.showMessageDialog(null, "Has Ganado", "Has Ganado", JOptionPane.INFORMATION_MESSAGE);
                        timer.cancel();
                        dispose();
                        
                        GuiJuego juegoJue = new GuiJuego(res.getPar());
                        juegoJue.setVisible(true);
                    }
                    else if(juego.getconEstado() == 2){
                        AccionFile res = archivos.terminarJuego(juego);
                        JOptionPane.showMessageDialog(null, "Has Perdido", "Has Perdidio", JOptionPane.ERROR_MESSAGE);
                        timer.cancel();
                        dispose();
                        
                        GuiJuego juegoJue = new GuiJuego(res.getPar());
                        juegoJue.setVisible(true);
                    }
                    estado = 0;
                }
            }
        };
        timer.schedule(task, 0, 100);

        this.setTitle("Juego Dados");
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
               juego.terminarJuegoAntes();
               AccionFile res = archivos.terminarJuego(juego);
               GuiJuego juegoJue = new GuiJuego(res.getPar());
               juegoJue.setVisible(true);
            }
        });
        
        this.btnLanzar.addActionListener(this);
        this.btnLanzar.setActionCommand("lanzar");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("lanzar")){
            juego.lanzar();
            estado = 1;
            contador = 0;
        }
    }
    
    
}

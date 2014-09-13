package JuegoJoJo;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PanelDatos extends JPanel implements ActionListener{

	public static final long serialVersionUID = -4276379850493925908L;

	public final static String NEWGAME = "NEWGAME";
    
	public JLabel labBolas;
	public JLabel labPuntos;
	public JLabel labVacia;
	public JTextField textBolas;
	public JTextField textPuntos;
	public JButton juegoNuevo;
	public InterfazCrashBalls principal;
    
    public PanelDatos(InterfazCrashBalls principal){
    	
        setLayout(new GridLayout(2, 7));
        setPreferredSize(new Dimension(0, 65));

        TitledBorder borde = BorderFactory.createTitledBorder("");
        borde.setBorder(BorderFactory.createLineBorder(Color.RED));
        setBorder(borde);
        
        labPuntos = new JLabel("Puntos:");
        labPuntos.setForeground(Color.white);
        labBolas = new JLabel("Bolas Restantes:");
        labBolas.setForeground(Color.white);
        labVacia = new JLabel("");

        textPuntos = new JTextField(20);
        textBolas = new JTextField(20);
        juegoNuevo = new JButton("Iniciar Juego Nuevo");
        
        textPuntos.setEditable(false);
        textBolas.setEditable(false);
        
        textPuntos.setForeground(Color.BLACK);
        textPuntos.setBackground(Color.WHITE);
        textBolas.setForeground(Color.BLACK);
        textBolas.setBackground(Color.WHITE);
        
        this.setBackground(Color.DARK_GRAY);
        
        add(labPuntos);
        add(textPuntos);
        add(labVacia);
        add(labVacia);
        add(labVacia);
        add(labVacia);
        add(juegoNuevo);
       
        
        add(labBolas);
        add(textBolas); 
        add(labVacia);
        add(labVacia);
        add(labVacia);
        add(labVacia);
        add(labVacia);
        
        juegoNuevo.setActionCommand(NEWGAME);
        
        juegoNuevo.addActionListener(this);
     
        this.principal = principal;
    }
    public void actualizarRemanente(int x){
    	textBolas.setText(Integer.toString(x));
    }
    public void actualizarPuntos(int x){
    	textPuntos.setText(Integer.toString(x));
    }
    public void actualizarCondicion(){
    }
    public void actionPerformed(ActionEvent evento){
        String comando = evento.getActionCommand();
        if(comando.equals(NEWGAME)) {
			String args[] = new String[1];
			//InterfazCrashBalls.clip.stop();
			//InterfazCrashBalls.dificil.stop();
			//InterfazCrashBalls.gameover.stop();
			//InterfazCrashBalls.main(args);
			principal.dispose();
        }
    }
}

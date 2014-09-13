package JuegoJoJo;
import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.applet.*;
import java.net.*;

public class InterfazCrashBalls extends JFrame implements KeyListener{
	public static final long serialVersionUID = 1651412731291636731L;
	public PanelDatos panelDatos;
	public PanelTablero panelTablero;
    //public static AudioClip clip; 
    //public static AudioClip boom;
    //public static AudioClip warning;
    //public static AudioClip dificil;
    //public static AudioClip gameover;
    
	public InterfazCrashBalls(){
		this.setTitle("CRASH BALLS!");
        this.setSize(450,512);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        
        panelDatos = new PanelDatos(this);
        this.add(panelDatos, BorderLayout.NORTH);
        
        panelTablero = new PanelTablero(this);
        add(panelTablero, BorderLayout.CENTER);
        /*
        try {
			clip = Applet.newAudioClip(new URL("http://midi.mididatabase.com/gunsnroses/Sweet_Child_O_Mine.mid"));
			boom = Applet.newAudioClip(new URL("http://download1346.mediafire.com/2u7r5ddowlig/tft4warcp59r4or/bomb.wav"));
			warning = Applet.newAudioClip(new URL("http://download1472.mediafire.com/11s21p2vvlfg/hvx425rbud048ts/warning.wav"));
			dificil = Applet.newAudioClip(new URL("http://www.rpgamer.com/games/ff/ff7/sounds/midi/final.mid"));
			gameover = Applet.newAudioClip(new URL("http://www.fortunecity.com/rivendell/lunar/139/over.mid"));
		} 
        catch (MalformedURLException e) {
			e.printStackTrace();
		}*/
        //Bendito sea san google http://www.cs.cmu.edu/~illah/CLASSDOCS/javasound.pdf
        
		this.addKeyListener(this);
		this.setFocusable(true);
        
	}
	public static void main(String[]Args){
		InterfazCrashBalls interfazCrashBalls = new InterfazCrashBalls(); 
        interfazCrashBalls.setVisible(true);
       // clip.loop();
	}  
	
	public void actualizarNumero(int x){
		panelDatos.actualizarRemanente(x);
	}
	
	public void actualizarPuntaje(int m){
		panelDatos.actualizarPuntos(m);
	}

    public void keyReleased(KeyEvent e) {}
    
    public void keyTyped(KeyEvent e) {}
    
    public void keyPressed(KeyEvent e){
	       int Code = e.getKeyCode();
	       panelTablero.teclaPresionada(Code);
    }
    
	 
  }


/**
 */
public class Jugador
{
    // instance variables - replace the example below with your own
    public int xj;
    public int yj;
    public int vidas;

    /**
     * Constructor for objects of class Jugador
     */
    public Jugador()
    {
        // initialise instance variables
        xj = 0;
        yj = 4;
        vidas = 6;
    }
    public void iniciarJugador(){
        xj = 0;
        yj = 4;
        vidas = 6;
    }
    public void moverJugador(String on){
        String in = on;
        if (in == "ARRIBA"){yj--;}
        if (in == "ABAJO"){yj++;}
        if (in == "DERECHA"){xj++;}
        if (in == "IZQUIERDA"){xj--;}
        if (yj<0){yj=0;}
        if (yj>8){yj=8;}
        if (xj<0){xj=0;}
        if (xj>17){xj=17;}
    }
    
    public void modVidas(double aleph){
        if (aleph > 0.5){ 
            vidas--;
            if (vidas < 0){vidas=0;}
            System.out.println("Batalla!");
            System.out.println("El monstruo ataca!");
            System.out.println("Has perdido una vida!, te quedan "+vidas);
            if(vidas>0){
                System.out.println("");
                System.out.println("");
                System.out.println("");
            }
            else{
                System.out.println("");
            }
        }
    }
    public void modVidasEsp(double aleph){
        if (aleph > 0.5){ 
            vidas -= 2;
            if (vidas < 0){vidas=0;}            
            System.out.println("ENFRENTAMIENTO DIRECTO!, estan en la misma linea!");
            System.out.println("El monstruo ataca!");
            System.out.println("GOLPE CRITICO, has perdido dos vidas!, te quedan "+vidas);
            if(vidas>0){
                System.out.println("");
                System.out.println("");
                System.out.println("");
            }
            else{
                System.out.println("");
            }
        }
    }
}

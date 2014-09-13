import java.util.Scanner;
import java.io.*;

public class Juego
{
    // instance variables - replace the example below with your own
    private Jugador jugador;
    private Monstruo monstruo;
    private Castillo castillo;
    
    /**
     * Constructor for objects of class Juego
     */
    public Juego()
    {
        jugador = new Jugador();
        monstruo = new Monstruo();
        castillo = new Castillo(jugador, monstruo);
    }
    
    public void elJuego(){
        jugador.iniciarJugador();
        monstruo.iniciarMonstruo();
        castillo.mensajeBienvenida();
        
        System.out.println("Ingrese su nombre: ");
        Scanner name = new Scanner(System.in);
        String nombre = name.next();
        
        castillo.relleno();
        castillo.relleno();
        castillo.relleno();
        
        String mapa[][] = new String [9][18];
        for (int j=0; j<9;++j){
            for (int i=0; i<18; ++i){
                mapa[j][i]="  ";
            }
        }
        mapa[4][0]=":)";
        mapa[4][17]="8(";
        castillo.relleno();        
        for (int j=0; j<9;++j){
            for (int i=0; i<18; ++i){
                System.out.print("["+mapa[j][i]+"]");         
            }
            System.out.println("");
        }
        System.out.println("Distancia "+nombre+" a Monstruo: "+(Math.abs(monstruo.xm-jugador.xj)+Math.abs(monstruo.ym-jugador.yj))); 
        
        castillo.relleno();
        castillo.relleno();
        castillo.relleno();
        
        boolean juego = true;
        while (juego){
            mapa[jugador.yj][jugador.xj]="  ";
            mapa[monstruo.ym][monstruo.xm]="  ";
            String ok = "";
             for (boolean intento=true; intento;){
                Scanner z7 = new Scanner(System.in);
                String recibio = z7.next();
                char movj = recibio.charAt(0);
                if(movj=='U'){ok="ARRIBA"; intento=false;}
                if(movj=='D'){ok="ABAJO"; intento=false;}
                if(movj=='R'){ok="DERECHA"; intento=false;}
                if(movj=='L'){ok="IZQUIERDA"; intento=false;}
                if(movj=='S'){intento=false;}
                if((movj!='U')&&(movj!='D')&&(movj!='R')&&(movj!='L')&&(movj!='S')){
                    System.out.println("Instruccion invalida, intente nuevamente!");
                }
            }
            jugador.moverJugador(ok);
            monstruo.moverMonstruo();
            mapa[jugador.yj][jugador.xj]=":)";
            mapa[monstruo.ym][monstruo.xm]="8(";
            castillo.filler();
            for (int j=0; j<9;++j){
               for (int i=0; i<18; ++i){
                    System.out.print("["+mapa[j][i]+"]");         
               }
               System.out.println("");
            }
            int dist = (Math.abs(monstruo.xm-jugador.xj)+Math.abs(monstruo.ym-jugador.yj));
            System.out.println("Distancia "+nombre+" a Monstruo: "+dist);    
            if (dist <= 7){
                castillo.batallar();
            }
            else{
                castillo.relleno();
                castillo.relleno();
                castillo.relleno();
            }
            if (jugador.vidas==0){
                mapa[jugador.yj][jugador.xj]=":(";
                mapa[monstruo.ym][monstruo.xm]="8)";
                castillo.filler();
                for (int j=0; j<9;++j){
                    for (int i=0; i<18; ++i){
                         System.out.print("["+mapa[j][i]+"]");         
                    }
                    System.out.println("");
                }
                castillo.batallarFinal();
                System.out.println("FIN DEL JUEGO!, has sido derrotado por el Monstruo!");
                juego = false;
                castillo.relleno();
            }
            if (monstruo.energia==0){
                mapa[jugador.yj][jugador.xj]=":D";
                mapa[monstruo.ym][monstruo.xm]="x(";
                castillo.filler();
                for (int j=0; j<9;++j){
                    for (int i=0; i<18; ++i){
                         System.out.print("["+mapa[j][i]+"]");         
                    }
                    System.out.println("");
                }
                castillo.batallarFinal();
                System.out.println("FIN DEL JUEGO!, "+nombre+" ha surgido victorioso!");
                juego = false;
                castillo.relleno();
            }
        }
    }
}



/**
 * Write a description of class Monstruo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monstruo
{
    // instance variables - replace the example below with your own
    public int xm;
    public int ym;
    public int energia;

    /**
     * Constructor for objects of class Monstruo
     */
    public Monstruo()
    {
        // initialise instance variables
        xm = 17;
        ym = 4;
        energia = 100;
    }
    public void iniciarMonstruo(){
        xm = 17;
        ym = 4;
        energia = 100;
    }
    public void moverMonstruo(){
        double movMons = Math.random();
        if (movMons<0.4){xm--;}
        if ((movMons>=0.4)&&(movMons<0.6)){ym++;}
        if ((movMons>=0.6)&&(movMons<0.8)){ym--;}
        if (movMons>=0.8){xm++;}
        if (ym<0){ym=0;}
        if (ym>8){ym=8;}
        if (xm<0){xm=0;}
        if (xm>17){xm=17;}
    }
    
    public void modVidas(double aleph){
        if (aleph < 0.5){ 
            energia -= 20;
            if (energia < 0){energia = 0;}
            System.out.println("Batalla!");
            System.out.println("El jugador ataca!");
            System.out.println("El monstruo ha perdido 20 de energia!, le queda "+energia);
            if(energia>0){
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
        if (aleph < 0.5){ 
            energia -= 40;
            if (energia < 0){energia = 0;}
            System.out.println("ENFRENTAMIENTO DIRECTO!, estan en la misma linea!");   
            System.out.println("El jugador ataca!");
            System.out.println("GOLPE CRITICO! El monstruo ha perdido 40 de energia!, le queda "+energia);
            if(energia>0){
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

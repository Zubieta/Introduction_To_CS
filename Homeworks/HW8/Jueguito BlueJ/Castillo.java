
/**
 */
public class Castillo
{
    // instance variables - replace the example below with your own
    private Jugador jugador;
    private Monstruo monstruo;
    /**
     * Constructor for objects of class Castillo
     */
    public Castillo(Jugador miJugador, Monstruo miMonstruo)
    {
        // initialise instance variables
        jugador = miJugador;
        monstruo = miMonstruo;
    }
    
    public void mensajeBienvenida(){
        System.out.println("Instrucciones: ");
        System.out.println("Para moverse escriba U(up), R(right), D(down) o L(left), si desea");
        System.out.println("mantenerse quieto escriba S(stay). El jugador empieza con 6 vidas");
        System.out.println("el monstruo con 100 de energia. Si la distancia entre ambos es de");   
        System.out.println("7 casillas o menos, ocurre una batalla, donde el ganador se escoje");   
        System.out.println("aleatoriamente. Ademas, si al ocurrir una batalla el jugador y el");
        System.out.println("monstruo estan en linea recta, esto se llamara un enfrentamiento");
        System.out.println("directo y se pierde el doble (El jugador pierde 2 vidas en vez de");
        System.out.println("1, o el monstruo 40 de energia en vez de 20).");
    }
    public void batallar(){
        if ((Math.abs(monstruo.xm-jugador.xj)==0)||(Math.abs(monstruo.ym-jugador.yj)==0)){
            double k= Math.random();
            jugador.modVidasEsp(k);
            monstruo.modVidasEsp(k);
        }
        else{
           double k= Math.random();
           jugador.modVidas(k);
           monstruo.modVidas(k);
        }
    }
    public void batallarFinal(){
        if ((Math.abs(monstruo.xm-jugador.xj)==0)||(Math.abs(monstruo.ym-jugador.yj)==0)){
            if(jugador.vidas==0){
                jugador.modVidasEsp(0.7);
            }
            if(monstruo.energia==0){
                monstruo.modVidasEsp(0.2);
            }
        }
        else{
            if(jugador.vidas==0){
                 jugador.modVidas(0.7);
            }
            if(monstruo.energia==0){
                monstruo.modVidas(0.2);
            }
        }
    }
    public void relleno(){
        System.out.println("");
        System.out.println(""); 
    }
    public void filler(){
        for (int n=0; n<30;n++){
             System.out.println("");
        }
    }
}

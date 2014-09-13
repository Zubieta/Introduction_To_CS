package JuegoJoJo;
import javax.swing.*;

import java.awt.Graphics;
import java.awt.Color;


public class PanelTablero extends JComponent{
	public static final long serialVersionUID = 1737942105620662762L;
	public Bola bola;
    public Bola Tablero[][];
    public int limite;
    public boolean firstRunTestB;
    public boolean pasaPorVertical;
    public int puntaje;
    public int multiplicador;
    public int contaencuentra;
    public InterfazCrashBalls principal;
    public Operador operador;
    public boolean worst;
    
	public PanelTablero(InterfazCrashBalls principal){	
		worst = false;
		firstRunTestB = true;
		multiplicador = 0;
		puntaje = 0;
		
		operador = new Operador(this);

        Tablero = new Bola[18][17];
        operador.creacionMatriz();
        this.principal = principal;
        operador.rellenar108();
       // erika.gomez@ieee.org
    }
	
	public void actualizarNumBolas(int xn){
		principal.actualizarNumero(xn);
	}
    
	 public void teclaPresionada(int Code){ 
		 firstRunTestB=false;
		 operador.tecleo(Code);
     }
	 
	public void destruir(int x, int y){
		contaencuentra = 1;
		Tablero[x][y].destruible = true;
		busquedaRecursiva(x,y);		
		multiplicador = 0;
		boolean destruyo = false;
		for(int k=0;k<18;++k){
			for(int i=0;i<17;++i){
				if(contaencuentra>=3 && Tablero[k][i].destruible==true){
					if(destruyo==false){
						bola = new Bola(1);
					}
					else{
						bola = new Bola(0);
						operador.numBolas--;
					}
					Tablero[k][i] = bola;
					destruyo = true;
					multiplicador++;
				}
				else{
					Tablero[k][i].destruible=false;
				}
			}
		}
		if(multiplicador>=3 && firstRunTestB==false){
			//InterfazCrashBalls.boom.play();
			puntaje += 30+(multiplicador-3)*5*multiplicador;
		}
	}
	 public void busquedaRecursiva(int x, int y){
	      Tablero[x][y].destruible=true;
	        if(y<16&& Tablero[x][y+1].destruible == false && Tablero[x][y+1].aleatorio == Tablero[x][y].aleatorio){
	            contaencuentra++;
	            Tablero[x][y+1].destruible=true;
	            busquedaRecursiva(x, y+1);
	          }
	        if(x<17&&Tablero[x+1][y].destruible == false && Tablero[x+1][y].aleatorio == Tablero[x][y].aleatorio){
	        	contaencuentra++;
	            Tablero[x+1][y].destruible=true;
	            busquedaRecursiva(x+1, y);
	          }
	       if(y>1&&Tablero[x][y-1].destruible == false && Tablero[x][y-1].aleatorio == Tablero[x][y].aleatorio){
	    	   contaencuentra++;
	            Tablero[x][y-1].destruible=true;
	            busquedaRecursiva(x, y-1);
	          }
	       if(x>0&&Tablero[x-1][y].destruible == false && Tablero[x-1][y].aleatorio == Tablero[x][y].aleatorio){
		  		contaencuentra++;
	            Tablero[x-1][y].destruible=true;
	            busquedaRecursiva(x-1, y);
	          }
	        
	      }
	
	
	public void actualizadorPuntos(){
		principal.actualizarPuntaje(puntaje);
	}
	
	public void paint(Graphics g){		
		super.paintComponent(g);	
		g.setColor(Color.black);
		g.fillRect(0, 0, 450, 540);
		for(int i=0;i<18;++i){
				for(int j=0;j<17;++j){
					g.setColor(bola.colorear(Tablero[i][j].aleatorio));
					g.fillOval(i*25, j*25, 25, 25);
					g.setColor(bola.colorear(Tablero[i][j].aleatorio).darker());
					g.fillOval(i*25, j*25,20,20);
				}
		}
		g.setColor(Color.RED);
	    g.drawLine(0, 25+(operador.movimientos*25)/40, this.getSize().width, 25+(operador.movimientos*25)/40);
	    g.drawLine(0, 26+(operador.movimientos*25)/40, this.getSize().width, 26+(operador.movimientos*25)/40);
		g.setColor(Color.WHITE);
	    g.drawLine(0, 25, this.getSize().width, 25);
	    g.drawLine(0, 26, this.getSize().width, 26);
	    int primbal=17;
	    int secbal=17;
	    for(int i=16;i>0 && Tablero[operador.x1][i].aleatorio!=0;--i){
	    		primbal = i;
	    }
	    for(int i=16;i>0 && Tablero[operador.x2][i].aleatorio!=0;--i){
	    		secbal = i;
	    }

	    operador.actualizarNumeroBolas();
	    if(operador.nadyet == true){
	    	g.setColor(bola.colorear(Tablero[operador.x1][0].aleatorio));
	    	g.drawLine(operador.x1*25+12,25,operador.x1*25+12,primbal*25);
	    	g.setColor(bola.colorear(Tablero[operador.x1][0].aleatorio).darker());
	    	g.fillOval(operador.x1*25, (primbal-1)*25, 25, 25);

	    	g.setColor(bola.colorear(Tablero[operador.x2][0].aleatorio));
	    	g.drawLine(operador.x2*25+12,25,operador.x2*25+12,secbal*25);
	    	g.setColor(bola.colorear(Tablero[operador.x2][0].aleatorio).darker());
	    	g.fillOval(operador.x2*25,(secbal-1)*25, 25, 25);
	   
	    	operador.verificacionLimite();
	    }
	    else{
	    	g.setColor(bola.colorear(operador.exone));
	    	g.drawLine(operador.x1*25+12,(operador.y1+1)*25,operador.x1*25+12,primbal*25);
	    	if(operador.y1!=primbal){
	    		g.setColor(bola.colorear(operador.exone).darker());
	    		g.fillOval(operador.x1*25,(primbal-1)*25, 25, 25);
	    		
	    	}

	    	g.setColor(bola.colorear(operador.extwo));
	    	g.drawLine(operador.x2*25+12,(operador.y2+1)*25,operador.x2*25+12,secbal*25);
	    	if(operador.y2!=secbal){
	    		g.setColor(bola.colorear(operador.extwo).darker());
	    		g.fillOval(operador.x2*25,(secbal-1)*25, 25, 25);
	    	}
	    }
	    if(operador.juego==false){
	    	g.setColor(Color.WHITE);
	    	g.drawString("HAS PERDIDO EL JUEGO", 15, 20);
	    	g.drawString("TU PUNTAJE ES:", 300, 20);
	    	g.drawString(Integer.toString(puntaje), 400, 20);
	    }
	    else{
	    	int side = 0;
	    	if(operador.x1<=2){side = 1;}
	    	g.setColor(Color.red);
	    	g.fillRect(0+side*390, 0, 60, 20);
	    	g.setColor(Color.DARK_GRAY);
	    	g.fillRect(1+side*390,1,58,18);
	    	g.setColor(Color.white);
	    	g.drawString("next:", 3+side*390, 14);
	    	g.setColor(operador.nextBola1.colorear(operador.nextBola1.aleatorio));
	    	g.fillOval(35+side*390,4,10,10);
	    	g.setColor(operador.nextBola2.colorear(operador.nextBola2.aleatorio));
	    	g.fillOval(45+side*390,4,10,10);
	    }
	}
	
	
}

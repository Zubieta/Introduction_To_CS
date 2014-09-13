package JuegoJoJo;
import javax.swing.*;

public class Operador extends JComponent{

	public static final long serialVersionUID = 1L;
	public PanelTablero panelTablero;
	public Bola bola;
    public int x1;
    public int x2;
    public int y1;
    public int y2;
    public int numBolas;
    public boolean juego;
    public int movimientos;
    public boolean nadyet;
    public int exone;
    public int extwo;
    public Bola nextBola1;
    public Bola nextBola2;
    
	public Operador(PanelTablero panelTablero){
		x1=8;
		x2=9;
		numBolas = 0;
		movimientos = 0;
		juego = true;
		this.panelTablero = panelTablero;
		nadyet = true;
		nextBola1 = new Bola(1);
		nextBola2 = new Bola(1);
	}
	
	
	public void rellenar108(){
		Bola bola;
		while(numBolas<108){
			actualizarNumeroBolas();
       		for(int j=0;j<18 && numBolas< 108;++j){
       			for(int i=16;i>0 && numBolas < 108;--i){
       				if(panelTablero.Tablero[j][i].aleatorio==0){
       					bola = new Bola(1);
       					panelTablero.Tablero[j][i] = bola;
       					numBolas++;
       					break;
       				}
       			}
       		}
       	desplazadorGeneral();
       	}
    }
	 public void delayah() {
	     try {
	    	 Thread.sleep(75);
	       }
	     catch (InterruptedException e) {
	    	 e.printStackTrace();
	       }
	 }  
	 
	public void creacionMatriz(){
		for(int j=0;j<18;++j){
			int limite = (int)(Math.random()*6+1);
			for(int i=16;i>17-limite;--i){
				bola = new Bola(1);
				panelTablero.Tablero[j][i]=bola; 
				numBolas++;
			}
   		
			for(int i=17-limite;i>=0;--i){
				if(i==0&&(j==8||j==9)){
					bola = new Bola(1);
					panelTablero.Tablero[j][i] = bola;
 				}
				else{
					bola = new Bola(0);
					panelTablero.Tablero[j][i]=bola;
				}
			}
		}
 	}
	
	
	public void tecleo(int Code){
		if(Code==90&&juego){
			JOptionPane.showMessageDialog(panelTablero,"Hecho por Santiago Zubieta, 201110032010");			
		}
		if(Code==39&&juego){//derecha 
	    	   if(x2!=17){
	    		   panelTablero.Tablero[x2+1][0]=panelTablero.Tablero[x2][0];
	    		   panelTablero.Tablero[x2][0]=panelTablero.Tablero[x1][0];
	    		   bola = new Bola(0);
	    		   panelTablero.Tablero[x1][0]=bola;
	    		   x1++;
	    		   x2++;
	    		   panelTablero.repaint();
	    	   }
	     } 
	     if(Code==37&&juego){ //izquierda
	    	   if(x1!=0){
	    		   panelTablero.Tablero[x1-1][0]=panelTablero.Tablero[x1][0];
	    		   panelTablero.Tablero[x1][0]=panelTablero.Tablero[x2][0];
	    		   bola = new Bola(0);
	    		   panelTablero.Tablero[x2][0]=bola;
	    		   x1--;
	    		   x2--;
		    	   panelTablero.repaint();
	    	   }     
	     } 
	     if(Code==69&&juego){
				JOptionPane.showMessageDialog(panelTablero,"Gracias Dr.Edi por la ayuda y las clases!");			
			}
	     if(Code==38&&juego){//arriba 
	    	   Bola temp;
	    	   temp=panelTablero.Tablero[x1][0];
	    	   panelTablero.Tablero[x1][0]=panelTablero.Tablero[x2][0];
	    	   panelTablero.Tablero[x2][0]=temp;
	    	   panelTablero.repaint();
	     } 
	     if(Code==40&&juego){//abajo 
	    	   y1 = 0;
	    	   y2 = 0;
	    	   exone = panelTablero.Tablero[x1][0].aleatorio;
	    	   extwo = panelTablero.Tablero[x2][0].aleatorio;
	    	   boolean e1 = true;
	    	   boolean e2 = true;
	    	   nadyet = false;
	    	   while(e1||e2){
	    		   e1 = false;
	    		   e2 = false;
	    		   if(panelTablero.Tablero[x1][y1+1].aleatorio==0 && y1!=15){
	    			   e1 = true;
	    	    	   panelTablero.Tablero[x1][y1+1]=panelTablero.Tablero[x1][y1];
	    	    	   bola = new Bola(0);
	    	    	   panelTablero.Tablero[x1][y1]=bola;
	    	    	   y1++;
	    		   }
	    		   if(panelTablero.Tablero[x2][y2+1].aleatorio==0 && y2!=15){
	    			   e2 = true;
	    	    	   panelTablero.Tablero[x2][y2+1]=panelTablero.Tablero[x2][y2];
	    	    	   bola = new Bola(0);
	    	    	   panelTablero.Tablero[x2][y2]=bola;
	    	    	   y2++;
	    		   }
	    		   
	    		   delayah();
	    		   panelTablero.paintImmediately(0,0,1000,1000);   
	    	   }
	    	   x1=8;
	    	   x2=9;
	    	   y1=0;
	    	   y2=0;	    	   
	    	   panelTablero.Tablero[8][0]= nextBola1;
	    	   panelTablero.Tablero[9][0]= nextBola2;
	    	   bola = new Bola(1);
	    	   nextBola1 = bola;
	    	   bola = new Bola(1);
	    	   nextBola2 = bola;
	    	   movimientos++;
	    	   nadyet = true;
	    	   panelTablero.repaint();
	    	   desplazadorGeneral();
	    	   advertencia();
	    	   if(panelTablero.worst==false){
	    		   dificil();
	    	   }
	     } 
	}
	
	
	public void desplazadorGeneral(){
		for(int m=0;m<100;++m){	
			for(int k=0;k<18;++k){
				for(int i=1;i<17;++i){
					if(panelTablero.Tablero[k][i].aleatorio!=0){
						panelTablero.destruir(k,i);
					}
				}
			}
			desplazarInferior();
			panelTablero.actualizadorPuntos();
			actualizarNumeroBolas();
		}
	}
	
	public void actualizarNumeroBolas(){
		numBolas = 0;
		for(int j=0;j<18;++j){
			for(int k=1;k<17;++k){
				if(panelTablero.Tablero[j][k].aleatorio!=0){
					numBolas++;
				}
			}
		}
		panelTablero.actualizarNumBolas(numBolas);
	}

	public void desplazarInferior(){
		boolean encontro=true;
		while(encontro){
			encontro = false;
		for(int i=0;i<18;++i){
			for(int j=1;j<16;++j){				
					if(panelTablero.Tablero[i][j+1].aleatorio==0 && panelTablero.Tablero[i][j].aleatorio!=0){
						bola=new Bola(0);
						panelTablero.Tablero[i][j+1]=panelTablero.Tablero[i][j];
						panelTablero.Tablero[i][j]=bola;						  
						encontro = true;
						panelTablero.repaint();
					}
			}
		}
	}
	}
	

	public void verificacionLimite(){
		for(int f=0;f<18;++f){
			if(panelTablero.Tablero[f][movimientos/40+1].aleatorio!=0 && panelTablero.Tablero[f][movimientos/40+2].aleatorio!=0){
				juego = false;
				if(panelTablero.worst==true){
					//InterfazCrashBalls.dificil.stop();
				}
				else{
					//InterfazCrashBalls.clip.stop();
				}
				//InterfazCrashBalls.gameover.loop();
				break;
			}
		}
	}
	public void advertencia(){
		for(int f=0;f<18;++f){
			if(panelTablero.Tablero[f][movimientos/40+1].aleatorio==0 && panelTablero.Tablero[f][movimientos/40+2].aleatorio!=0){
				//InterfazCrashBalls.warning.play();
				break;
			}
		}	
	}
	public void dificil(){
		if(movimientos/40+1==6){
			//InterfazCrashBalls.clip.stop();
			//InterfazCrashBalls.dificil.loop();
			panelTablero.worst = true;
		}
		
	}

	
}
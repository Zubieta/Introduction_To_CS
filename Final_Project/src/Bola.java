package JuegoJoJo;
import java.awt.Color;

public class Bola {
	public int aleatorio;
	public boolean destruible;
	public Bola(int m){
		if(m==1){
			aleatorio = (int)(Math.random()*6+1);
			destruible = false;
		}
		else{
			aleatorio = 0;
			destruible = false;
		}
	}
	public Color colorear(int k){
		Color color = Color.black;
		if(k==1){color = Color.BLUE;}
		else if(k==2){color = Color.RED;}
		else if(k==3){color = Color.ORANGE;}
		else if(k==4){color = Color.CYAN;}
		else if(k==5){color = Color.GREEN;}
		else if(k==6){color = Color.MAGENTA.darker();}
		else if(k==7){color = Color.WHITE;}
		return color;
	}
	
}
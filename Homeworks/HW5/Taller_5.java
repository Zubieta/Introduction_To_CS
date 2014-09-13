

public class Taller_5
{
    // instance variables - replace the example below with your own
    private int x;

    
    public Taller_5()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Ingrese un numero cualquiera, ya sea entero o decimal para
     * Multiplicar el numero ingresado x 2
     * Por: Santiago Zubieta - 201110032010 
     * 
     */
    void Punto_1A_Multiplicar_Ax2(double ingreseNumero)
    {
      System.out.println("el resultado de multiplicar " + ingreseNumero + " por 2 es:");
	  ingreseNumero = ingreseNumero*2;
      System.out.println(ingreseNumero);
    }
    
    /**
     * En base a un numero X ingresado y un numero Y ingresado
     * Se halla el residuo de su division.
     * por: Santiago Zubieta - 201110032010
     * 
     */
    void Punto_1D_Residuo_de_2_Numeros(int x,int y)
    {
      int c;

      System.out.println("El el residuo de la division de " + x  + "/"  + y  + " es: ");
      c = x/y;
      c = x - c*y;
      System.out.println(c);
    }
    
    /**
     * Utilize este programa para saber cuanto dinero es necesario devolver
     * Se muestran TODOS los billetes, inclusive de los que se devuelven 0.
     * ingrese valorCompra, e ingrese valorPagado
     * por: Santiago Zubieta - 201110032010
     */
    
    void Punto_2D_Devuelta_Almacen_1(int valorCompra,int valorPagado)
    { 
       int c;
       int d;
       System.out.println("El valor de la compra es:");
       System.out.println(valorCompra);
       System.out.println("El monto pagado es:");
       System.out.println(valorPagado);
	   System.out.println("Entonces la devuelta es:");
	   c = valorPagado-valorCompra;
	   System.out.println(c);
	   System.out.println("Distribuida de la siguiente manera:");
       d = c/50000;
	   if (d != 0)
	   	{
	   	System.out.println("Billetes de 50000:");
		System.out.println(d);
		c = c-d*50000;
        }
	   else 
	    {
	    System.out.println("Billetes de 50000:");
		System.out.println("0");
        }
	   d = c/20000;
	   if (d != 0)
		{
		System.out.println("Billetes de 20000:");
	    System.out.println(d);
		c = c-d*20000;
        }
	   else 
		{
		System.out.println("Billetes de 20000:");
		System.out.println("0");
        }
       d = c/10000;
	   if (d != 0)
		{
		System.out.println("Billetes de 10000:");
		System.out.println(d);
		c = c-d*10000;
        }
	   else 
		{
		System.out.println("Billetes de 10000:");
		System.out.println("0");
        }
	   d = c/5000;
       if (d != 0)
		{
		System.out.println("Billetes de 5000:");
		System.out.println(d);
		c = c-d*5000;
        }
	   else 
		{
		System.out.println("Billetes de 5000:");
		System.out.println("0");
        }
	   d = c/2000;
	   if (d != 0)
	    {
	    System.out.println("Billetes de 2000:");
		System.out.println(d);
		c = c-d*2000;
        }
	   else 
	    {
		System.out.println("Billetes de 2000:");
		System.out.println("0");
        }
	   d = c/1000;
	   if (d != 0)
		{System.out.println("Billetes de 1000:");
		System.out.println(d);
		c = c-d*1000;}
	   else 
	   {
	    System.out.println("Billetes de 1000:");
		System.out.println("0");
       }
	   d = c/500;
	   if (d != 0)
	   {
	    System.out.println("Monedas de 500:");
		System.out.println(d);
		c = c-d*500;
       }
	   else 
	   {
	    System.out.println("Monedas de 500:");
		System.out.println("0");
       }
	   d = c/200;
	   if (d != 0)
	   {
	    System.out.println("Monedas de 200:");
		System.out.println(d);
		c = c-d*200;
       }
	   else 
	   {
	    System.out.println("Monedas de 200:");
		System.out.println("0");
       }
	   d = c/100;
	   if (d != 0)
	   {
	    System.out.println("Monedas de 100:");
	   	System.out.println(d);
		c = c-d*100;
       }
	   else 
	   {
	    System.out.println("Monedas de 100:");
		System.out.println("0");
       }
        
    }
    
    /**
    *	Dados tres números, a, b y c, que conforman las longitudes de 
    *   tres segmentos de recta, imprima “si” si esos tres segmentos de 
    *   recta pueden ser los lados de un triángulo o “no” de lo contrario.
    *   Por: Santiago Zubieta - 201110032010
    */
    void Punto_3F_Comprobacion_Lados_Triangulo(double a, double b, double c)
    {
       System.out.print("Los lados de medida " + a + ", " + b + " y " + c);
       if ((a+b>c)&&(b+c>a)&&(c+a>b))
       {
        System.out.println(" pueden hacer un triangulo");
       }
	   else
	   {
	    System.out.println( " no pueden hacer un triangulo");
	   }
    }
    
    /**
     * Utilize este programa para saber cuanto dinero es necesario devolver
     * Solamente se muestran los billetes que se devuelven.
     * ingrese valorCompra, e ingrese valorPagado
     * por: Santiago Zubieta - 201110032010
     */
    
    void Punto_3I_Devuelta_Almacen_2(int valorCompra,int valorPagado)
    { 
       int c;
       int d;
       System.out.println("El valor de la compra es:");
       System.out.println(valorCompra);
       System.out.println("El monto pagado es:");
       System.out.println(valorPagado);
       System.out.println("Entonces la devuelta es:");
   	   c = valorPagado-valorCompra;
	   System.out.println(c);
	   System.out.println("Distribuida de la siguiente manera:");
       d = c/50000;
	   if (d != 0)
	   {
		System.out.println("Billetes de 50000:");
		System.out.println(d);
		c = c-d*50000;
       }
	   d = c/20000;
	   if (d != 0)
	   {
		System.out.println("Billetes de 20000:");
	    System.out.println(d);
		c = c-d*20000;
       }
       d = c/10000;
	   if (d != 0)
	   {
		System.out.println("Billetes de 10000:");
		System.out.println(d);
		c = c-d*10000;
       }
	   d = c/5000;
       if (d != 0)
	   {
	    System.out.println("Billetes de 5000:");
		System.out.println(d);
		c = c-d*5000;
       }
      	d = c/2000;
	   if (d != 0)
	   {
	    System.out.println("Billetes de 2000:");
		System.out.println(d);
		c = c-d*2000;
       }
	   d = c/1000;
	   if (d != 0)
	   {
	    System.out.println("Billetes de 1000:");
		System.out.println(d);
		c = c-d*1000;
       }
	   d = c/500;
	   if (d != 0)
	   {
	    System.out.println("Monedas de 500:");
		System.out.println(d);
		c = c-d*500;
       }
	   d = c/200;
	   if (d != 0)
	   {
	    System.out.println("Monedas de 200:");
		System.out.println(d);
		c = c-d*200;
       }
	   d = c/100;
	   if (d != 0)
	   {
	    System.out.println("Monedas de 100:");
	   	System.out.println(d);
		c = c-d*100;
       }
        
    }
    
    /**
     * Por: Santiago Zubieta - 201110032010
     */
    void Punto_4A_Numeros_Del_1_al_10()
    {
        int x = 1;
        System.out.println("Los numeros del 1 al 10 son:");
	    while (x<=10)
	    {
		  System.out.println(x);
		  x++;
        }

    }
    
    /**
     * Este programa permite hallar el valor de e elevado a un numero x positivo cualquiera.
     * Se utiliza la serie de taylor para hallar una aproximacion utilizando sumatorias.
     * Por: Santiago Zubieta - 201110032010
     * 
     */
    void Punto_4Q_Calcular_e_a_la_x(double x)
    {
 	   double b = x;
	   double zu = 1;
	   double y = 0;
	   double i = 1;
	   double z = 1;
	   double n = 0;
	   double ex = 0;
	   while  (zu >= 0.0001)
	   {
		 y=0;
		 x=b;
            while (y<i)
		 	{
		 	 y++;
		        	 if (y < i)
			     	{
			     	  x= x*b;
			     	}
       		 n=y;
       	     }
		    while (n>1)
			{
			 y = y*(n-1);
			 n--;
            } 
        ex = z*x/y + ex;
     	i=i+1;
        zu= z*x/y;
       }
       ex=ex+1;
       System.out.println("el resultado de e elevado a la " + b + " es de:");
       System.out.println(ex);
    }
    
    /** Un programa que lee dos numeros m,n e imprime el resultado de x para:
     * x = Sum desde i hasta n de ( i + 5*(Sumatoria desde j=1 hasta m de (i + j))
     * Por: Santiago Zubieta - 201110032010
     */
    void Punto_4H_Sumatoria_Anidada(int m, int n )
    {
      int x=0;
	  int i=0;
	  int sum2=0;
	  int sum1=0;
	   while (i<=n)
	  {
		 sum2=0;
		int j=i;
      	   while (j<=m)
		{
	     sum2 = i + j + sum2;
		 j++;
        }
	   sum1=i + 5*sum2 + sum1;
	   i++;
      } 
	  System.out.println("el resultado de la sumatoria con m = " + m + " y n = " + n + " es:");
	  System.out.println(sum1); 

    }
}

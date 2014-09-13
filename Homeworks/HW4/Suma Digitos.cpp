#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    int z;
    cout << "Ingrese un numero entero positivo:" << endl;
    cin >> z;
	int x=0; int j=0; int y=0; int m=10; int a=0; int zu=z;
	while (zu>0)
		{zu = zu/10; 
	 	 x++;}
	cout << "El numero de digitos del dato ingresado es: " << endl;
	cout << x << endl;
	cout << "Y la suma de estos es:" << endl;
	x=x-1; 
    while (x>=0){
	      a=x-1;
          m=10;
          while (a>0){
		     m=m*10;
		     a--;}
	      if (x==0){
		     m=1;}
          y = z/m;
		  y = y - (y/10)*10;
		  j = y + j;
	      x--;}
	cout << j << endl;

                   
    system("PAUSE");
    return EXIT_SUCCESS;
}

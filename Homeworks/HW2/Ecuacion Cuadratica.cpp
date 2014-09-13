#include <cstdlib>
#include <iostream>
#include <cmath>
using namespace std;
int main()
{   
    float a;
    float b;
    float c;
    float d;
    float e;
    float f;
    cout << "Teniendo una ecuacion de la forma: a*x^2 + b*x + c = 0:" << endl << endl;
    cout << "Ingrese el coeficiente de x^2 (a):" << endl;
	cin >> a;
	cout << "Ingrese el coeficiente de x^1 (b):" << endl;
	cin >> b;
	cout << "Ingrese el termino independiente (c):" << endl;
	cin >> c;
	d = (b*b-4*a*c);
	cout << "La solucion a esta ecuacion cuadratica es:" << endl << endl;
	if (d < 0)
		{ cout << "No tiene solucion real" << endl;}
	else
		{ e = (-b+sqrt(d))/(2*a);
		 cout << "Solucion 1:" << endl;
		 cout << e << endl << endl;
		  f = (-b-sqrt(d))/(2*a);
	     cout << "Solucion 2:" << endl;
		 cout << f << endl << endl;}
		 
    system("PAUSE");
    return 0;
}

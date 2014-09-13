#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    int x;
    cout << "Ingrese un numero entero positivo para hallar " << endl <<
            "la parte enterade su raiz cuadrada: " << endl;
    cin >> x;
	int i = 0;
	int k = 0;
	while (i<x)
		{
          k++;     
          i=k*k;
		}
	cout << "la parte entera de la raiz de " <<x<< " es:" << endl;
	if (i==x)
		{cout << k << endl;}
	else
		{k--;
         cout << k << endl;}

    system("PAUSE");
    return 0;
}

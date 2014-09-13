#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    cout << "Decimos que un numero natural es GUAY si es igual a" << endl <<
            "la suma de un cierto numero de naturales consecutivos" << endl <<
            "comenzando en 1." << endl << endl <<
            "Los tres primeros numeros GUAY son: 1; 3(1+2); 6(1+2+3)" << endl << endl <<
            "Ingrese un numero entero positivo para verificar si es GUAY:" << endl;
    int num;
    cin >> num;
	int x=0;
	while (num>0)
		{num=num-x;
		 x++;}
	if (num == 0)
		{cout << "Este SI es un numero GUAY" << endl;}
	else
		{cout << "Este NO no es un numero GUAY" << endl;}

    system("PAUSE");
    return 0;
}

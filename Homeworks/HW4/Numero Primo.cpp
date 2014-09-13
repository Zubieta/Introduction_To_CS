#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    int x;
    cout << "Ingrese un numero entero para verificar si es primo: " << endl;
	cin >> x;
	int n=2;
	int y;
	bool primo=true;
	while ((n<x)&&(primo==true))
		{y=x/n;
		 y=x-y*n;
		 if (y==0)
			{primo=false;}
		 else 
            {primo=true;}
      	n++;}
	if (primo==false)
		{cout << "El numero ingresado NO es numero primo" << endl;}
	else
		{cout << "El numero ingresado SI es numero primo" << endl;}	

    system("PAUSE");
    return 0;
}

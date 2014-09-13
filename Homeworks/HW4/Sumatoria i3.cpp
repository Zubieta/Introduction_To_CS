#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    float n;
    cout << "Ingrese un numero entero positivo:" << endl;
    cin >> n;
	float i=0;
	float x=0;
	while (i<=n)
		{x=i*i*i + x;
		i++;}
	cout << "El resultado de la sumatoria de i^3 desde 0 hasta "<< n <<" es:" << endl;
    cout << x << endl;                   
    system("PAUSE");
    return EXIT_SUCCESS;
}

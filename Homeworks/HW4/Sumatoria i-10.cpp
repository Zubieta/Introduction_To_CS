#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    float n;
    cout << "Ingrese un numero entero positivo: " << endl;
    cin >> n;
	float x=0;
	float i=0;
	while (i<=n)
    	{x=(i-10)+x;
		i++;}
	cout << "El resultado de la sumatoria desde 0 hasta " << n << " de (i-10) es:" << endl;
	cout << x << endl;
    system("PAUSE");
    return EXIT_SUCCESS;
}

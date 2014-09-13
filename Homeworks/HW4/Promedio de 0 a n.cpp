#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    int n;
    cout << "Ingrese un numero entero positivo para calcular " << endl <<
            "el promedio desde 1 hasta este numero:" << endl;
    cin >> n;
	float x=n;
	int z=n;
	float y=1;
	float d;
	while (n>1)
		{x=x+(n-1);
		 y++;
         n--;}
	d = x/y;
	cout << "el promedio entre 1 y " << z << " es:" << endl;
	cout << d << endl;

    system("PAUSE");
    return 0;
}

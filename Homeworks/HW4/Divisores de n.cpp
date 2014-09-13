#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    int n;
    cout << "Ingrese un numero entero:" << endl;
	cin >> n;
	int x=1;
	int y;
    cout << "El numero " << n << " es divisible por:" << endl;
	while (x<=n)
		{y=n/x;
		 y=n-y*x;
			if (y==0)
				{cout << x << endl;}
	   	x++;}	

    system("PAUSE");
    return 0;
}

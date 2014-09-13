#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   cout << "Ingrese un numero entero positivo:" << endl;
    int n;
	cin >> n;
    cout << "Los numeros desde -1 hasta -" << n << "^2 son:" << endl;
    int x=-1;
	while (x>=(-n)*(n)){
		cout << x << endl;
		x--;
    }
          
    system("PAUSE");
    return EXIT_SUCCESS;
}

#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    int a;
    int b;
    int c;
    cout << "Ingrese un numero entero para el dividendo: " << endl;
    cin >> a;
    cout << "Ingrese un numero entero para el divisor: " << endl;
    cin >> b;
    cout << "El el residuo de la division de " << a << "/" << b << " es: " << endl;
    c = a/b;
    c = a - c*b;
    cout << c << endl;
    system("PAUSE");
    return 0;
}

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
    cout << "El resultado la division entera de " << a << "/" << b << " es: " << endl;
    c = a/b;
    cout << c << endl;
    system("PAUSE");
    return 0;
}

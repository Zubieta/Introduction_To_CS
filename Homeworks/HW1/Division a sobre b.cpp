#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    float a;
    float b;
    float c;
    cout << "Ingrese el dividendo: " << endl;
    cin >> a;
    cout << "Ingrese el divisor: " << endl;
    cin >> b;
    cout << "El resultado de " << a << "/" << b << " es: " << endl;
    c = a/b;
    cout << c << endl;
    system("PAUSE");
    return 0;
}

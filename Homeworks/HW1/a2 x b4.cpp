#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    float a;
    float b; 
    float c;
    cout << "Ingrese el valor a para la ecuacion a^2 * b^4: " << endl;
    cin >> a;
    cout << "Ingrese el valor b para la ecuacion a^2 * b^4: " << endl;
    cin >> b;
    cout << "El resultado de la ecuacion con a=" << a << " y b=" << b << " es: " << endl;
    c = a*a*b*b*b*b;
    cout << c << endl;
    system("PAUSE");
    return 0;
}

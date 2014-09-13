#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    float a;
    float b;
    cout << "Ingrese el primer valor de la resta de cuadrados: " << endl;
    cin >> a;
    cout << "Ingrese el segundo valor de la resta de cuadrados: " << endl;
    cin >> b;
    float c;
    c = (a+b)*(a-b);
    cout << "El resultado de la resta de cuadrados es: " << endl;
    cout << c << endl;
    system("PAUSE");
    return 0;
}

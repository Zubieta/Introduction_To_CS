#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
     cout << "Ingrese el primer numero de la suma que desea elevar al cubo: " << endl;
     float a;
     cin >> a;
     cout << "Ingrese el segundo numero de la suma que desea elevar al cubo: " << endl;
     float b;
     cin >> b;
     float c;
     c =(a+b)*(a+b)*(a+b);
     cout << "El resultado de elevar al cubo la suma entre " << a << " y " << b << " es:" << endl;
     cout << c << endl;
    system("PAUSE");
    return 0;
}

#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    int a;
    int b;
    int c;
    cout << "Ingrese el dividendo: " << endl;
    cin >> a;
    cout << "Ingrese el divisor: " << endl;
    cin >> b;
    c = a/b;
    if (a-c*b==0)
       {cout << "Si, " << b << " divide exactamente a " << a << endl;
       cout << "y el resultado es " << c << endl;}
    else
       {cout << "No, " << b << " no divide exactamente a " << a << endl;} 
    system("PAUSE");
    return 0;
}

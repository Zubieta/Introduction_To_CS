#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    float a11;
    float a12;
    float a21;
    float a22;
    float s;
    cout << "---------------"<<endl;
    cout << "|      |      |"<<endl;
    cout << "| a11  | a12  |"<<endl;
    cout << "|      |      |"<<endl;
    cout << "---------------"<<endl;
    cout << "|      |      |"<<endl;
    cout << "| a21  | a22  |"<<endl;
    cout << "|      |      |"<<endl;
    cout << "---------------"<<endl;
    cout << "Ingrese el valor izquierdo superior del determinante (a11):" << endl;
	cin >> a11;
	cout << "Ingrese el valor derecho superior del determinante (a12):" << endl;
	cin >> a12;
	cout << "Ingrese el valor izquierdo inferior del determinante (a21):" << endl;
	cin >> a21;
	cout << "Ingrese el valor derecho inferior del determinante (a22):" << endl;
	cin >> a22;
	s = a11*a22 - a21*a12;
	cout << "La solucion a este determinante 2X2 es:" << endl;
	cout << s << endl;
    system("PAUSE");
    return 0;
}

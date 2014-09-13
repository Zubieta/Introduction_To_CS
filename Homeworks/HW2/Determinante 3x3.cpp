#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    float a11;
    float a12;
    float a13;
    float a21;
    float a22;
    float a23;
    float a31;
    float a32;
    float a33;
    float s;
    cout << "----------------------"<<endl;
    cout << "|      |      |      |"<<endl;
    cout << "| a11  | a12  | a13  |"<<endl;
    cout << "|      |      |      |"<<endl;
    cout << "----------------------"<<endl;
    cout << "|      |      |      |"<<endl;
    cout << "| a21  | a22  | a23  |"<<endl;
    cout << "|      |      |      |"<<endl;
    cout << "----------------------"<<endl;
    cout << "|      |      |      |"<<endl;
    cout << "| a31  | a32  | a33  |"<<endl;
    cout << "|      |      |      |"<<endl;
    cout << "----------------------"<<endl;
    cout << "Ingrese el valor izquierdo superior del determinante (a11):" << endl;
	cin >> a11;
	cout << "Ingrese el valor del medio superior del determinante (a12):" << endl;
	cin >> a12;
	cout << "Ingrese el valor derecho superior del determinante (a13):" << endl;
	cin >> a13;
	cout << "Ingrese el valor izquierdo central del determinante (a21):" << endl;
	cin >> a21;
	cout << "Ingrese el valor del medio central del determinante (a22):" << endl;
	cin >> a22;
	cout << "Ingrese el valor derecho central del determinante (a23):" << endl;
	cin >> a23;
	cout << "Ingrese el valor izquierdo inferior del determinante (a31):" << endl;
	cin >> a31;
	cout << "Ingrese el valor del medio inferior del determinante (a32):" << endl;
	cin >> a32;
	cout << "Ingrese el valor derecho inferior del determinante (a33):" << endl;
	cin >> a33;
	s = a11*a22*a33 + a12*a23*a31 + a13*a21*a32 - a31*a22*a13 - a32*a23*a11 - a33*a21*a12;
	cout << "La solucion a este determinante 3x3 es:" << endl;
	cout << s << endl;
    system("PAUSE");
    return 0;
}

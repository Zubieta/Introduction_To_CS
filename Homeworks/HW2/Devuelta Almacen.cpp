#include <cstdlib>
#include <iostream>
#include <cmath>
using namespace std;
int main()
{   
    int a;
    int b; 
    int c;
    int d;
    cout << "Ingrese el valor de la compra:" << endl;
	cin >> a;
	cout << "Ingrese el valor pagado:" << endl;
    cin >> b;
	cout << "La devuelta es:" << endl;
	c = b-a;
	cout << c << endl;
	cout << "Distribuida de la siguiente manera:" << endl << endl;
    d = c/50000;
	if (d != 0)
		{cout << "Billetes de 50000:" << endl;
		cout << d << endl;
		c = c-d*50000;}
	d = c/20000;
	if (d != 0)
		{cout << "Billetes de 20000:" << endl;
		cout << d << endl;
		c = c-d*20000;}
    d = c/10000;
	if (d != 0)
		{cout << "Billetes de 10000:" << endl;
		cout << d << endl;
		c = c-d*10000;}
	d = c/5000;
    if (d != 0)
	    {cout << "Billetes de 5000:" << endl;
		cout << d << endl;
		c = c-d*5000;}
	d = c/2000;
	if (d != 0)
	    {cout << "Billetes de 2000:" << endl;
		cout << d << endl;
		c = c-d*2000;}
	d = c/1000;
	if (d != 0)
		{cout << "Billetes de 1000:" << endl;
		cout << d << endl;
		c = c-d*1000;}
	d = c/500;
	if (d != 0)
		{cout << "Monedas de 500:" << endl;
		cout << d << endl;
		c = c-d*500;}
	d = c/200;
	if (d != 0)
		{cout << "Monedas de 200:" << endl;
		cout << d << endl;
		c = c-d*200;}
	d = c/100;
	if (d != 0)
       {cout << "Monedas de 100:" << endl;
	   	cout << d << endl;
		c = c-d*100;}



    system("PAUSE");
    return 0;
}

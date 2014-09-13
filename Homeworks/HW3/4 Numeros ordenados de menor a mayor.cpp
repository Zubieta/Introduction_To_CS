#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    cout << "Ingrese 4 numeros para ordenarlos de menor a mayor:" << endl;
    float a;
    float b;
    float c; 
    float d;	
    float x;
    int y = 0;
    cin >> a;
    cin >> b;
    cin >> c;
    cin >> d;
    while (y<=3)  
        {if (a>=b)
			{x=a;
			 a=b;
			 b=x;}		
		if (b>=c)
			{x=b;
			 b=c;
			 c=x;}
		if (c>=d)
			{x=c;
			 c=d;
			 d=x;}		
		y++;}
 
    cout << "Los numeros ordenados de menor a mayor son:" << endl;
    cout << a << endl << b << endl << c << endl << d << endl;

    system("PAUSE");
    return 0;
}

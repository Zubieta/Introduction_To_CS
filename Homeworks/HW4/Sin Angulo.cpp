#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    cout << "Ingrese un angulo en radianes para hallar su Seno:" << endl;
	float xrad;
	cin >> xrad;
	float sinx;
	float zu = 1.0;
	float x = xrad;
	float y = 0;
	float i = 1;
	float z = 1;
	float n = 0;
	while ((zu >= 0.0001)||(zu <=-0.0001))
		{
         y++;
         while (y<i) 
		     {y++;
		      x= x*xrad;}
		 n=y;
	     while (n>1)
			{y = y*(n-1);
			 n--;} 
        sinx = z*x/y + sinx;
        i=i+2;
		zu= z*x/y;
		z = -1 * z;
        x=xrad;
        y=0;}
    cout << "El seno del angulo ingresado es de:" << endl;
    cout << sinx << endl;
                   
    system("PAUSE");
    return 0;
}

#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    float x;
    cout << "Ingrese un numero positivo: " << endl;
    cin >> x;
	float b = x;
	float zu = 1.0;
	float y = 0;
	float i = 1;
	float z = 1;
	float n = 0;
	float ex;
	while  (zu >= 0.0001)
		{y=0;
		 x=b;
         while (y<i)
			{y++;
			 if (y < i)
				{x= x*b;}
       		n=y;}
		while (n>1)
			{y = y*(n-1);
			 n--;} 
    ex = z*x/y + ex;
	i=i+1;
    zu= z*x/y;}
   ex=ex+1;
   cout << "el resultado de e elevado a la " <<b<< " es de:" << endl;
   cout << ex << endl;
   
    system("PAUSE");
    return 0;
}

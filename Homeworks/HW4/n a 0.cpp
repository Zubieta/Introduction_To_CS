#include <cstdlib>
#include <iostream>

using namespace std;

int main(int argc, char *argv[])
{   
    cout << "Ingrese un numero entero:" << endl;
	int n;
	cin >> n;
	cout << "Los numeros desde " << n << " hasta 0 son: " << endl;
	while ((n>=0)||(n<=0))
		{if (n>0)
        {cout << n << endl;
	   	n--;}
	   	else 
	   	{if (n==0)
	   	    {cout << n << endl;
             break;}
         cout << n << endl;
   	     n++;}}
   	     
                   
    system("PAUSE");
    return EXIT_SUCCESS;
}

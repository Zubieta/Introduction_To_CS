#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   
    int x=0; 
	int z=-10;	
    int y=0;
    while (y>=z)
		{x= x - y;
	     y--;}
    cout << "la sumatoria desde -10 hasta -1 de -i es de:" << endl;
    cout << x << endl;
                   
    system("PAUSE");
    return EXIT_SUCCESS;
}

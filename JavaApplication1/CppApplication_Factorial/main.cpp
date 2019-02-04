#include <cstdlib>
#include <iostream>
#include <stdio.h>


using namespace std;

int factorial(int n);

int main(int argc, char** argv)
{
    for(int i=1; i<=10; i++) 
    {
        cout << "El factorial de "<< i <<" es " << factorial(i) <<endl;
    }
    return 0;
}

int factorial(int n) 
{
   
   int res =1;
   
   for(int i=1; i<=n; i++) 
   {
       res=res*i;
    }
   
    return res;
}

#include <cstdlib>
#include <iostream>
#include <stdio.h>
using namespace std;

int elevoalcuadrado(int numero)
{
    int res;
    res = numero*numero;
    return res;
}



int main()
{
    int tabla[100];

    for (int i=1;i<100;i++)
    {
        tabla[i]=elevoalcuadrado(i);
        cout<<tabla [i]<<",";
    }
    return 0;
}


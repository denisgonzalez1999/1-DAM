#include <cstdlib>
#include <iostream>
#include <stdio.h>
#include <math.h>

using namespace std;


int elevoalcuadrado(int numero)
{
    int res;

    res = numero*numero;
    return res;
}

int main()
{
    cout << elevoalcuadrado(2);
    return 0;
}
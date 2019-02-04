
#include <cstdlib>
#include <iostream>
#include <stdio.h>
#include <windows.h>
#include <math.h>
#define NUMELEMETOS 1000 

using namespace std;

int elevoalcuadrado(int);

int main(int arg, char** argv) {
    int a[NUMELEMETOS], i;

    for (i = 0; i <= NUMELEMETOS; i = i + 1) {
        a[i] = elevoalcuadrado(i);
        cout << a[i] << endl;
    }
    return 0;
}

int elevoalcuadrado(int numero) {
    int res;

    res = numero*numero;
    return res;
}
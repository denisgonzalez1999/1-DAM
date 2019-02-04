#include <cstdlib>
#include <iostream>
#include <stdio.h>


using namespace std;

int main(int argc, char** argv) 
{

    int opcion; //Número que elige el usuario
    int sol = 0; // Solucion

    printf("Elige un numero del 1 al 9 \n"); // Pimera orden
    cin >> opcion;
    printf("Has elegido ");
    cout << opcion << endl;

    if (opcion >= 1 && opcion <= 9) 
    { //opcion 1
        for (int i = 1; i <= 10; i++) 
        { //ejecucion
            sol = opcion*i;
            cout << opcion << " * " << i << " = " << sol << "\n";
        }

    } 
    else 
      { //opcion 2
        printf("Error\n");
      }

    return 0;
}
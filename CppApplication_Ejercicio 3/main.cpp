#include <cstdlib> 
#include <iostream>
#include <stdio.h>


using namespace std;

int x = 0;  //definimos nuestra variable

int main(int argc, char** argv) 
{

    while (x < 20) //Aqui mandamos parar al programa a llegar al 20
    {

        cout << "," << x; //Hacemos que imprima los valores hasta el 20
        x++;

    }

    while (x >= 0) //Aqui mandamos al programa a llegar al 0
        {

        cout << "," << x; //Imprimimos los valores hasta llegar al valor indicado
        x--;

        }

    for(int x = 0; x <= 20; x++)  //Mandamos llegar al programa al 20 de forma ascendente empezando por el 0
            { 
        cout << x << ",";           //Hacemos que imprima los valores

            }

    for(int x = 20; x >= 0; x--) //Mandamos llegar al programa al 0 de forma descendente empezando por el 20
                {
            cout << x << ",";   //Hacemos que imprima los valores
        
                }

    
}

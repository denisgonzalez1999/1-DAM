#include <cstdlib> 
#include <iostream>
#include <stdio.h>


using namespace std;

int x = 0; //definimos nuestra variable

int main(int argc, char** argv) 
{

    while (x < 20) //Aqui mandamos parar al programa a llegar a un nº mayor a  20
        {

        cout << "," << x; //Hacemos que imprima los valores hasta el 20 
        x+=2;  //Le obligamos a que sume de dos en dos para que solo salgan nª pares

        }

    while (x >= 0) //Aqui mandamos al programa a llegar al 0
            {

        cout << "," << x; //Imprimimos los valores hasta llegar al valor indicado
        x-=2;  //Hacemos que reste de dos en dos para evitar nº impares

            }

    for (int x = 0; x <= 20; x+=2) //Mandamos llegar al programa al 20 de forma ascendente empezando por el 0 y de dos en dos
                { 
        cout << x << ","; //Hacemos que imprima los valores 

                }

    for (int x = 20; x >= 0; x-=2) //Mandamos llegar al programa al 0 de forma descendente empezando por el 20 y de dos en dos
                    {
        cout << x << ","; //Hacemos que imprima los valores

                    }


}
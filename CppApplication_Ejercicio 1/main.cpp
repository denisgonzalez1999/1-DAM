#include <cstdlib>
#include <iostream>
#include <stdio.h>

using namespace std;

int main(int argc, char** argv)
{
   char opcion;
   float area;
   float lado1, lado2;
   float base, altura;

   cout << "Elige, quieres el area de un (T)riangulo o de un (R)ectangulo";
   cin >> opcion;
   cout << endl << "Has elegido";
   cout << opcion << endl;

   if (opcion == 'r' || opcion == 'R')
   {
       cout << "Calculando Area de un Rectangulo" << endl;
       cout << "Longitud de un lado: ";
       cin >> lado1;
       cout << "Longitud del otro lado";
       cin >> lado2;

       area = lado1*lado2;
       cout << endl << "El area del rectangulo es:" << area;
   }
   else if (opcion == 't' || opcion == 'T')
        {
       cout << "Calculando Area de un Triangulo" << endl;
       cout << "Longitud de un base: ";
       cin >> base;
       cout << "Longitud de la altura";
       cin >> altura;
       area = (base*altura)/2;
       cout << endl << "El area del rectangulo es:" << area;
        }
   else
            {
       cout << "Error!! Escribe R o T";
            }


   return 0;
}
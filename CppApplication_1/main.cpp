#include <cstdlib>
#include <iostream>
#include <stdio.h>
using namespace std;

int main(int argc, char** argv) {

   while (true) {
       int diasemana;
       cout << "Escribe dia de la semana: ";
       cin >> diasemana;

       switch (diasemana) {
           case 1:
               cout << "Lunes\n\n";
               break;
           case 2:
               cout << "Martes\n\n";
               break;
           case 3:
               cout << "Miercoles\n\n";
               break;
           case 4:
               cout << "Jueves\n\n";
               break;
           case 5:
               cout << "Viernes\n\n";
               break;
           case 6:
               cout << "Sábado\n\n";
               break;
           case 7:
               cout << "Domingo\n\n";
               break;
           default:
               cout << "Error\n\n";
       }
   }
   return 0;

}
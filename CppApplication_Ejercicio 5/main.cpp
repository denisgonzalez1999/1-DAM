#include <cstdlib>
#include <iostream>
#include <stdio.h>

using namespace std;

int main(int argc, char** argv) 
{

    int dia;   //variable dia
    int mes;  //variable mes 
    int fechaanual;   //variable año

    cout << "Elige un dia";    //Se pide un dia
         cin >> dia;
    cout << endl << "Has elegido";
    cout << dia << endl;  //Se imprime el dia que ha elegido
    cout << "Elige un mes";  //Se pide un mes
         cin >> mes;
    cout << endl << "Has elegido";
    cout << mes << endl;  //Se imprime el mes

    cout << "Elige una fecha anual";  //Se pide el año
            cin >> fechaanual;
    cout << endl << "Has elegido";
    cout << fechaanual << endl;  //Se imprjme el año

    if (dia > 0 && dia < 32 && mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && fechaanual > 0) 
    {
        printf("Fecha valida");
    } else if (dia > 0 && dia < 30 && mes == 4 || mes == 6 || mes == 9 || mes == 11 && fechaanual > 0) 
      {
        printf("Fecha valida");
      }
    else if (dia > 0 && dia < 29 && mes == 2 && fechaanual > 0) 
        {
        printf("Fecha valida");
        }
    else 
          {
        printf("Fecha no valida");
          }
    return 0;
}

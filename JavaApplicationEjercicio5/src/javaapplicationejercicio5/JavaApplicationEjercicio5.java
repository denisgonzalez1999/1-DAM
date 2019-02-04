
package javaapplicationejercicio5;

import java.util.Scanner;



public class JavaApplicationEjercicio5 {


    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int dia;        //Definimos el dia
        int mes;        //Definimos el mes
        int fechaanual;     //Definimos el año
        boolean bisiesto;                      //Definimos el bisiesto con una comparacion        
        
        
        System.out.println("Vamos a decirte si el dia que has pedido ha existido o existirá");
        
                    System.out.println("Elige un dia");     //Pedimos el dia que quiera el usuario
            dia= sc.nextInt();
        
                        System.out.println("Elige un mes");     //Definimos el mes que quiera el usuario
            mes= sc.nextInt();
            
                        System.out.println("Elige una fechaanual");     //Definimos el año que quiera el usuario
            fechaanual= sc.nextInt();
        
        
            
            bisiesto=false;     //Ponemos las condiciones que nos pedia el usuario
            if(fechaanual%4==0)
            {
                bisiesto=true;
            }
            if (fechaanual%100==0)
            {
                bisiesto=false;
            }
            if (fechaanual%400==0)
            {
                bisiesto=true;
            }
            
        if (dia > 0 && dia < 32 && mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && fechaanual > 0) 
    // Caso uno
        {
        System.out.println("Fecha valida");
        } 
        else if (dia > 0 && dia < 30 && mes == 4 || mes == 6 || mes == 9 || mes == 11 && fechaanual > 0)
            //Caso dos
      {
        System.out.println("Fecha valida");
      }
    else if (dia > 0 && dia < 30 && mes == 2 && fechaanual > 0 && bisiesto == true) 
                //Caso tres
        {
        System.out.println("Fecha valida");
        }
        else if (dia > 0 && dia < 29 && mes == 2 && fechaanual > 0 && bisiesto == false) 
        {
        System.out.println("Fecha valida");
        }
    
    else 
            //Caso cuatro
          {
        System.out.println("Fecha no valida");
          }
        
        
    }
    
}

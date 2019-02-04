
package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {


    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
    String opcion;
float lado1, lado2;             //Definimos las variables del rectangulo
float base, altura;             //Definimos las variables del triangulo
float area;                     //Definimos la variable solucion

            System.out.println("Vamos a calcular el area de algunas de las siguientes figuras");        //En esta primera parte le pedimos al usuario que vamos a hacer
                System.out.println("Elige, dependiendo si quieres el area de un (T)riangulo o de un (R)ectangulo");     //Le damos la eleccion de elegir entre el rectangulo y el triangulo
                    opcion=sc.nextLine();
                System.out.println("Has elegido"); //Le decimos lo que ha elegido
                System.out.println(opcion);
                
                if (opcion.equalsIgnoreCase("R"))  //Caso rectangulo
                {

                    
                    System.out.println("Escribe la medida de un lado");         //Pide un primer lado luego un segundo e imprime el resultado
                    lado1= sc.nextFloat();
                    System.out.println("Escribe la medida del otro lado");
                    lado2= sc.nextFloat();
                    
                    System.out.println(area = lado1*lado2);
                }
                else if (opcion.equalsIgnoreCase("T"))      //Caso triangulo
                {                    
                                                           
                    System.out.println("Escribe la medida de la base");  //Pide la base y luego la altura e imrpime la solucion
                    base= sc.nextFloat();
                    System.out.println("Escribe la medida de la altura");
                    altura= sc.nextFloat();
                    
                    System.out.println(area= base*altura/2);
                }
                
                else                //Caso error, le decimos al usuario que lo que ha pedido no esta en nuestro programa
                {
                    System.out.println("Error");
                    System.out.println("Reinicie el pri¡ograma y elige entre nuestras opciones");
                }
    }
}
    

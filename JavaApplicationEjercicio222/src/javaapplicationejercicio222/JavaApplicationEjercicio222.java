
package javaapplicationejercicio222;

import java.util.Scanner;


public class JavaApplicationEjercicio222 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int opcion;     //Definimos la variable que el usuario quiere
            int sol = 0;    //Definimos la variable solucion
            
            System.out.println("Vamos a ponerte la tabla de multiplicar que quieras");  //Le explicamos lo que va a hacer nuestro programa
            
            System.out.println("Escribe un numero del 1 al 9 ambos incluidos");     //Le pedimos un numero que se encuantra dentro de nuestro rango
            opcion= sc.nextInt();
            System.out.println("Has elegido"+opcion);      //Le imprimimos el numero que ha escogido
            
            if (opcion >= 1 && opcion <= 9)             //Caso correcto
            {
                for (int i = 1; i <= 10; i++)       //Le imprimimos la tabla con el numero que ha elegido
                        {
                    sol = opcion * i;
                    System.out.println("La multiplicacion es " +opcion + "x" +i +"=" +sol);
                    
                }
            }
            
    }
    
}

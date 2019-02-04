
package javaapplication4;

import java.util.Scanner;


public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            String opcion;
                System.out.println("Elige, quieres el area de un (T)riangulo o de un (R)ectangulo");
                    opcion=sc.nextLine();
                System.out.println("Has elegido"+opcion);
                
                if (opcion.equalsIgnoreCase("R"))
                {
                    String lado1;
                    String lado2;
                    String area;
                    
                    System.out.println("Escribe la medida de un lado");
                    lado1=sc.nextLine();
                    System.out.println("Escribe la medida del otro lado");
                    lado2=sc.nextLine();
                    
                    System.out.println(area = lado1 * lado2);
                }
                
    }
    
}
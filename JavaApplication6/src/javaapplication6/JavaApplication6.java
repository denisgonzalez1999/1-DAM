/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;


public class JavaApplication6 {
String opcion;
float lado1, lado2;
float base, altura;
float area;
    public static void main(String[] args) {

                Scanner sc=new Scanner(System.in);
            String opcion;
                System.out.println("Elige, quieres el area de un (T)riangulo o de un (R)ectangulo");
                    opcion=sc.nextLine();
                System.out.println("Has elegido"+opcion);
                
                if (opcion.equalsIgnoreCase("R"))
                {
                    
                    System.out.println("Escribe la medida de la base");
                    
                }
                
    }
    
}

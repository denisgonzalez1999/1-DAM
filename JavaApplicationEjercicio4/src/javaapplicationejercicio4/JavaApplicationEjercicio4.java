
package javaapplicationejercicio4;

import java.util.Scanner;


public class JavaApplicationEjercicio4 {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x = 0;      //Definimos nuestra unica variable con valor inicial a 0

        System.out.println("Acendente pares con while:");       
        while (x <= 20)     //Decimos que ascienda de dos en dos hasta el 20
        {
            System.out.print(x +",");
            x+=2;
        }
        
                System.out.println(" ");
        System.out.println("descendente pares con while:");     //Decimos que descienda de dos en dos hasta el 0
        x=20;
        while (x >= 0)
        {
            System.out.print(x +",");
            x-=2;
        }
        
        System.out.println(" ");
        
        System.out.println("Acendente pares con for:");
        for (x = 0; x <= 20; x+=2)      //Decimos que ascienda de dos en dos hasta el 20
        {
            
            
            System.out.print(x +",");
        }
        System.out.println(" ");
        System.out.println("descendente pares con for:");
        for (x = 20; x >=0; x-=2)       //Decimos que descienda de dos en dos hasta el 0
        {
           
            System.out.print(x +",");
        }
        
    }
    
}
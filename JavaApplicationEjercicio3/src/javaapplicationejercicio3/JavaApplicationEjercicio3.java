
package javaapplicationejercicio3;

import java.util.Scanner;

public class JavaApplicationEjercicio3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = 0;          //Definimos la variable que sera el numero que se imprima todo el rato cuya valor inicial es 0
 System.out.println("Acendente con while:");
        while (x <= 20)     //Decimos que el numero vaya aumentandode uno en uno hasta que llegue a 20
        {
            System.out.print(x +",");
            x++;
        }
        System.out.println(" ");
        System.out.println("descendente con while:");       
        
        x=20;       //Le damos el valor 20 al numero 
        while (x >= 0)      //Decimos que el numero vaya descendiendo de uno en uno hasta el 0
        {
            System.out.print(x +",");
            x--;
        }
        
        System.out.println(" ");
        
        System.out.println("Acendente con for:");
        
        for (x = 0; x <= 20; x++)       //Decimos que el numero vaya ascendido de uno en uno hasta el 20
        {
            
            
            System.out.print(x +",");
        }
                System.out.println(" ");
        System.out.println("descendente con for:");     //Decimos que el numero vaya descendiendo de uno en uno hasta el 0
        for (x = 20; x >=0; x--){
            System.out.print(x +",");
        }
        
    }
    
}

/*
Vamos a imprimir los primeros números comprendidos entre 1 y 100
Cuando sean multiplos de 3 o 5 pero no de 15
 */
package javaejercicio1;


public class JavaEjercicio1 {


    public static void main(String[] args) 
    {
    
        System.out.println("Vamos a imprimirte una serie de números");
        System.out.println("Los caules son multiples de 3 o de 5 pero nunca van a ser de 15");
        int i=3;        //Creamos nuestra variable la cual se va a imprimir
        boolean multiplo;       //Creamos un boolean para buscar los primos
        
        multiplo=false;     

        if(i%3==0 || i%5==0)      //Si es multiplo de 3 es true
        {
            multiplo=true;
        }

        if(i%15==0)      //Si es multiplo de 15 es false
        {
            multiplo=false;
        }
        

        

            for(i=3; i<=100 && multiplo==true;i++)
            {
             System.out.print(i+",");
            }       
    }    
}
    


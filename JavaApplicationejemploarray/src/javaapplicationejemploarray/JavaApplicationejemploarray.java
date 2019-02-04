
package javaapplicationejemploarray;


public class JavaApplicationejemploarray 
{


    public static void main(String[] args) 
    {
        
        int a[];
        int contador=0;
        
        
        a = new int[200];
        
     for (int i=0; i<200;i++)   
     {
         a[i]=2*i;
     }
        while (contador <200)
        {
                        System.out.print(a[contador]);

            contador++;
        }
     
        System.out.print(" fd"+contador);
    }
    
    
}

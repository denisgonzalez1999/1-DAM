package codigo172;

import java.util.Scanner;


public class Codigo172 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int j =1;
        boolean comer;
        boolean seguir;
        int num;
        String texto = "";
        
        num = sc.nextInt();      
     
        if(num == 0){
            seguir = false;
        }
        else{
            seguir = true;
        }
        
        while(seguir == true){
           
        
        texto = sc.nextLine();   
       System.out.println(texto);
            
      for(int i=0;i< num;i++,j++){
         //texto.charAt(num);
         
       /*  if(texto.charAt(i)=='D'){
             if(texto.charAt(j)=='I'){
                 
                 System.out.println("ALGUNO NO COME");
             }
         }
         else if(texto.charAt(i)=='I'){
             if(texto.charAt(j)=='D'){
                 
                 System.out.println("ALGUNO NO COME");
             }
         }
         else{
             System.out.println("TODOS COMEN");

         }
             
*/
      }     
     
        num = sc.nextInt();      
        if(num == 0){
            seguir = false;
        }
        else{
            seguir = true;
        }
        }
        
        
    }
    
}

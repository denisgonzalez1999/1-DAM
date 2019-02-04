package radardetramo;

import java.util.Scanner;


public class RadarDeTramo {


   public static void main(String[] args) {
       int distancia = 1;
       float velmax = 1;
       float tiempo= 1;
       float velocidad;
                                                    
       Scanner lector = new Scanner(System.in);
       
       while(velmax != 0 & tiempo !=0 & distancia !=0)
       {
           
   
       distancia = lector.nextInt();

      
       velmax = lector.nextInt();
              
     
       tiempo = lector.nextInt();
       
       
       velmax = velmax*1000/3600;
       

       
          //D=V*T
          //v=d/t
          
          velocidad = distancia/tiempo;
          
          if(velocidad <0 || velmax <0 || tiempo <0)
          {
               System.out.println("Error");
          }
          
          else if(velocidad < velmax)
          {
              System.out.println("OK");
          }
          else 
          {
              if(velocidad < velmax+20%velmax)
              {
               System.out.println("MULDA");                
              }
              else
              {
              System.out.println("PUNTOS");
              }
          }
           }
   }
}

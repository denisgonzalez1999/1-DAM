/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta376;

import java.util.Scanner;

/**
 *
 * @author Usuario 1 DAM
 */
public class Acepta376 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        boolean seguir =true;
        int opcion;
        while(seguir){
        opcion = sc.nextInt();
        int alturapico[];
        alturapico = new int[opcion];
        int menos = opcion-1;
        int mas = 1;
        int solucion = 0;
        for(int i =0; i<opcion;i++){
            alturapico[i] = sc.nextInt();            
        }
        
    /*    for(int i=0;i<opcion;i++){
            if(i==0){
                menos = opcion-1;
                if(alturapico[i] > alturapico[menos] && alturapico[i] > alturapico[mas]){
                    solucion++;
                }
            }
            else if(i==opcion-1){
                mas=0;
                if(alturapico[i] > alturapico[menos] && alturapico[i] > alturapico[mas]){
                 solucion++;
                }
            }
            else
            {
                if((alturapico[i] > alturapico[menos] && alturapico[i] > alturapico[mas])){
                solucion ++;
                }
                
            }
            
            
            mas++;
            menos++;
        }*/
                for(int i=0;i<opcion;i++){
            if(i==0){
                menos = opcion-1;
                if(alturapico[i] > alturapico[menos]) {
                    if(alturapico[i] > alturapico[i+1]){
                        solucion++;
                    }
                }
            }
            else if(i==opcion-1){
                mas=0;
                if(alturapico[i] > alturapico[i-1]){
                    if( alturapico[i] > alturapico[mas]){
                        solucion++;
                    }
                    }
            }
            else
            {
                if(alturapico[i] > alturapico[i-1]){
                    if(alturapico[i] > alturapico[i+1]){
                    solucion++;
                }
                    
                }
                
            }
            
            
        }
        
        
        
      /*  for(int i =0; i<opcion;i++){
            if(i==0){
                menos = opcion -1;
            if(alturapico[i] > alturapico[menos] && alturapico[i] > alturapico[mas]){
             solucion++;
            }                
            }
            if(i==opcion-1){
                mas = 0;
             if(alturapico[i] > alturapico[menos] && alturapico[i] > alturapico[mas]){
             solucion++;
            } 
            }
            else if(alturapico[i] > alturapico[menos] && alturapico[i] > alturapico[mas])
            {
                solucion ++;
            }
        }
            
            */
      
      
          System.out.println(solucion);
          
            if(opcion == 0){
                seguir = false;
            }
            
        }
        
        
        
    }
    
}
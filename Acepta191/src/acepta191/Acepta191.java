/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta191;

import java.util.Scanner;

/**
 *
 * @author 99den
 */
public class Acepta191 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numcasos;
        numcasos = sc.nextInt();        //Nº de veces que hacemos el primer bucle
        int piscinas;                   //Numero de piscinas
        int capacidad;                  //Capacidad de la primera piscina
        int restar;                     //La diferencia de la piscina con la siguiente
        int res;                //Resultado
        
        for(int i=0;i<numcasos;i++){            //Pirmer bucle
            
            piscinas = sc.nextInt();
            capacidad = sc.nextInt();
            restar = sc.nextInt();
            res = capacidad;                    //Como ya operamos con la capacidad metemos al resultado el primer valor
           
            
            for(int p = 0;p < piscinas - 1;p++){        
                /*
                Este segundo bucle lo que hace es que te va a contar las piscinas menos una
                porque la primera ya la has sumado
                */
                                
                capacidad = capacidad - restar;     //Le restamos a cada c`pacidad la diferencia
                res=res + capacidad;                //Le vamos sumando la capacidad al resultado
            }
            System.out.println(res);      
        }
    }  

    }
    


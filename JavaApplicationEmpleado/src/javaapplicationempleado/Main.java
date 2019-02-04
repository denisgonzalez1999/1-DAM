/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationempleado;

/**
 *
 * @author 99den
 */
public class Main {
    
       public static void main(String[] args) 
       {
           Profesor empleado1 = new Profesor("Denis","Gonzalez", "012345678H", 254644, 1,"Repartidor");
           System.out.println("Nombre: "+empleado1.getNombre());
           System.out.println("Apellido: "+empleado1.getApellido());
           System.out.println("El DNI: "+empleado1.getDNI());
           System.out.println("SS: "+empleado1.getSS());
           System.out.println("IdEmpleado: "+empleado1.getIdEmpleado());
           Profesor empleado2 = new Profesor("Jaime","Pastor", "2489548D", 264848, 3, "Basurero");
           System.out.println("Nombre: "+empleado2.getNombre());
           System.out.println("Apellido: "+empleado2.getApellido());
           System.out.println("El DNI: "+empleado2.getDNI());
           PersonaHumana persona1 = new PersonaHumana("Cristiano", "Ronaldo", "268498465D", 23545);
           System.out.println("Nombre:"+persona1.getNombre());
           System.out.println("Elige 1 o 2");
           


       }

    
    
    
}

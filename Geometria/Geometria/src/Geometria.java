
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasma
 */
public class Geometria
{
    public static void main(String[] args)
    {
        Triangulo triangulo = new Triangulo();
        // Pido los lados del triangulo
        triangulo.definir_lados();
        
        System.out.println("El triangulo es " + triangulo.tipo_triangulo());
        System.out.println("Su perimetro es de " +triangulo.perimetro()+ " metros");
        double d = triangulo.area();
        System.out.printf("Su área es de %04.2f metros%n", triangulo.area());
        
    } 
}

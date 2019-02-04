

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class Triangulo {

    // Propiedades (variables) privadas
    private int lado1, lado2, lado3;

    // métodos privados
    private boolean estriangulo() {
        double a2;
        boolean resultado;
        
        double s = (lado1 + lado2 + lado3) / 2.0;

        a2 = s * (s - lado1) * (s - lado2) * (s - lado3);
        resultado = (a2>0);
        
        return resultado;
    }

    // Métodos (funciones) públicas
    public void definir_lados() {
        Scanner reader;

        boolean estriangulo = false;

        while (!estriangulo) {
            reader = new Scanner(System.in);
            System.out.print("Introduzca longitud lado 1 (m): ");
            lado1 = reader.nextInt();
            System.out.print("Introduzca longitud lado 2 (m): ");
            lado2 = reader.nextInt();
            System.out.print("Introduzca longitud lado 3 (m): ");
            lado3 = reader.nextInt();
            estriangulo = this.estriangulo();
            if (!estriangulo) {
                System.out.println("Cago en la... ¡¡¡Esto no es un triangulo!!!");
            }
        }
    }

    public String tipo_triangulo() {
        String tipo;
        if (lado1 == lado2 && lado1 == lado3) {
            tipo = "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            tipo = "Isósceles";
        } else {
            tipo = "Escaleno";
        }
        return tipo;
    }

    public float perimetro() {
        float p= lado1 + lado2 + lado3;
        return (p);
    }

    public double area() {
        double area;
        double s = (lado1 + lado2 + lado3) / 2.;

        area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        return (area);
    }

}

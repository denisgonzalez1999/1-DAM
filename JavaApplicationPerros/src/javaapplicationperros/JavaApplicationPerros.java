
package javaapplicationperros;


public class JavaApplicationPerros {



    public static void main(String[] args) 
    {
        
    Perros perro1 = new Perros();
    Perros perro2 = new Perros("Gran Danes", 5, "#804000", 2);
    
    
    System.out.println("La raza es "+perro1.getraza());
    System.out.println("La raza es "+perro2.getraza());
    System.out.println("La edad antes del cumpleaños es :"+perro2.getedad());
    perro2.cumpleaños();
    System.out.println("La edad actual del perro es :"+perro2.getedad());
    perro1.setedad(8);


    }
    
}

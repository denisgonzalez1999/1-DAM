
package javavehiculo;


public class Main {

    
    
    public static void main(String[] args) 
    {
        
        Camion miCamion = new Camion(20000, 8, 16, 10, 3, 3, 1, 100);
        miCamion.incrementar_aceleracion(5);
        System.out.println("Aceleracion de mi camion es"+miCamion.getAceleracion());
    }
    
}

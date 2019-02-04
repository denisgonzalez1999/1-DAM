
public class Geometria
{
    public static void main(String[] args)
    {
        Triangulo unTriangulo = new Triangulo();
        // Pido los lados del triangulo
        
        unTriangulo.definir_lados();
        
        System.out.println("El triangulo es " + unTriangulo.tipo_triangulo());
        System.out.println("Su perimetro es de " +unTriangulo.perimetro()+ " metros");
        System.out.printf("Su área es de %04.2f metros%n", unTriangulo.area());
        
    } 
}

package personaavanzada;

import java.util.Scanner;

public class PersonaAvanzada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nombre = "";     //Definimos el nombre por defecto
        int edad = 0;           //Definimos la edad por defecto
        String DNI = "";        //Definimos el DNI por defecto que luego nos crearaá uno aleatorio
        char sexo = 'H';        //Definimos el sexo por Defecto
        float peso = 0;         //Definimos el peso por defecto
        float altura = 0;       //Definimos la altura por defecto

        Scanner sc = new Scanner(System.in);   
        System.out.println("Danos tu nombre");
        nombre = sc.nextLine();         //Leemos el nombre, la edad, el sexo, el peso y la altura en lineas distintas
        System.out.println("Danos tu edad");
        edad = sc.nextInt();
        System.out.println("Danos tu sexo; H=hombre y M=mujer");
        sexo = sc.next().charAt(0);
        System.out.println("Danos tu peso");
        peso = sc.nextFloat();
        System.out.println("Danos tu altura");        
        altura = sc.nextFloat();

        Persona persona1 = new Persona(nombre, edad, sexo, altura, peso);   //definimos los atrubutos de persona1
        Persona persona2 = new Persona(nombre, edad, sexo);     //definimos los atrubutos de persona2
        Persona persona3 = new Persona();                       //definimos los atrubutos de persona3

        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setAltura(altura);
        persona3.setPeso(peso);

        System.out.println("Persona 1:");

        System.out.println(persona1.toString());        //Imprimimos los atributos de persona 1
        
        System.out.println("Persona 2:");            //Imprimimos los atributos de persona 2
        
        System.out.println(persona2.toString());   

        System.out.println("Persona 3:");            //Imprimimos los atributos de persona 3
        System.out.println(persona3.toString());

    }

}

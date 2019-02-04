/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaavanzada;

import java.util.Scanner;

public class Persona {      //En esta clase definimos los atributos de Persona

    private String nombre = "";
    private int edad = 0;
    private String DNI = "";
    private char sexo = comprobarSexo();
    private float peso = 0;
    private float altura = 0;

    public Persona() 
          //Definimos una tercera clase con estos atributos  
    {      
        nombre = "";
        edad = 0;
        DNI = generaDNI();
        sexo = comprobarSexo();
        altura = 0;
        peso = 0;

    }

    public Persona(String nombre, int edad, char sexo) 
            //Creamos una segunda clase con estos atributos
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo();
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, float altura, float peso)
            //Creamos una primera clase con estos atributos
    {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = comprobarSexo();
        this.altura = altura;
        this.peso = peso;
    }

    //Creamos todos los get
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }
    //Creamos todos los set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
        this.comprobarSexo();
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public boolean EsMayorDeEdad() 
            /*En esta funcion comprobamos si la persona es mayor de edad o no
            Y dependiendo de si si o si no nos devuelve un true o false*/
    {

        if (edad >= 18) {
            return true;
        } else {
            return false;
        }

    }

    public String calcularIMC() 
    /*Leeremos el peso y la altura que nos ha escrito antes y le haremos un calculo
    dependiendo de lo que de le daremos un -1,0,1 que signifivará una cosda distinta
    En caso en que la persona no tenga peso o edad, le daremos un error*/
    {
        String peso_ideal;

        float res;

        res = peso / (altura * altura);

        if (res < 20) {
            peso_ideal="Tienes que comer mas";
        } else if (res >= 20 && res <= 25) {
            peso_ideal="Estas en el peso ideal";
        }
        else if (peso==0 || altura ==0)
        {
        peso_ideal = "Error";
        }
        else {
            peso_ideal="Estas con sobrepeso, hoy tienes que hacer deporte";
        }
            return peso_ideal;
    }

    public char comprobarSexo() 
    /*Leeremos el sexo que nos ha metido antes y en caso en que no coincida con nuestras condiciones le 
    pondremos de forma automatica que su sexo es H*/
    {

        if (sexo != 'H' || sexo != 'M') {
            sexo = 'H';
        }

        return sexo;
    }

    public String generaDNI() 
    /*Creamos un DNI aleatoriamente
    */
    {
        double numero;
        int numero2;
        int dnirandom = 0;
        char letra;
        String juegoCaracteres;
        String DNI;

        for (int i = 0; i < 8; i++) {       //Un bucle que te crea 8 numeros de forma aleatoria
            numero = Math.floor(Math.random() * (0 - 9) + 9);
            numero2 = (int) numero;
            dnirandom = dnirandom * 10 + numero2;
        }
        juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKET";       
        int modulo = dnirandom % 23;        //Te calcula la letra que le corresponde
        letra = juegoCaracteres.charAt(modulo);
        DNI = ("" + dnirandom + letra + "");        //Coge los 8 numeros y le añade una letra dependiendo de su numero

        return DNI;

    }
    
    
    public String toString()
            /*
    En este metodo te recogue toda la informacion y cuando la llamen te imprime todo        
            */
    {
        String valor;
        
        valor="Nombre: "+this.nombre+"\n"+
                "Edad: "+this.edad+ "\n"+
                "Sexo: "+comprobarSexo()+"\n"+
                "DNI: "+this.DNI+"\n"+
                "Altura: "+this.altura+"\n"+
                "Peso: "+this.peso+"\n"+
                "¿Esta en peso ideal?: "+calcularIMC()+
                "\n"+"Mayor de edad: "+EsMayorDeEdad();
        
        
        return valor;
    }
    }



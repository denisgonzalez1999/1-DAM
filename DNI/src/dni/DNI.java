package dni;

import java.util.Scanner;

public class DNI {

    public static void main(String[] args) {

        int DNI;
        Scanner sc = new Scanner(System.in);       
        char[] letra= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int resto;
        System.out.println("Introduceme tu numero de DNI");
        DNI = sc.nextInt();
        resto = DNI % 23;
        System.out.println("Letra del Dni es: "+letra[resto]); 
        
        String DNIstr = String.format("%08d-",DNI);
        
        System.out.println(DNIstr);

        }

    }



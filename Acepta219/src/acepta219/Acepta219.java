/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta219;

import java.util.Scanner;

/**
 *
 * @author 99den
 */
public class Acepta219 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numcasos = sc.nextInt();
        int solucion = 0;
        for (int i = 0; i < numcasos; i++) {
            solucion = 0;
            int casosinternos = sc.nextInt();
            for (int x = 0; x < casosinternos; x++) {
                int decimos = sc.nextInt();
                if (decimos % 2 == 0) {
                    solucion++;
                }

            }

            System.out.println(solucion);

        }

    }
}

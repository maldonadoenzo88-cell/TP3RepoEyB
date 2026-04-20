
package ej3_tp6e;

import java.util.Scanner;


public class EJ3_TP6E {

  
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        int N, M;

        do {
            System.out.println("Ingrese dos numeros positivos.");
            N = lector.nextInt();
            M = lector.nextInt();

            if (N >= M) {
                System.out.println("N debe ser menor a M.");
            }

        } while ((M < N) || (N <= 0) || (M <= 0));

        System.out.println("Multiplos de " + N + ":");

        for (int contador = 1; contador <= M; contador++) {
            if (contador % N == 0) {
                System.out.println(contador);
            }
        }
    }
}
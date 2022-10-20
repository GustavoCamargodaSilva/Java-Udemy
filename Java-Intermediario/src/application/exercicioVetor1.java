package application;

import java.util.Scanner;

public class exercicioVetor1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?: ");
        int n = scan.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = scan.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }
        }

        scan.close();
    }
}

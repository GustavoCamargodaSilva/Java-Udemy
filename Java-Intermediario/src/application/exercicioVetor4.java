package application;

import java.util.Scanner;

public class exercicioVetor4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar?: ");
        int n = scan.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scan.nextInt();
        }

        System.out.print("Numeros pares: ");

        int numerosPares = 0;

        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.printf("%d ", numeros[i]);
                numerosPares++;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", numerosPares);

        scan.close();
    }

}

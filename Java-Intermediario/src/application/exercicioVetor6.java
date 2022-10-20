package application;

import java.util.Scanner;

public class exercicioVetor6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite quantos valores vai ter cada vetor: ");
        int n = scan.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorSoma = new int[n];

        System.out.println();
        System.out.println("Digite os valores do primeiro vetor: ");

        for (int i = 0; i < n; i++) {
            vetorA[i] = scan.nextInt();
        }

        System.out.println("Digite os valores do segundo vetor: ");

        for (int i = 0; i < n; i++) {
            vetorB[i] = scan.nextInt();
        }

        System.out.println("Vetor resultante: ");

        for (int i = 0; i < n; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", vetorSoma[i]);
        }

        scan.close();

    }
}

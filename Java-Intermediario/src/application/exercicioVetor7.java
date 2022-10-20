package application;

import java.util.Locale;
import java.util.Scanner;

public class exercicioVetor7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scan.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextDouble();
        }

        double somaVetor = 0;

        for (int i = 0; i < n; i++) {
            somaVetor += vetor[i];
        }

        double media = somaVetor / n;

        System.out.printf("Soma dos vetores: %.1f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i < n; i++) {
            if (vetor[i] < media) {
                System.out.printf("%.1f\n", vetor[i]);
            }
        }

        scan.close();
    }
}

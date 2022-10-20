package application;

import java.util.Locale;
import java.util.Scanner;

public class exercicioVetor5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos números você vai digitar? ");
        int n = scan.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextDouble();
        }

        double maiorValor = vetor[0];
        double posMaior = 0;

        for (int i = 1; i < n; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                posMaior = i;
            }

        }

        System.out.printf("MAIOR VALOR = %.1f\n", maiorValor);
        System.out.printf("POSICAO DO MAIOR VALOR = %.1f\n", posMaior);

        scan.close();

    }
}
package application;

import java.util.Locale;
import java.util.Scanner;

public class exercicioVetor2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos números você vai digitar?: ");
        int n = scan.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = scan.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i];
        }

        double media = soma / n;

        System.out.print("VALORES = ");

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f  ", vect[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        scan.close();
    }
}

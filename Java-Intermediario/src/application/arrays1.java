package application;

import java.util.Locale;
import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = scan.nextInt();
        double[] vect = new double[n]; // double - declarando o tipo do vetor []-declarando que está iniciando um vetor
                                       // new double - iniciando vetor tipo double [n] - o tamanho do vetor

        for (int i = 0; i < n; i++) {
            vect[i] = scan.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        double avg = soma / n; // media

        System.out.printf("%.2f", avg);

        scan.close();
    }
}

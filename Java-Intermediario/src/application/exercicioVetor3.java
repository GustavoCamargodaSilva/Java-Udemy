package application;

import java.util.Locale;
import java.util.Scanner;

public class exercicioVetor3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantas pessoas vão ser digitadas?: ");
        int n = scan.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = scan.next();
            System.out.print("Idade: ");
            idades[i] = scan.nextInt();
            System.out.print("Altura: ");
            alturas[i] = scan.nextDouble();
        }
        double alturaSoma = 0;
        double menoresIdade = 0;

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                menoresIdade++;
            } else {
                alturaSoma = alturaSoma + alturas[i];
            }
        }

        double alturaMedia = alturaSoma / n;
        double percentualMenores = ((double) menoresIdade / n * 100);

        System.out.printf("\nAltura media = %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.printf("%s\n", nomes[i]);
            }
        }

        scan.close();
    }
}

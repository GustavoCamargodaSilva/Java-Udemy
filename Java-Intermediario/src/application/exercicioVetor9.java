package application;

import java.util.Locale;
import java.util.Scanner;

public class exercicioVetor9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos alunos serão digitados? ");
        int n = scan.nextInt();

        String[] vetorNome = new String[n];
        double[] vetorNota1 = new double[n];
        double[] vetorNota2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            vetorNome[i] = scan.next();
            vetorNota1[i] = scan.nextDouble();
            vetorNota2[i] = scan.nextDouble();
        }

        System.out.println("Alunos Aprovados: ");

        double media = 0;

        for (int i = 0; i < n; i++) {
            media = (vetorNota1[i] + vetorNota2[i]) / 2;

            if (media >= 70.0) {
                System.out.printf("%s\n", vetorNome[i]);
            }
        }

        scan.close();
    }

}

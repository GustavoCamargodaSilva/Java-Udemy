package application;

import java.util.Scanner;

public class exercicioVetor8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite quantas pessoas você vai digitar? ");
        int n = scan.nextInt();

        String[] vetorNome = new String[n];
        int[] vetorIdade = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            vetorNome[i] = scan.next();
            System.out.print("Idade: ");
            vetorIdade[i] = scan.nextInt();
        }

        int maiorIdade = vetorIdade[0];
        int posicaoMaior = 0;

        for (int i = 1; i < n; i++) {
            if (vetorIdade[i] > maiorIdade) {
                maiorIdade = vetorIdade[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", vetorNome[posicaoMaior]);

        scan.close();
    }
}

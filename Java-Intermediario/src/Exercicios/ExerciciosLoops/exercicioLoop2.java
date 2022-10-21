package Exercicios.ExerciciosLoops;

import java.util.Scanner;

public class exercicioLoop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
         * Faça um programa que leia 5 números
         * e informe o maior número
         * e a média desses números.
         */

        int n;

        System.out.println("Quantos números vão ser digitados?: "); // Perguntar quantas vezes o loop vai ser executado
        n = scan.nextInt();

        int numero = 0; // criar variável para guardar o numero digitado
        int maior = 0; // criar variável o maior numero digitado

        for (int i = 0; i < n; i++) { // iniciado o for para começar o laço de repetição
            System.out.print("Digite os números: "); // perguntar qual numero vai ser digitado
            numero = scan.nextInt(); // guardar o digitado na variavel numero
            if (numero > maior) { // perguntar se numero digitado for maior que a variavel que guarda o maior
                                  // numero
                maior = numero; // vai atribuir o maior numero na variavel maior
            }
        }

        System.out.print(maior); // imprimir o maior numero digitado no laço

    }
}

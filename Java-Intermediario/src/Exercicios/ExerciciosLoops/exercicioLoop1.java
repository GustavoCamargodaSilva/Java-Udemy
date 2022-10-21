package Exercicios.ExerciciosLoops;

import java.util.Scanner;

public class exercicioLoop1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Inicia-se o obj para leitura dos dados

        /*
         * Faça um programa que leia conjuntos de dois valores,
         * o primeiro representando o nome do aluno e o segundo representando a sua
         * idade.
         * (Pare inserindo o valor 0 no campo nome)
         */

        String nome;
        int idade;

        while (true) {

            System.out.println("Digite o nome do aluno:"); // Print para exibir o pedido do nome
            nome = scan.next(); // Criação da variável e atribuição do dado digitado dentro dela

            if (nome.equals("0")) { // Comparacao para parar o laço caso seja digitado 0
                break;
            } else {
                System.out.println("Digite a idade: "); // Print para exibir o pedido do nome
                idade = scan.nextInt(); // Criação da variável e atribuição do dado digitado dentro dela

            }

            System.out.println("O Nome é: " + nome + " " + "Idade: " + idade + " Anos");

        }

    }

}
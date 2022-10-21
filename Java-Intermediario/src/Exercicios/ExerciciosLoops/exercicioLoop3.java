package Exercicios.ExerciciosLoops;

import java.util.Scanner;

public class exercicioLoop3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
         * Faça um programa que peça uma nota, entre zero e dez.
         * Mostre uma mensagem caso o valor seja inválido
         * e continue pedindo
         * até que o usuário informe um valor válido.
         */

        int n;
        System.out.println("Digite um número entre 0 e 10: ");
        n = scan.nextInt();

        while (n < 0 || n > 10) {
            System.out.println("Número digitado invalido!");
            System.out.println("Tente novamente: ");
            n = scan.nextInt();
        }

        System.out.println("A Nota digitada foi : " + n);
        scan.close();
    }

}

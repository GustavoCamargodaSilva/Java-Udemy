package Exercicios;

import java.util.Scanner;

public class exercicioLoop4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
         * Faça um programa que peça N números inteiros,
         * calcule e mostre a quantidade de números pares
         * e a quantidade de números impares.
         */

        System.out.print("Digite quantos números vai digitar: ");
        int n = scan.nextInt();
        int numeros;
        int numPar = 0;
        int Impar = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite os numeros: ");
            numeros = scan.nextInt();
            if (numeros % 2 == 0) {
                numPar++;
            } else {
                Impar++;
            }

        }

        System.out.println(numPar);
        System.out.println(Impar);

    }
}

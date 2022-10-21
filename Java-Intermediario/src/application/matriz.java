package application;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        // Declarar a linha e a coluna
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) { // for percorrendo as linhas
            for (int j = 0; j < n; j++) {
                mat[i][j] = scan.nextInt();
            } // outro for percorrendo as colunas J
        }

        System.out.println("Main diagonal: "); // feito para imprimir o os valores nas linhas/colunas
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }

        int count = 0; // contador para verificar os numeros negativos que foram digitados

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { // iniciado o for para verificar toda a matriz e guardar no contador
                if (mat[i][j] > 0) {
                    count++;
                }
            }
        }

        System.out.println("Negative numbers: " + count); // impressao dos numeros negativos que foram colocados no
                                                          // contador

        scan.close();
    }
}

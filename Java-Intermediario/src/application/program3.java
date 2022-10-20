package application;

import java.util.Locale;
import java.util.Scanner;
import entities.rent;

public class program3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        rent[] vetor = new rent[10]; // Declarando o tamanho que a rent vai ter de espaços

        System.out.print("How many rooms will be rented? "); // Perguntando quantos quartos vai precisar
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) { // iniciado for com 1 devido posicao no vetor
            System.out.println("rent #" + i + ":"); // concatenado para mudar conforme o i++
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.next();
            System.out.print("Room: ");
            int roomNumber = scan.nextInt();
            // iniciando vetor e guardando na memoria com a referencia do
            // numero digitado pelo usuario

            vetor[roomNumber] = new rent(name, email); // após iniciar o objeto com os parametros.

        }

        System.out.println();
        System.out.println("Busy rooms:");

        for (int i = 0; i < 10; i++) {
            if (vetor[i] != null) {
                System.out.println(i + ": " + vetor[i]);
            }
        }

        scan.close();

    }

}

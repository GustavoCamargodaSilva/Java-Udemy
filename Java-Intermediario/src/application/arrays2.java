package application;

import java.util.Locale;
import java.util.Scanner;

import entities.product3;

public class arrays2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        product3[] vect = new product3[3]; // indicando que o vect tem 3 posições

        for (int i = 0; i < vect.length; i++) { // iniciando o for para repetição
            scan.nextLine();
            String name = scan.nextLine(); // perguntando o nome do produto que vai ser colocado
            double price = scan.nextDouble(); // perguntando o preço
            vect[i] = new product3(name, price); // indicando que o produto+preço vai ficar na posição 0 do vetor
                                                 // assim por diante, cada laço vai guardar em uma posição do vetor.

        }

        double sum = 0.0; // iniciando a variavel para soma
        for (int i = 0; i < vect.length; i++) { // iniciando o laço for para começar a soma
            sum += vect[i].getPrice(); // coletando o preço de cada produto guardado no vetor
        }

        double avg = sum / vect.length;
        System.out.printf("Preço médio: %.2f ", avg);

        scan.close();
    }
}

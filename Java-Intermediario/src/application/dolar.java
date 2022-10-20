package application;

import java.util.Locale;
import java.util.Scanner;
import entities.converter;

public class dolar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        converter converter = new converter();

        System.out.print("Digite o preço do Dollar atual: ");
        converter.getDollarValue = scan.nextDouble();

        System.out.print("Quantos Dolares você deseja comprar? ");
        converter.getDollarBuy = scan.nextDouble();

        System.out.printf("O Preço do Dollar é: R$ %.2f ", converter.getDollarValue);
        System.out.printf("Você quer comprar: $ %.2f ", converter.getDollarBuy);

        System.out.printf("O Preço que você vai pagar em Real vai ser: $ %.2f ", converter.calc());

        scan.close();
    }
}

import java.util.Scanner;
import java.util.Locale;

public class exerciciosCondicionais5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o código do produto: ");
        int codigo = scan.nextInt();
        System.out.println("Digite a quantidade: ");
        int quantidade = scan.nextInt();
        double total;

        if (codigo == 1) {
            total = (double) quantidade * 4;
        }

        else if (codigo == 2) {
            total = (double) quantidade * 4.50;
        }

        else if (codigo == 3) {
            total = (double) quantidade * 5;
        }

        else if (codigo == 4) {
            total = (double) quantidade * 2;
        }

        else if (codigo == 5) {
            total = (double) quantidade * 1.50;
        }

        else {
            total = (double) quantidade * 1.50;
        }

        System.out.printf("O Total a pagar é: %.2f%n", total);

    }
}

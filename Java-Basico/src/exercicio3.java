import java.util.Scanner;
import java.util.Locale;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o código peça você gostaria: ");

        System.out.println("Digite a quantidade: ");
        int quantidade = scan.nextInt();

        System.out.println("Digite o preço: ");
        double preco = scan.nextDouble();

        System.out.println("Digite o código peça você gostaria: ");

        System.out.println("Digite a quantidade: ");
        int quantidade2 = scan.nextInt();

        System.out.println("Digite o preço: ");
        double preco2 = scan.nextDouble();

        double total1 = quantidade * preco;
        double total2 = quantidade2 * preco2;

        double totalPagar = total1 + total2;

        System.out.printf("TOTAL A PAGAR: %.2f%n", totalPagar);

        scan.close();

    }
}

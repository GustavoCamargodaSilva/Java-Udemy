import java.util.Scanner;
import java.util.Locale;

public class EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String x = scan.nextLine(); // leitura de String
        System.out.println(x);

        int n = scan.nextInt(); // entrada de dados número inteiro
        System.out.println(n);

        double s = scan.nextInt(); // Entrada de dados double com conversão para ponto usando Locale
        System.out.printf("Você digitou: %.2f%n", s);

        char d = scan.next().charAt(0); // entrada de dados para pegar a primeira string
        System.out.println(d);
    }
}

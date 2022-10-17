import java.util.Scanner;
import java.util.Locale;

public class doWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char resp;

        do {
            System.out.print("Digite a temperatura em Celsius");
            double C = scan.nextDouble();

            double F = 9.0 * C / 5.0 + 32.0;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);

            System.out.println("Deseja repetir (s/n)? ");
            resp = scan.next().charAt(0);

        } while (resp != 'n');

        scan.close();

    }
}

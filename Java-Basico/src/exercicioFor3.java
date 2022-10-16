import java.util.Scanner;
import java.util.Locale;

public class exercicioFor3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite a quantidade de vezes que o laço vai se repetir");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);

        }

        scan.close();
    }
}

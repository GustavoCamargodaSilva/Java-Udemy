import java.util.Scanner;
import java.util.Locale;

public class exercicioCondicional6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o intervalo: ");
        double intervalo = scan.nextDouble();

        if (intervalo > 0.25 && intervalo <= 25.50) {
            System.out.println("Intervalo é 25.50");
        }

        else if (intervalo > 25.50 && intervalo <= 50.75) {
            System.out.println("Intervalo é 50.75");
        }

        else {
            System.out.println("Não foi encontrado esse intervalo");
        }

        scan.close();
    }
}

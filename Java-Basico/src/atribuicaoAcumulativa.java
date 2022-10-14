import java.util.Locale;
import java.util.Scanner;

public class atribuicaoAcumulativa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int minutos = scan.nextInt();

        double conta = 50.0;

        if (minutos > 100) {
            conta += (minutos - 100) * 2;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);

    }
}

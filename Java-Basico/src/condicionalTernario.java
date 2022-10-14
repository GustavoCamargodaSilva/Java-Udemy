import java.util.Scanner;
import java.util.Locale;

public class condicionalTernario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double preco = 34.5;
        double desconto = (preco < 20) ? preco * 0.01 : preco * 0.05;
        // passado condicção se for verdadeiro executa a primeira opção se for falso a
        // segunda.

        System.out.println(desconto);
        scan.close();
    }

}

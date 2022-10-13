import java.util.Scanner;

public class exercicioCondicional2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero:");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("Impar");
        }

        scan.close();
    }
}

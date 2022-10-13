import java.util.Scanner;

public class exercicioCondicional1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int question = scan.nextInt();

        if (question < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }

        scan.close();
    }
}

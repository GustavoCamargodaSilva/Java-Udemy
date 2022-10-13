import java.util.Scanner;

public class exercicioCondicional3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os multiplos");

        int A = scan.nextInt();
        int B = scan.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        scan.close();

    }
}

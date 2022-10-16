import java.util.Scanner;

public class exercicioFor1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a entrada: ");
        int x = scan.nextInt();

        for (int i = 1; i < x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        scan.close();

    }
}

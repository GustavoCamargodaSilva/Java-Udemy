import java.util.Scanner;

public class exercicioFor2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o numero X: ");
            int X = scan.nextInt();
            if (X >= 10 && X <= 20) {
                in = in + 1;
            } else {
                out = out + 1;

            }

            System.out.println("in = " + in);
            System.out.println("out = " + out);
        }

        scan.close();

    }
}

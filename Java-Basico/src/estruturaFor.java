import java.util.Scanner;

public class estruturaFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int N = 0;

        for (int i = 0; i < N; i++) {
            int x = scan.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);

        scan.close();

    }
}

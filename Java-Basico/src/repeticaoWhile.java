import java.util.Scanner;

public class repeticaoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int soma = 0;

        while (x != 0) {
            soma += x;
            x = scan.nextInt();
        }

        System.out.println(soma);
    }
}

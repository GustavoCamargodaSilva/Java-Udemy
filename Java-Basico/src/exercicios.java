import java.util.Scanner;
import java.util.Locale;

public class exercicios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // EXERCICIO 1

        int entrada1 = scan.nextInt();
        int entrada2 = scan.nextInt();
        int resultado1 = entrada1 + entrada2;

        System.out.println("O Resultado é: " + resultado1);

        // EXERCICIO 2

        double R, A, pi = 3.14159;

        R = scan.nextDouble();

        A = pi * R * R;

        System.out.printf("A=%.4f%n", A);

        // EXERCICIO 3

        int F, G, H, I;

        F = scan.nextInt();
        G = scan.nextInt();
        H = scan.nextInt();
        I = scan.nextInt();

        int DIFERENCA = F * G - H * I;

        System.out.println("O Resultado é: " + DIFERENCA);

        scan.close();

    }
}

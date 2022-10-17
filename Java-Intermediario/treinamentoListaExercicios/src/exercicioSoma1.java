import java.util.Scanner;

public class exercicioSoma1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c, resultado;

        System.out.println("Digite o primeiro numero da soma");
        a = scan.nextInt();

        System.out.println("Digite o segundo numero da soma");
        b = scan.nextInt();

        System.out.println("Digite o terceiro numero da soma");
        c = scan.nextInt();

        resultado = a + b;
        System.out.println("o resultado da soma é: " + resultado);

        if (resultado < c) {
            System.out.println("O Resultado da soma é menor que C: " + c);
        } else {
            System.out.println("O resultado da soma é maior do que C");
        }

        scan.close();

    }
}

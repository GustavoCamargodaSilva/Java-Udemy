import java.util.Scanner;
import java.util.Locale;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // CALCULO TRIANGO RETANGULO

        System.out.println("Digite base1:");
        double base = scan.nextInt();

        System.out.println("Digite base2:");
        double base2 = scan.nextInt();

        System.out.println("Digite a altura:");
        double altura = scan.nextDouble();

        double triangulo = base * altura / 2;

        System.out.printf("Resultado do triângulo retângulo é: %.4f%n", triangulo);

        scan.close();
    }
}

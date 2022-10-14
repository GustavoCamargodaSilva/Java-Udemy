import java.util.Scanner;
import java.util.Locale;

public class calculadoraSwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double num1, num2, resultado;

        System.out.println("Digite a operação que deseja fazer, 1(+), 2(-), 3(*) e 4(/)");
        int operador = scan.nextInt();

        System.out.println("Digite o primeiro numero");
        num1 = scan.nextDouble();

        System.out.println("Digite o segundo numero");
        num2 = scan.nextDouble();

        switch (operador) {
            case 1:
                resultado = num1 + num2;
                System.out.printf("O resultado da soma é: %.2f%n", resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.printf("O resultado da soma é: %.2f%n", resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.printf("O resultado da soma é: %.2f%n", resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.printf("O resultado da soma é: %.2f%n", resultado);
                break;
            default:
                System.out.println("Esta operação não é valida");
                break;
        }
        scan.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class calculadoraSwich2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double num1, num2, resultado;
        resultado = 0;

        do {

            System.out.println("Digite a operação que deseja fazer (+) (-) (*) (/)");
            String operador = scan.next();

            System.out.println("Digite o número 1");
            num1 = scan.nextDouble();

            System.out.println("Digite o número 2");
            num2 = scan.nextDouble();

            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    System.out.println(resultado);
                    break;
                case "-":
                    resultado = num1 - num2;
                    System.out.println(resultado);
                    break;
                case "*":
                    resultado = num1 * num2;
                    System.out.println(resultado);
                    break;
                case "/":
                    resultado = num1 * num2;
                    System.out.println(resultado);
                    break;
                default:
                    System.out.println("Operação inválida");
            }
        } while (resultado > 0);

        scan.close();

    }
}

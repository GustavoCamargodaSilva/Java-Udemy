import java.util.Scanner;

public class exercicioExibirPar_Impar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scan.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("Este número é par");
        } else {
            System.out.println("Este número é impar");
        }

        scan.close();
    }
}

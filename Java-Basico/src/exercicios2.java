import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

import java.util.Locale;

public class exercicios2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // EXERCICIO 4

        System.out.println("Digite seu número:");
        int funcionario = scan.nextInt();

        System.out.println("Digite a quantidade de horas:");
        int horas = scan.nextInt();

        System.out.println("Digite o valor da sua hora: ");
        double valorHoras = scan.nextDouble();

        double salario = (double) valorHoras * horas;

        System.out.println("Seu número de registro é: " + funcionario);
        System.out.printf("Seu salário é: U$ %.2f%n", salario);

        scan.close();
    }
}

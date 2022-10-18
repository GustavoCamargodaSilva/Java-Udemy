package application;

import java.util.Locale;
import java.util.Scanner;
import entities.funcionario;

public class salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        funcionario funcionario = new funcionario();

        System.out.print("Digite o nome do funcionario: ");
        funcionario.name = scan.nextLine();

        System.out.print("Digite o salário bruto: ");
        funcionario.grosSalary = scan.nextDouble();

        System.out.print("Digite o desconto: ");
        funcionario.tax = scan.nextDouble();

        System.out.println(funcionario);

        System.out.print("Digite a porcentagem que deseja adicionar no salario: ");
        double porcentagem = scan.nextDouble();
        funcionario.incrementarSalario(porcentagem);

        System.out.println();
        System.out.println("Updated data: " + funcionario);

        scan.close();

    }
}

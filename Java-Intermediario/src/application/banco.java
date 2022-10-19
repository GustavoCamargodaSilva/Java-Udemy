package application;

import java.util.Locale;
import java.util.Scanner;

import entities.conta;

public class banco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o nome do titular da conta: ");
        String titular = scan.nextLine();

        System.out.print("Digite o numero da conta: ");
        int numeroConta = scan.nextInt();

        System.out.print("Digite o valor do deposito inicial: ");
        double depositoInicial = scan.nextDouble();

        conta conta = new conta(titular, numeroConta, depositoInicial);

        System.out.printf("Account data:" + conta.getTitular() + ", " + "Conta: " + conta.getConta()
                + ", " + "Saldo: R$ %.2f ", conta.getSaldo());

        System.out.println();
        System.out.print("Digite o valor do deposito");
        double saldo = scan.nextDouble();
        conta.depositoSaldo(saldo);

        System.out.println("Atualização: ");
        System.out.printf("Account data:" + conta.getTitular() + ", " + "Conta: " + conta.getConta()
                + ", " + "Saldo: R$ %.2f ", conta.getSaldo());

        System.out.println();
        System.out.print("Digite o valor que deseja sacar: ");
        saldo = scan.nextDouble();
        conta.saqueSaldo(saldo);

        System.out.println("Atualização: ");
        System.out.printf("Account data:" + conta.getTitular() + ", " + "Conta: " + conta.getConta()
                + ", " + "Saldo: R$ %.2f ", conta.getSaldo());

    }
}

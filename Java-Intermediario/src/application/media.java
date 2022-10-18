package application;

import java.util.Scanner;

import entities.aluno;

import java.util.Locale;

public class media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        aluno aluno = new aluno();

        System.out.print("Digite o nome do Aluno: ");
        aluno.nome = scan.next();

        System.out.print("Digite a primeira média: ");
        aluno.nota1 = scan.nextDouble();

        System.out.print("Digite a segunda média: ");
        aluno.nota2 = scan.nextDouble();

        System.out.print("Digite a terceira média: ");
        aluno.nota3 = scan.nextDouble();

        aluno.comparation();

        scan.close();
    }
}

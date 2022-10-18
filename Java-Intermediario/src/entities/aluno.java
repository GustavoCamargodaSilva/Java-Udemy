package entities;

public class aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double mediaNotas() {
        double soma = nota1 + nota2 + nota3;
        return soma = soma / 3;
    }

    public void comparation() {
        if (mediaNotas() < 70.0) {
            System.out.printf("Você foi reprovado com média: %.2f ", mediaNotas());
        } else {
            System.out.printf("Você foi aprovado com média: %.2f ", mediaNotas());
        }

    }

}

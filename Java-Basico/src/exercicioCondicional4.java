import java.util.Scanner;

public class exercicioCondicional4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a hora inicial");
        int horaInicial = scan.nextInt();

        System.out.println("Digite a hora final");
        int horaFinal = scan.nextInt();

        int duracao;

        if (horaFinal < horaInicial) {
            duracao = horaFinal - horaInicial;
        }

        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU: " + duracao + " Horas");

        scan.close();

    }
}

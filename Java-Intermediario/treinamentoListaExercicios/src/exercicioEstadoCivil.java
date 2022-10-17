import java.util.Scanner;

public class exercicioEstadoCivil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome, estadoCivil, sexo;
        int anosCasada;

        nome = scan.nextLine();
        sexo = scan.nextLine();
        estadoCivil = scan.nextLine();

        System.out
                .println("Seu nome é: " + nome + " Você é do sexo: " + sexo + " e seu estado civil é: " + estadoCivil);

        if (sexo.equals("F") && estadoCivil.equals("casada")) {
            System.out.println("Digite a quantos anos você é casada: ");
            anosCasada = scan.nextInt();
            System.out.println("Você é casa a: " + anosCasada + " Anos");

        } else {
            System.out.println("parâmetro de comparacao invalido");
        }
        scan.close();
    }
}

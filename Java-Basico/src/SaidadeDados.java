public class SaidadeDados {
    public static void main(String[] args) throws Exception {

        int y = 32; // declaracao de valor da variavel int
        System.out.println(y); // chamando a impressão da variavel no console

        double x = 10.35784; // declaracao de valor variavel double
        System.out.println(x); // impressao normal do float
        System.out.printf("%.2f%n", x); // %.2f utilizado para limitar as casa decimais na impressoa %n utilizado para
                                        // quebra de linha , x passado como parâmetro.

        // exercicio de fixação Saida de dados

        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double prince1 = 2100.0;
        double prince2 = 650.50;
        double measure = 53.234567;

        // Saida na tela

        System.out.println("Products:");
        System.out.println(product1 + ", which prince is $ " + prince1);
        System.out.println(product2 + ", which prince is " + prince2);
        System.out.println("Record: " + age + " years old, code: " + code + " and gender: " + gender);
        System.out.printf("Rouded (three decimal places) : " + measure);
    }
}

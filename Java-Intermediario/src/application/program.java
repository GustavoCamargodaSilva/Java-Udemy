package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Triangle x, y; // Chamando o metedo Triangle e criando o objeto
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of thiangle X: ");
        x.a = scan.nextDouble(); // solicitando os valores e guardando dentro do objeto Tringle
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();
        System.out.println("Enter the measures of thiangle Y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        double areaX = x.area(); // Chamando metedo de calculo area para denominar valor
        double areaY = y.area();

        System.out.printf("Area : %.4f%n", areaX); // Imprimindo os valores de cada triangulo
        System.out.printf("Area : %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area X"); // Fazendo a comparacao para chegar no maior triangulo
        } else {
            System.out.println("Larger area Y");
        }

        scan.close();

    }
}

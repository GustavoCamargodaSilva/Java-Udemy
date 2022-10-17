package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of thiangle X: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();
        System.out.println("Enter the measures of thiangle Y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Area : %.4f%n", areaX);
        System.out.printf("Area : %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area X");
        } else {
            System.out.println("Larger area Y");
        }

        scan.close();

    }
}

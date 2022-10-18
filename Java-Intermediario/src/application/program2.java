package application;

import java.util.Locale;
import java.util.Scanner;
import entities.products2;

public class program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        products2 products2 = new products2(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + products2);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        products2.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + products2);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        products2.removeProducts(quantity);
        System.out.println();

        System.out.println("Updated data: " + products2);
        sc.close();
    }
}
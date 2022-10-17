package application;

import java.util.Locale;
import java.util.Scanner;
import entities.products;

public class program1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        products products = new products();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        products.name = scan.nextLine();

        System.out.print("Prince: ");
        products.price = scan.nextDouble();

        System.out.print("Quantity in stock: ");
        products.quantity = scan.nextInt();

        System.out.println();
        System.out.println("Product data: " + products);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = scan.nextInt();
        products.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + products);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = scan.nextInt();
        products.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + products);

        scan.close();
    }
}

package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)?");
			char imp = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if(imp == 'c') {
					list.add(new Product(name, price));
			}else if(imp == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name,price,date));
				
			}else {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();	
				list.add(new ImportedProduct(name, price, customsFee));
			}
			
		}
		
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}
}





























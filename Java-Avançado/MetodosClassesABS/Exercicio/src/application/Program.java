package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List <TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n;i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				Integer numberEmployees = sc.nextInt();
				
				list.add(new Company(name, anualIncome, numberEmployees));
			}
			
		}
		
		double sum = 0;
		System.out.println("TAXES PAID: ");
		
		for(TaxPayer tp : list) {
			double tax = tp.tax();
			System.out.printf(tp.getName() + ": $ %.2f\n", tax);
			sum += tax;
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f",sum);
		
		
		
		sc.close();
	}
}

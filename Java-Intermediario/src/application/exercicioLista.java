package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import entities.funcionarioLista;

public class exercicioLista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<funcionarioLista> list = new ArrayList<>(); // Iniciando a lista com a referencia da minha classe

        System.out.print("How many employees will be registred?");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");

            System.out.print("Id: ");
            Integer id = scan.nextInt();

            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();

            System.out.print("Salary: ");
            Double salary = scan.nextDouble();

            funcionarioLista funcionarioLista = new funcionarioLista(id, name, salary);

            list.add(funcionarioLista);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idsalary = scan.nextInt();
        /*
         * Pode ser usado essa expressão para filtrar o ID na lista
         * funcionarioLista pos = list.stream().filter(x->
         * x.getId()==idsalary).findFirst().orElse(null);
         */

        Integer pos = position(list, idsalary);

        if (pos == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = scan.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (funcionarioLista funcionarioLista : list) {
            System.out.println(funcionarioLista);
        }

        scan.close();
    }

    public static Integer position(List<funcionarioLista> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) { // percorrer lista e receber a posicao
                return i;
            }
        }
        return null;
    }

}

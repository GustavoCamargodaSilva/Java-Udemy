
import java.util.InputMismatchException;
import java.util.Scanner;

public class excecoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("METHOD2 START");
        method2();

        System.out.println("METHOD2 STOP");
        System.out.println("End of the Program");

        sc.close();
    }

    public static void method2() {
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position!");
        } catch (InputMismatchException e) {
            System.out.println("Input Error");
        }

        System.out.println("End of the Program");

        sc.close();
    }
}

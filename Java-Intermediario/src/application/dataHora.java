package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class dataHora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // HoraAgora
        LocalDate d01 = LocalDate.now(); // data local do pc
        LocalDateTime d02 = LocalDateTime.now(); // data e hora local
        Instant d03 = Instant.now(); // data e hora padrao global gera o fusohorario
        LocalDate d04 = LocalDate.parse("2022-07-20"); // Data como String
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");// Data como String
        Instant d06 = Instant.parse("2022-07-20T01:30:26-03:00");

        LocalDate d07 = LocalDate.parse("20/07/2022", fmt1);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        scan.close();
    }
}

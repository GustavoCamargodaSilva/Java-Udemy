package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class converterDataGlobalLocal {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20"); // Data como String
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");// Data como String
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());// conforme data do pc
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));// passando local de referencia

        System.out.println(r1);
        System.out.println(r2);
        System.out.println("D04 dia= " + d04.getDayOfMonth());// imprimir apenas o dia/data/ano/hora especifico

    }
}

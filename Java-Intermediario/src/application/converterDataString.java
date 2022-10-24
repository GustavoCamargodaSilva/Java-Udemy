package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class converterDataString {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20"); // Data como String
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");// Data como String
        Instant d06 = Instant.parse("2022-07-20T01:30:26-03:00");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println(d04.format(fmt1));
        System.out.println(d05.format(fmt2));
        System.out.println(fmt3.format(d06));

    }
}

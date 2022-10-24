package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calculoDataHora {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26-03:00");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusYears(1);
        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println(pastWeekInstant);
        System.out.println(nextWeekInstant);

        Duration t1 = Duration.between(d04, d05);
        System.out.println(t1.toDays());

    }
}

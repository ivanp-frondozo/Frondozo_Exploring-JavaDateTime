package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AddingSubtractingTime {
    public AddingSubtractingTime() {

        //exercise 5: Adding and Subtracting Time

        //result prediction: 2025-10-15 10:30, 2026-12-15 15:30, 2025-09-21 10:30
        //actual result: 2025-10-15 10:30, 2026-12-15 15:30, 2025-09-21 10:30
        LocalDateTime baseTime = LocalDateTime.of(2025, 10, 15, 10, 30, 0);

        LocalDateTime futureTime = baseTime.plusYears(1).plusMonths(2).plusHours(5);
        LocalDateTime pastTime = baseTime.minusWeeks(3).minusDays(3);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("Base time:   " + baseTime.format(dtf));
        System.out.println("Future time: " + futureTime.format(dtf));
        System.out.println("Past time:   " + pastTime.format(dtf));

        //explanation: Using .plus and.minus makes the date and time go forward or backward based on the specification
        //It is to note that the compiler automatically computes differences in other fields such as days
        //in a month
    }
}

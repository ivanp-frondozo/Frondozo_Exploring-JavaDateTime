package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateAndFormatter {
    public LocalDateAndFormatter() {

        //exercise 1: LocalDate and DateTimeFormatter
        //result prediction: 2025-8-21, 21/8/2025, Thursday August 21, 2025
        //actual result: 2025-08-21, 21/08/2025, Thursday, August 21, 2025
        LocalDate today = LocalDate.of(2025, 8, 21);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy", Locale.ENGLISH);

        System.out.println("Default format: " + today);
        System.out.println("Custom format 1: " + today.format(dtf1));
        System.out.println("Custom format 2: " + today.format(dtf2));

        //explanation: localdate.of accepts a complete date argument and returns a default format
        // using DateTimeFormatter, we created different custom formats, with EEEE representing the day
        // while Locale.English ensures use of correct language
    }

}

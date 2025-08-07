package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeAndFormatter {

    public LocalDateTimeAndFormatter() {

        //exercise 3: LocalDateTime and DateTimeFormatter
        //result prediction: 2025-11-27T19:0:0, Nov 27, 2025 at 07:00 PM
        //actual result: 2025-11-27T19:00, Nov 27, 2025 at 07:00 PM
        LocalDateTime event = LocalDateTime.of(2025, 11, 27, 19, 0, 0);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' hh:mm a");
        System.out.println("Default format: " + event);
        System.out.println("Custom format: " + event.format(dtf));

        //explanation: LocalDateTime.of provides default format for specified details wherein date and
        //time is separated by T signifying time.
        //DateTimeFormatter allows us to create own patterns and use at as a delimiter for date and time
        //also to note that seconds section omitted implicitly when set to 0
    }
}

package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeAndFormatter {
    public LocalTimeAndFormatter() {

         //exercise 2: Local Time and DateTimeFormatter
        //result prediction: 16:45:30.00, 16:45:30.00, 04:45:30.00 PM
        //actual result: 16:45:30, 16:45:30, 04:45:30 PM
        LocalTime now = LocalTime.of(16, 45, 30);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss a");

        System.out.println("Default format: " + now);
        System.out.println("24-hour format: " + now.format(dtf1));
        System.out.println("12-hour format with AM/PM: " + now.format(dtf2));

        //explanation: Localtime.of provides default format for provided time details
        // DateTimeFormatter allows us to provide custom patters for specified time.
        //It is to note that HH means 24 hr represents a 24 hr format while hh is for 12 hr.
        //Also, a provides AM/PM marker
    }
}

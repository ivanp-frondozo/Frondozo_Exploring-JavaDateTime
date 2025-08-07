package org.example;

import java.time.LocalDate;

public class ImmutableDateTimeObjects {
    public ImmutableDateTimeObjects(){

        //exercise 4: The Immutability of Date Time Objects
        //result prediction: 2025-09-1, 2025-09-01, 2025-09-11
        //actual result: 2025-09-1, 2025-09-01, 2025-09-11
        LocalDate startDate = LocalDate.of(2025, 9, 1);

        // Attempt to add 10 days, but don't assign the result
        startDate.plusDays(10);

        System.out.println("Start date after trying to modify it: " + startDate);

        // Now, correctly add 10 days by assigning the result to a new variable
        LocalDate endDate = startDate.plusDays(10);

        System.out.println("The original start date is still: " + startDate);
        System.out.println("The new end date is: " + endDate);

        //explanation: Since objects created with the java.time package are immutable, adding days
        //to the original reference variable of LocalDate does not change. Similar to strings,
        //a new reference variable must be created for it as it creates a new object
    }
}

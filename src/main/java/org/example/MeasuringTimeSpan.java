package org.example;

import java.time.LocalDate;
import java.time.Period;

public class MeasuringTimeSpan {
    public MeasuringTimeSpan() {

        //exercise 6: Measure a Span of Time

        //result prediction: 2, 4, 5
        //actual result: 2, 4, 5
        LocalDate date1 = LocalDate.of(2024, 3, 15);
        LocalDate date2 = LocalDate.of(2026, 7, 20);

        Period period = Period.between(date1, date2);

        System.out.print("The period between the two dates is: ");
        System.out.print(period.getYears() + " years, ");
        System.out.print(period.getMonths() + " months, and ");
        System.out.println(period.getDays() + " days.");

        //explanation: Period.between gets the date difference between two dates
        //and using the .get<field> method, it isolates the specified field.
        //Also to note, that it automatically detects date difference given number of days in a month
    }
}

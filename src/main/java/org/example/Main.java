package org.example;

import bonus.date.task.Animal;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("The Date now is : " + now);
        LocalDateTime after2Weeks = now.plusWeeks(2);
        System.out.println("The Date after 2 weeks is : " + after2Weeks);
        // normal way with if
        if(now.isAfter(after2Weeks)) {
            System.out.println("The Date is Before " + now);
        } else if (now.isBefore(after2Weeks)) {
            System.out.println("The Date is After " + now);
        }else{
            System.out.println("The Date is the same " + now);
        }
        // the same task but with new class and compare Methode
        CompareDate compareDate = new CompareDate();
        compareDate.compareDate(now, after2Weeks);

        long difference = ChronoUnit.DAYS.between(now, after2Weeks);
        System.out.println("The difference is : " + difference + " days");

        Animal animal = new Animal("Bear", LocalDate.of(2015,10,30));
        Animal animal2 = new Animal("Tiger", LocalDate.of(2010,5,15));
        System.out.println(animal2);

        LocalDate today = LocalDate.now();
        LocalDate nextBirthday = LocalDate.of(today.getYear(), animal.getBirthday().getMonth(), animal.getBirthday().getDayOfMonth());
        if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        // Calculate the number of days until the next birthday
        long daysUntilNextBirthday = ChronoUnit.DAYS.between(today, nextBirthday);

        // Output the result
        System.out.println("There are " + daysUntilNextBirthday + " days left until the next birthday.");

    }
}
package org.example;

import java.time.LocalDateTime;
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
    }

}
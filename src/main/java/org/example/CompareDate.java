package org.example;
import java.time.LocalDateTime;

public class CompareDate {
    public void compareDate(LocalDateTime date1, LocalDateTime date2) {
        if(date1.isAfter(date2)) {
            System.out.println("The Date is Before " + date1);
        } else if (date1.isBefore(date2)) {
            System.out.println("The Date is After " + date1);
        }else{
            System.out.println("The Date is the same " + date1);
        }

    }
}

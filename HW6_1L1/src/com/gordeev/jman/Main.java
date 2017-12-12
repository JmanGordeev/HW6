package com.gordeev.jman;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();
        calendar.set(1982,Calendar.OCTOBER,13);
        calendar1.set(1982,Calendar.NOVEMBER,13);
        Date date = calendar.getTime();
        Date date1 = calendar1.getTime();
        System.out.println(date1.getTime()-date.getTime());
    }
}

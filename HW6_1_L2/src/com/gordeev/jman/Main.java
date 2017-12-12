package com.gordeev.jman;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date dateIn = new Date();
        Date dateBB = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yy");
        String dateText = "";
        System.out.println("Input date:  day:month:year ");
        dateText = sc.nextLine();
        try {
            dateIn = sdf.parse(dateText);
        } catch (ParseException e) {
            System.out.println(e);
        }

        String strIn = sdf.format(dateIn);
        String strBB = sdf.format(dateBB);
        System.out.println(strIn);
        System.out.println(strBB);
        compareDate(strIn, strBB);
        sc.close();
    }

    public static void compareDate(String a, String b) {
        if (!a.substring(3, 5).equals(b.substring(3, 5)))
            System.out.printf("   %s\n", a.substring(3, 5));
        if (!a.substring(7, 8).equals(b.substring(7, 8))) {
            System.out.printf("      %s", a.substring(6, 8));
        }
    }
}




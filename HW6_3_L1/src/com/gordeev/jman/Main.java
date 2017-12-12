package com.gordeev.jman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number ");
        String bin = sc.nextLine();
        System.out.printf("%s ->" + " %d", bin, Integer.parseInt(bin, 2));
    }
}

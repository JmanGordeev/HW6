package com.gordeev.jman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getHemmingDistance(a, b));
    }

    public static int getHemmingDistance(int a, int b) {
        String nOne = String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0');
        String nTwo = String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0');

        System.out.println(a + " -> " + nOne + "\n" + b + " -> " + nTwo);

        char[] one = nOne.toCharArray();
        char[] two = nTwo.toCharArray();
        int h = 0;

        for (int i = 0; i < one.length; i++) {
            if ((one[i] ^ two[i]) > 0) {
                h++;
            }
        }
        return h;
    }
}

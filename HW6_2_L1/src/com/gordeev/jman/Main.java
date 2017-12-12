package com.gordeev.jman;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        toString(array);
    }

    public static void toString(int[] a) {
        if (a.length > 0) {
            for (int i = 0; i < a.length; i++) {
                if (i == 0) {
                    System.out.print("[" + a[i] + ",");
                }
                if (i == a.length - 1) {
                    System.out.print(a[i] + "]");
                } else if (i > 0 && i < a.length) {
                    System.out.print(a[i] + ",");
                }

            }
        }
    }
}

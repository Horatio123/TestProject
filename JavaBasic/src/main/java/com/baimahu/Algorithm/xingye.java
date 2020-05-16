package com.baimahu.Algorithm;

import java.util.Scanner;

public class xingye {
    public static void main(String[] args) {

        System.out.println(isPalindrome(123));
        System.out.println(closestPalindrome("123"));

        System.out.println("please input head and foot: ");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] ss = s.split(",");
        int head;
        int foot;
        try {
            head = Integer.parseInt(ss[0]);
            foot = Integer.parseInt(ss[1]);
        } catch (Exception e) {
            System.out.println("INPUTERROR");
            return;
        }
        int numOfChicken = (4 * head - foot) / 2;
        int numOfRabbit = head - numOfChicken;
        if (numOfChicken <= 0 || numOfRabbit <= 0) {
            System.out.println("NODATA");
        }
        System.out.println(numOfChicken + " " + numOfRabbit);
        //x*2+(head-x)*4=foot
        //x=(4*head-foot)/2


    }

    public static String closestPalindrome(String s) {
        long l = Long.parseLong(s);
        System.out.println(l);
        for (long i = 1; ;i++) {
            if (isPalindrome(l + i)) {
                return "" + (l + i);
            }
            if (isPalindrome(l - i)) {
                return "" + (l - i);
            }
        }
    }
    public static boolean isPalindrome(long l) {
        long i = l;
        long res = 0;
        while (i > 0) {
            res = res * 10 + i % 10;
            i = i / 10;
        }
        return res == l;
    }

}

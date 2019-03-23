package com.baimahu;

public class Palindrome {
    public static void main(String args[]){
        int p = 123456;
        int s = 0;
        int r = 0;
        while (p > 0) {
            r = p % 10;
            p = p / 10;
            s = r + s * 10;
        }
        System.out.println(s);
    }

}

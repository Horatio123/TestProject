package com.baimahu.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowExp {
    public static void main(String[] args) throws IOException {
        System.out.println("input a num when it is smaller than 10, throw exception");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        if (num < 10){
            throw new ArithmeticException();
        }
    }
}


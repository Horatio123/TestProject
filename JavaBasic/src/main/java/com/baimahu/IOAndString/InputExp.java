package com.baimahu.IOAndString;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputExp {
    public static void main(String[] args) throws Exception{
//        System.out.println("please input a char");
//        int i = System.in.read();
//        System.out.println((char)i);

        System.out.println("please input a string");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String line = br.readLine();
//      int num = Integer.parseInt(line);
//      System.out.println(num);
        System.out.println(line);

//          System.out.println("please input a two num");
//          Scanner sc = new Scanner(System.in);
//          int a = sc.nextInt();
//          int b = sc.nextInt();
//          System.out.printf("%d + %d = %d", a, b, a + b);



    }
}

package com.baimahu.IOAndString;

import java.io.IOException;
import java.util.Arrays;

public class OutputStreamTest {
    public static void main(String[] args) {
//        for (int i = 0; i < 127; i++) {
//            System.out.write(i);
//
//        }
//        System.out.flush();


        String bob = "Bob is really cool";
        byte[] data = bob.getBytes();
        for (byte b: data) {
            System.out.println(b);
        }
        try {
            System.out.println(Arrays.toString(data));
            System.out.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.flush();
            System.out.close();
        }
        //System.out.write(88);
    }
}

package com.baimahu.IOAndString;

import java.io.IOException;

public class InputStreamTest {
    public static void main(String[] args) {
        byte[] data = new byte[10];
        try {
            for (int i = 0; i < 10; i++) {
                data[i] = (byte)System.in.read();
            }
            System.out.write(data);
            System.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

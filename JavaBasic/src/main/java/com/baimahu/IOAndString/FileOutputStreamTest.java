package com.baimahu.IOAndString;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("out.txt", true);
            while (true) {
                try {
                    int in = System.in.read();
                    if (in == 10) {
                        break;
                    } else {
                        outputStream.write(in);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

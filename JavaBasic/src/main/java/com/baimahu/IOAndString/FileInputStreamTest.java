package com.baimahu.IOAndString;

import java.io.*;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
//        File directory = new File("oooo");
//        try {
//            System.out.println(directory.getAbsolutePath());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {

            InputStream inputStream = new FileInputStream("bob.txt");
            byte[] data = new byte[inputStream.available()];
            int res = inputStream.read(data);
            System.out.println("length of data is: " + res);
            System.out.write(data);
            System.out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

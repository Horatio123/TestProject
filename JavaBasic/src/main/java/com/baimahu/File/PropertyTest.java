package com.baimahu.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try (FileOutputStream fos = new FileOutputStream("tt.propertes")) {
            properties.setProperty("name", "alex");
            properties.setProperty("pet", "pig");
            properties.store(fos, "first property");
        } catch (Exception e) {
            e.printStackTrace();
        }


        Properties pRead = new Properties();
        try (FileInputStream fis = new FileInputStream("tt.propertes")) {
            pRead.load(fis);
            System.out.println(pRead.getProperty("name"));
            System.out.println(pRead.getProperty("pet"));
            System.out.println(pRead.getProperty("tt"));

            pRead.list(System.out);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

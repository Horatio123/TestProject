package com.baimahu.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryResource {
    public static void main(String[] args){

        int a = 1000;
        String str = null;
        System.out.println("please input a number to divide");
        // IOException is checked exception
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            str = br.readLine();
            int b = Integer.parseInt(str);
            System.out.println(a/b);
            // when resource is in try(), it will close automatically, so don't need following br.close
            br.close();
        } catch (IOException e){
            System.out.println("input exception");
        } catch (NumberFormatException e){
            System.out.println(str + " can not be convert to int");
        } catch (ArithmeticException e){
            System.out.println("can not divide by 0");
        } finally {
            System.out.println("bye, this statement will execute whenever program is success or failed");
        }
    }
}

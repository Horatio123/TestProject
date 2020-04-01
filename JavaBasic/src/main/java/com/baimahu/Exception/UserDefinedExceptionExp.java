package com.baimahu.Exception;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class UserDefinedExceptionExp {
    public static void main(String[] args) throws IOException {
        System.out.println("input a num when it is smaller than 10, throw exception");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        try {
            if (num < 10){
                //throw new Exception("input is smaller than 10");
                throw new MyException("input is smaller than 10 use MyException");
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
// this is user defined exception
class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}

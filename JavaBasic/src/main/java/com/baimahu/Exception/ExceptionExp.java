package com.baimahu.Exception;

public class ExceptionExp {
    public static void main(String[] args){
        int i =6;
        int j = 2;
        int k = 0;
        int[] arr ={1, 2, 3};
        try {
            k = i / j;
            System.out.println(arr[4]);
        } catch (ArithmeticException e) {
            System.out.println("can not divided by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index of array can not excess 4");
        }

        System.out.println("the program can continue to execute after catch exception " +
                "the number of k is " + k);
    }
}

package com.baimahu.IOAndString;

import java.util.ArrayList;

public class WrapperExp {
    public static void main(String[] args) {
        Integer i = new Integer(5);
        int j = i.intValue();

        ArrayList<Integer> values = new ArrayList<>();
        values.add(i);
        try{
            System.out.println(values.get(0));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

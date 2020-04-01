package com.baimahu.IOAndString;

public class StringExp {
    public static void main(String[] args){
        // split csv format
        String str = "horatio,alexander,cuk";
        String[] strs = str.split(",");
        for (String s : strs){
            System.out.println(s);
        }

        // String is immutable str is only point to different heap place
        String str2 = "pig";
        System.out.println(str2.hashCode());
        String str3 = "pig";
        System.out.println(str3.hashCode());
        str3 = "dog";
        System.out.println(str3.hashCode());
        String str4 = new String("pig");
        System.out.println(str4.hashCode());
        System.out.println();

        // StringBuffer is thread safe but StringBuilder is not guarrented thread safe
        //their heap place can change unlike String
        StringBuffer sb = new StringBuffer("pig");
        System.out.println(sb.hashCode());
        sb.append("eat kang");
        System.out.println(sb.hashCode());
    }
}

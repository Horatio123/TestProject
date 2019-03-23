package com.baimahu;
import static java.lang.System.out;
public class JavaBasic2 {
    static {
        String s = "test static";
        out.println(s);
    }
    public static void main(String args[]){

        for (int i = 1; i < 10; i++){
            out.println(fabonacci(i));
        }

    }

     static int fabonacci(int i){
        int res = 1;
        if (i == 1||i == 2){
            return res;
        } else {
            res = fabonacci(i - 1) + fabonacci(i - 2);
        }
        return res;
    }

    class Student{
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

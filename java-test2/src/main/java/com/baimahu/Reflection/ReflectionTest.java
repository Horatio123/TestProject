package com.baimahu.Reflection;

import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) throws Exception{

        //Class c = Class.forName("com.baimahu.Reflection.Test");
        //Test test = (Test)c.newInstance();

        Test test = new Test();
        Class c = test.getClass();

        // reflection of private method is fo debug
        Method method = c.getDeclaredMethod("show");
        method.setAccessible(true);
        method.invoke(test);

        System.out.println(c.getSuperclass());
        System.out.println(c.getDeclaredFields());
    }
}

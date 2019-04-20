package com.baimahu.AnnotationDemo;

import java.lang.annotation.*;

public class AnnotationDemo {
    public static void main(String[] args) {
        Honor honor = new Honor(2999, "20171111");
        Class c = honor.getClass();

        //Class c = Class.forName("com.baimahu.AnnotationDemo.Honor");

        Annotation an = c.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone = (SmartPhone)an;
        System.out.println(smartPhone.os());
        System.out.println(smartPhone.version());
        honor.show();
    }
}

// @Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String os() default "ios";
    int version() default 1;
}
@SmartPhone(os = "Android", version = 9)
class Honor {
    int price;
    String  time;

    public Honor(int price, String time) {
        this.price = price;
        this.time = time;
    }
    @Deprecated
    public void show() {
        System.out.println("honor, Deprecated example");
    }
}
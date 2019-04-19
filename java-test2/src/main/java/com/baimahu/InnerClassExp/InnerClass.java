package com.baimahu.InnerClassExp;

public class InnerClass {
    public static void main(String[] args) {
        // member inner class
        A a = new A();
        A.B b = a.new B();
        b.show();

        // static inner class
        A.C c = new A.C();
        c.show();

        // anonymous inner class
        D d = new D() {
            @Override
            public void show() {
                System.out.println("this is anonymous class");
            }
        };
        d.show();

        // lambda expression
        E e = (q) -> System.out.println("animal is " + q);
        e.show("pig");
    }
}
class A {
    int no;
    int mark;
    class B {
        public void show() {
            System.out.println("this is inner class B");
        }
    }
    static class C {
        public void show() {
            System.out.println("this is inner class C");
        }
    }
}
class D {
    public void show() {
        System.out.println("this is inner class D");
    }
}

@FunctionalInterface
interface E {
    void show(String animal);
}
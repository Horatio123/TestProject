package com.baimahu.ObjectClone;

public class ShallowDeepCloneExp {
    public static void main(String[] args) throws CloneNotSupportedException{
        // shallow clone is made a different reference to the same object
        Abc obj = new Abc();
        System.out.println(obj);
        Abc obj1 = obj;
        obj1.i = 6;
        System.out.println(obj1);
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println();

        // deep clone create a new object in heap, and assign value to that object
        Abc obj2 = new Abc();
        obj2.i = obj.i;
        obj2.j = obj.j;
        System.out.println(obj2);
        System.out.println(obj2.hashCode());
        System.out.println();

        //clone object will create a new object in heap
        Abc obj3 = (Abc)obj.clone();
        System.out.println(obj3);
        System.out.println(obj3.hashCode());
    }
}
// Cloneable is a marker interface to give permission to this class to clone
class Abc implements Cloneable{
    int i = 8;
    int j = 1;

    @Override
    public String toString() {
        return "Abc{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

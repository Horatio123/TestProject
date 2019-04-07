package com.baimahu.CollectionGenerics;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        Container<Number> container =new Container<>(8.88);
        container.show();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(99);
        container.demo(list);
    }
}
// import type T object
class Container<T> {
    private T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show() {
        System.out.println(value.getClass().getName());
    }
    // object extend T
    public void demo(ArrayList<? extends T> list) {
        for (T t: list){
            System.out.println(t);
        }
    }
}
package com.baimahu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String args[]){
        List<Integer> ls = Stream.iterate(new int[]{0,1}, t->new int[]{t[1], t[0]+t[1]})
                .limit(10)
                .map(n->n[1])
                .collect(Collectors.toList());

        for(int i : ls){
            System.out.println(i);
        }
        System.out.println();


        List<Integer> ls2 = IntStream.range(0,11).filter(t -> t%2==0).boxed().collect(Collectors.toList());
        for(int i : ls2){
            System.out.println(i);
        }
        System.out.println();

        ls2.forEach(System.out::println);
        System.out.println();

        Integer multiply = IntStream.rangeClosed(1,5).reduce(1,(x,y) ->x*y);
        int multiply2 = IntStream.rangeClosed(1,5).reduce(2,(x,y)->x*y);
        System.out.println(multiply);
        System.out.println(multiply2);
    }
}

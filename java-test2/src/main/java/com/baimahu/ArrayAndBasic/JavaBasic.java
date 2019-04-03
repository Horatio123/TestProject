package com.baimahu.ArrayAndBasic;

/**
 * Hello world!
 *
 */
public class JavaBasic
{
    public static void main( String[] args ) {
        int a = 0B1_011_000_111;
        System.out.println(a >> 2);
        int c = 8;
        System.out.println(c << 3);

        boolean b = true;
        int j = 0;
        j = b ? 6 : 7;
        System.out.println(j);

        Object obj;
        obj = b ? new Integer(10) : new Double(15.9);
        System.out.println(obj);

        switch (j) {
            case 0:
                System.out.println("zero");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 6:
                System.out.println("Six");
                break;
        }

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                if (i == 2)
                    break;
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i < 4; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        horatio:
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                if (i == 2)
                    break horatio;
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                int l = i + k;
                if (l < 4)
                    System.out.print(l);
                else
                    System.out.print(l - 4);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k <= i; k++) {
                int l = i + k;
                if (l % 2 == 0)
                    System.out.print(0);
                else
                    System.out.print(1);
            }
            System.out.println();


        }
    }
}

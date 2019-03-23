package com.baimahu;

import java.io.*;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class FileTest
{
    public static void main( String[] args )
    {
        //ArrayList<Integer> ls = Stream.iterate(int[]{0,0} t -> int[]{t[1],t[0]+t[1]}).map(n->n[1])
        //ArrayList<Integer> ls2 = new IntStream.range(1,5).boxed
        try{
            FileOutputStream fo = new FileOutputStream("fo.dat");
            BufferedOutputStream bo = new BufferedOutputStream(fo);
            DataOutputStream ds = new DataOutputStream(bo);
            ds.writeInt(666);
            ds.close();
        }catch (Exception e){
            e.printStackTrace();
        }


        try{
            FileInputStream fi = new FileInputStream("fo.dat");
            BufferedInputStream bi = new BufferedInputStream(fi);
            DataInputStream di = new DataInputStream(bi);
            System.out.println(di.readInt());

        }catch (Exception e ){
            e.printStackTrace();
        }

    }
}

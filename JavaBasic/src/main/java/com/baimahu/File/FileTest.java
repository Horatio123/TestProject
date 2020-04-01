package com.baimahu.File;

import java.io.*;

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
        File file = new File("file2.txt");

        try (FileOutputStream fos = new FileOutputStream(file);
             DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeUTF("six seven six");
        } catch (Exception e){
            e.printStackTrace();
        }


        try (FileInputStream fis = new FileInputStream(file);
             DataInputStream dis = new DataInputStream(fis)) {
            System.out.println(dis.readUTF());

        } catch (Exception e ) {
            e.printStackTrace();
        }

    }
}

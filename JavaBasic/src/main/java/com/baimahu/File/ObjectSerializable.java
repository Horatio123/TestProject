package com.baimahu.File;

import java.io.*;

public class ObjectSerializable {
    public static void main(String[] args) throws Exception{
        Save save = new Save();
        save.num = 666;

        File file = new File("object.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(save);

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save save1 = (Save)ois.readObject();

        System.out.println(save1.num);
    }
}

class Save implements Serializable {
    int num;
}

package com.code;
import java.io.FileInputStream;
public class File_Read {
    public static void main(String[] args) {
        try {
            FileInputStream obj=new FileInputStream ("D:\\SEM_4\\OOP-java\\photo\\hello.txt");
            int n = obj.read();
            while (n != -1) {
                System.out.print ((char) n);
                   n= obj.read();
                //System.out.println (obj.read ());
            }



        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}

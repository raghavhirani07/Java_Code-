package com.code;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class File_Write {
    public static void main(String[] args) {
        try {
            FileOutputStream obj = new FileOutputStream ("D:\\SEM_4\\OOP-java\\photo\\hello.txt");
            String s ="hello World my Friends ";
            byte[] b=s.getBytes(StandardCharsets.UTF_8);
            obj.write (b);
            obj.close ();
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}

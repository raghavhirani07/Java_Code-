package com.code;

import java.io.FileInputStream;

import java.io.FileOutputStream;

public class File_Write_example {
    public static void main(String[] args) {
        try {
            FileInputStream inp = new FileInputStream ("D:\\SEM_4\\OOP-java\\photo\\wallpaper.jpg");
            FileOutputStream out = new FileOutputStream ("D:\\SEM_4\\OOP-java\\photo\\copy.jpg");
            int count=0;
            int a = inp.read ();
            while ( a != -1){
                if(count == 4){
                    out.write (73);
                }
                else if(count == 5)
                {
                    out.write(74);
                }
                else {
                    out.write ((byte) a);

                }
                a = inp.read ();
                count++;
            }
         out.close ();

        } catch (Exception e) {
            e.printStackTrace ();
        }

    }
}

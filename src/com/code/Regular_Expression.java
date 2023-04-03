package com.code;

import java.util.regex.Pattern;

public class Regular_Expression {
    public static void main(String[] args) {
        // Regular Expression
        // ^ is use start of the line
        // $ use end of line
        // {starting , end  } range


//        String str = ".xx.";
//        String strpatten = "^(?: [0-255]+ \\.){4}$";
        String regex="(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        Pattern pattern = Pattern.compile (regex);

        if(pattern.matcher ("102.127.127.127").matches ()){
            System.out.println (" Matched");
        }
        else{
            System.out.println ("Not Matched");
        }
    }
}

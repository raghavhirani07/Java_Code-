//? In the problem we give a string as "NWES" direction and find Minimum Shortest path

package com.code;
import java.awt.*;

public class string_destination {
    public static void main(String[] args) {

    Point p =new Point (0,0);
    String str ="WNEENESENNN";
        System.out.println (short_path(str,p));
    }

    public static double short_path(String str, Point p) {
        for (int i = 0; i <str.length () ; i++) {
            char current = str.charAt (i);
            if(current == 'W'){
                p.x=p.x-1;
            }
            else if(current == 'N'){
                p.y = p.y+1;
            }
            else if ( current  == 'E'){
                p.x=p.x+1;
            }
            else{
                p.y = p.y-1;
            }
        }
        return  Math.sqrt((Math.pow (p.x,2))+(Math.pow (p.y,2)));
    }
}

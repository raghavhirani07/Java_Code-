package com.code;
import java.util.*;

public class Prims_Algorithm {

    public static void connect_edge(int n ,ArrayList<graph> arr,int[][] g,char[] v){
        for (int i = 0; i < 5 ; i++) {
            if(g[n][i] > 0){
                arr.add (new graph (v[n],v[i],g[n][i]));
            }
        }
        arr.sort (Comparator.comparingInt (o -> o.wight));
    }
    public static boolean  iscreatecycle( Set<Character> s , char a,char b){
        int len  = s.size ();
        s.add (a);
        s.add(b);
        return (len == s.size ());
    }
    public static char selectEdge(ArrayList<graph> arr , Set<Character> s , char a ) {
        char n =a;
        for (int j = 0; j < arr.size (); j++) {
            if (!iscreatecycle (s, arr.get (j).e2,arr.get (j).e1)) {
                System.out.println (arr.get (j).e1 + "--> " + arr.get (j).e2);
                n = arr.get (j).e2;
                s.add (n);
                arr.remove (j);
            }
            else{
                arr.remove (j);
            }
        }
        return n;
    }
    public static int indexofarray(char[] arr , char c){
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == c){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] g = {{0, 7, 8, 5, 0}, {7, 0, 0, 10, 6}, {8, 0, 0, 9, 0}, {5, 10, 9, 3, 15}, {0, 6, 0, 15, 0}};
        char[] vertex = {'A', 'B', 'C', 'D', 'E'};
        ArrayList<graph> arr = new ArrayList<> ();
        Set<Character> select = new HashSet<> ();
        char temp ='A';
        while(select.size () != vertex.length){
             temp =selectEdge (arr,select,temp);
             connect_edge (indexofarray (vertex,temp), arr,g,vertex);
        }
    }
}
package com.code;

import java.util.*;

public class Prims_Algorithm {

    public static class graph{
        char e1,e2;
        int wight;
        graph(char e1,char e2,int wight){
           this.e1=e1;
           this.e2=e2;
           this.wight=wight;
        }
    }
    public static void connect_edge(int n ,ArrayList<graph> arr,int[][] g,char[] v){
        for (int i = n+1; i < 5 ; i++) {
            if(g[n][i] > 0){
                arr.add (new graph (v[n],v[i],g[n][i]));
            }
        }
        Collections.sort (arr, Comparator.comparingInt (o -> o.wight));
    }
    public static boolean  iscreatecycle(Set<Character> s , char a){
        int len  = s.size ();
        s.add (a);
        return len == s.size ();
    }
    public static void main(String[] args) {
        int[][] g = {{0, 7, 8, 5, 0}, {7, 0, 0, 10, 6}, {8, 0, 0, 9, 0}, {5, 10, 9, 3, 15}, {0, 6, 0, 15, 0}};
        char[] vertex = {'A', 'B', 'C', 'D', 'E'};
        ArrayList<graph> arr = new ArrayList<> ();
        connect_edge (0,arr,g,vertex);
        Set<Character> select = new HashSet<> ();
        Iterator<graph> i = arr.iterator();
        while(i.hasNext ()){
            System.out.println (i.next ().wight);
        }

    }
}
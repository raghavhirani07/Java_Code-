package com.code;

import java.util.*;

public class krushkal_algorithm {
    public static boolean iscycle(char a,char b , Set<Character> s ){
        int len = s.size ();
        s.add (a);
        s.add (b);
        return len == s.size ();
    }
    public static void insert_edge(ArrayList<graph> g , char[] vertex, int[][] graph_weight){
        for (int i = 0; i < vertex.length ; i++) {
            for (int j = i+1; j < vertex.length ; j++) {
                if(graph_weight[i][j] > 0 ) {
                    g.add (new graph (vertex[i], vertex[j], graph_weight[i][j]));
                }
            }
        }
        g.sort (Comparator.comparingInt (o->o.wight));
    }
    public static void main(String[] args) {
        int[][] graph_weight = {{0,7,8,5,0},{7,0,0,10,6},{8,0,0,9,0},{5,10,9,3,15},{0,6,0,15,0}};
        char[] vertex = {'A','B','C','D','E'};
        Set<Character> select = new HashSet<> ();
        ArrayList<graph> g = new ArrayList<> ();

        //* Enter all Edge with both Vertex with sorting order
        insert_edge (g,vertex,graph_weight);

        Iterator<graph> i = g.iterator ();
        while(i.hasNext ()){
            graph item =i.next ();
            if(!iscycle (item.e1, item.e2, select)) {
                System.out.println (item.e1 + "--> " + item.e2 + " == " + item.wight);
            }

        }
    }
}

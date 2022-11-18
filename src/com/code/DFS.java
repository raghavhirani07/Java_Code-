package com.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DFS {

    public static void main(String[] args) {
        System.out.println ("Enrollment no. = 200130107068");
        System.out.println ("Name = Hirani Raghav");
        Set<Integer> s = new HashSet<> (Arrays.asList (0,1,2,3,4,5,6));
        int total_vertex=s.size ();
        ArrayList<graph>[] edge =new ArrayList[total_vertex];
        for (int i = 0; i <total_vertex ; i++) {
            edge[i]=new ArrayList<> ();
        }
        //* Graph making using graph class
        graph.create_graph (edge);
        dfs (edge,0,new boolean[total_vertex]);
    }

    public static void dfs(ArrayList<graph>[] edge, int curr,boolean[] visited) {
        System.out.print (curr+ "  ");
        visited[curr]= true;
        for (int i = 0; i < edge[curr].size () ; i++) {
             graph e = edge[curr].get (i);
             if(!visited[e.des]){
                 dfs (edge,e.des,visited);
             }
        }
    }
}

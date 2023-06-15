package com.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//? Bfs traversal in graph

public class graph_practicle_2 {

    public static void main(String[] args) {
     
        Set<Integer> s = new HashSet<> (Arrays.asList (0,1,2,3,4,5,6));
        int total_vertex=s.size ();
        ArrayList<graph>[] edge =new ArrayList[total_vertex];

        //* Graph making using graph class
        graph.create_graph (edge,total_vertex);
        dfs(edge);
    }

    //* This is Dfs Function Original For one Connected Graph
    public static void dfsUtils(ArrayList<graph>[] edge, int curr,boolean[] visited) {
        System.out.print (curr+ "  ");
        visited[curr]= true;
        for (int i = 0; i < edge[curr].size () ; i++) {
             graph e = edge[curr].get (i);
             if(!visited[e.des]){
                 dfsUtils(edge,e.des,visited);
             }
        }
    }

    //* This is main Function that Travel all Graph Whatever that are connected or not connected
    public static void dfs(ArrayList<graph>[] edge ){
        boolean visited[] = new boolean[edge.length];
        for (int i = 0; i < edge.length; i++) {
            dfsUtils (edge,i,visited);
        }
    }
}

package com.code;
//? has path in graph

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import static com.code.graph_practicle_1.bfs;

public class graph_practicle_3 {
    public static void haspath(graph g , int src ,int des, Set<Integer> visited ){

    }
    public static void main(String[] args) {
        Set<Integer> visited = new HashSet<> ();
        Set<Integer> s = new HashSet<>(Arrays.asList (0,1,2,3,4,5,6));
        int total_vertex=s.size ();
        ArrayList<graph>[] g=new ArrayList[total_vertex];
        graph.create_graph (g,total_vertex);
        bfs (g,total_vertex);

    }
}

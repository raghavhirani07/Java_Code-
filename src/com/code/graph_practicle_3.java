package com.code;
//? has path in graph

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class graph_practicle_3 {
    public static boolean haspath(ArrayList<graph>[] g, int src, int des, boolean visited[]) {
        if (src == des) {
            return true;
        }
        visited[src] = true;
        for (int i = 0; i < g[src].size (); i++) {
            graph neb = g[src].get (i);
            if (!visited[neb.des] && haspath (g, neb.des, des, visited)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Set<Integer> visited = new HashSet<> ();
        Set<Integer> s = new HashSet<> (Arrays.asList (0, 1, 2, 3, 4, 5, 6));
        int total_vertex = s.size ();
        ArrayList<graph>[] g = new ArrayList[total_vertex];
        graph.create_graph (g, total_vertex);
        System.out.println (haspath (g, 0, 7, new boolean[total_vertex]));
//        bfs (g,total_vertex);

    }
}

package com.code;
import java.util.*;
    // Bfs Graph Travel
public class BFS {

    public  static  void bfs(ArrayList<graph>[] edge ,int total_vertex){
        Queue<Integer> q =new LinkedList<> ();
        boolean[] visited =new boolean[total_vertex];
        q.add (0);
        while (!q.isEmpty ()){
             int curr = q.remove ();
             if(!visited[curr]){
                 System.out.println (curr);
                 visited[curr]= true;
                 for (int i = 0; i < edge[curr].size ();i++){
                     graph e =edge[curr].get(i);
                     q.add (e.des);
                 }
             }
        }
    }
    public static void main(String[] args) {

        Set<Integer> s = new HashSet<>(Arrays.asList (0,1,2,3,4,5,6));
        int total_vertex=s.size ();
        ArrayList<graph>[] edge =new ArrayList[total_vertex];
        for (int i = 0; i <total_vertex ; i++) {
           edge[i]=new ArrayList<> ();
        }
        //* Graph making using graph class
        graph.create_graph (edge);
        bfs (edge,total_vertex);

    }
}

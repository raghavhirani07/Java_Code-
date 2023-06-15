package com.code;

//* Detect A cycle in Graph
//* Use Graph as graph class implementation
//* this problem solute by bfs , dfs , setUnion

//* set union is very easy method if your current Edge both src and des are already visited then cycle detect But in undirected Graph

import java.util.ArrayList;

public class graph_practicle_4 {

    public static boolean detectcycle(ArrayList<graph>[] edge ){
        boolean[] visited = new boolean[edge.length];
        for (int i = 0; i < edge.length; i++) {
            if(!visited[i]){
                if(detectcycleUtils (edge, visited,i,-1)){
                    return  true;
                }
            }
        }
        return false;
    }

    public static boolean detectcycleUtils(ArrayList<graph>[] edge, boolean[] visited, int curr, int parent) {
        visited[curr] = true;
        for (int i = 0; i < edge[curr].size (); i++) {
            graph temp = edge[curr].get(i);
            if(!visited[temp.des]){
                //* current made parent
                if( detectcycleUtils (edge,visited,temp.des,curr)){
                    return true;
                }
            }
            else if (visited[temp.des] && temp.des != parent){
                return  true;
            }
        }
        return  false;
    }


    public static void main(String[] args) {
        ArrayList<graph>[] edge = new ArrayList[7];
        graph.create_graph (edge,7);
        System.out.println (detectcycle (edge));
    }
}

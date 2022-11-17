package com.code;

import java.util.ArrayList;

public class graph {
    int src,des;
    char e1,e2;
    int wight;
    graph(char e1,char e2,int wight){
        this.e1=e1;
        this.e2=e2;
        this.wight=wight;
    }
    graph(int src,int des,int wight){
        this.src=src;
        this.des=des;
        this.wight=wight;
    }
    public  static  void  create_graph(ArrayList<graph>[] edge){
        edge[0].add (new graph (0,1,1));
        edge[0].add (new graph (0,2,1));

        edge[1].add (new graph (1,3,1));
        edge[1].add (new graph (1,0,1));

        edge[2].add (new graph (2,0,1));
        edge[2].add (new graph (2,4,1));

        edge[3].add (new graph (3,1,1));
        edge[3].add (new graph (3,4,1));
        edge[3].add (new graph (3,5,1));

        edge[4].add (new graph (4,2,1));
        edge[4].add (new graph (4,3,1));
        edge[4].add (new graph (4,5,1));

        edge[5].add (new graph (5,3,1));
        edge[5].add (new graph (5,4,1));
        edge[5].add (new graph (5,6,1));

        edge[6].add (new graph (6,5,1));
    }
}

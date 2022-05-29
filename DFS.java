package com.company;

import java.util.LinkedList;
import java.util.*;

//The algorithm starts at the root node (selecting some arbitrary node as the root node in the case of a graph) and
// explores as far as possible along each branch before backtracking.
// So the basic idea is to start from the root or any arbitrary node and mark the node and move to the adjacent unmarked node
// and continue this loop until there is no unmarked adjacent node.
// Then backtrack and check for other unmarked nodes and traverse them.
public class DFS {
    private int v;
    private LinkedList<Integer> adjLists[];
    DFS(int v){
        this.v=v;
        adjLists=new LinkedList[v];
        for(int i=0;i<v;i++){
            adjLists[i]=new LinkedList<>();
        }

    }
    public void addEdge(int u,int v){
    adjLists[u].add(v);


    }
    void DFSutil(int v,boolean visited[]){
        visited[v]=true;
        System.out.print(v+" ");
        //we need to iterate among the adjacent nodes of v
        Iterator<Integer>i=adjLists[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSutil(n, visited);
        }




    }

    void DFSoperate(int n){
        boolean visited[]=new boolean[v];
        for(int i=0;i<v;i++){
            visited[i]=false;
        }
        DFSutil(n,visited);
    }

    public static void main(String []args){
        int v=4;
        DFS g=new DFS(v);
        //directed graph cases only

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");
        g.DFSoperate(2);

    }
}

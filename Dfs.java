package com.company;

import java.util.*;


public class Dfs {
    private int V;
    public ArrayList<ArrayList<Integer>>l=new ArrayList<ArrayList<Integer>>(V);


    Dfs(int h){
        V=h;

        for (int i = 0; i < V; i++)
            l.add(new ArrayList<Integer>());

        addedge(l,0, 1);
        addedge(l,0, 2);
        addedge(l,1, 2);
        addedge(l,2, 0);
        addedge(l,2, 3);
        addedge(l,3, 3);


           /* int choose=1;
            @SuppressWarnings("resource")
            Scanner s=new Scanner(System.in);

            while(choose==1) {
                System.out.println("Enter 1 if you want to add edges or 0 when done ");
                choose=s.nextInt();
                int u,v;
                System.out.println("enter source: ");
                u=s.nextInt();
                System.out.println("enter final: ");
                v=s.nextInt();
                addedge(l,u,v);



            }*/


    }
    void DFSUtil(int v, boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this
        // vertex
        for(Integer num:l.get(v)) {

            int n=num;
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
    void DFS(int source) {
        boolean visited[] = new boolean[V];
        DFSUtil(source, visited);

    }

    void addedge(ArrayList<ArrayList<Integer>>k,int u,int v) {
        k.get(u).add(v);
        k.get(v).add(u);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Dfs g=new Dfs(4);
        System.out.println("DFS TRAVERSAL IS ");



        g.DFS(2);

    }
}

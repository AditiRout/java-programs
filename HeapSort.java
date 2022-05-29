package com.company;

import java.util.ArrayList;

//program to create a max heap using heapify and build heap togather
public class HeapSort {

    public void heapify(ArrayList<Integer>a,int n,int i){
        //n is size of heap

        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && a.get(l) >a.get(i)){
            largest=l;
        }
        if(r<n && a.get(r) >a.get(i)){
            largest=r;
        }
        if(largest!=i){
            int swap = a.get(i);
            a.set(i,a.get(largest));
            a.set(largest,swap) ;

            // Recursively heapify the affected sub-tree
            heapify(a, n, largest);
        }

    }
    public void buildHeap(ArrayList<Integer>a,int n){
        for(int i=(n/2)-1;i>=0;i--){
            heapify(a,n,i);
        }
    }
    public void sort(ArrayList<Integer>a){
        int n=a.size();
        buildHeap(a,n);
        for(int i=n-1;i>0;i--) {
            int swap = a.get(i);
            a.set(i, a.get(0));
            a.set(0, swap);

            heapify(a,i-1,0);

        }
    }
    static void printArray(ArrayList<Integer>a)
    {
        int n = a.size();
        for (int i = 0; i < n; ++i)
            System.out.print(a.get(i) + " ");
        System.out.println();
    }
    public static void main(String []args){
        ArrayList<Integer>a=new ArrayList<>();
        a.add(12);
        a.add(11);
        a.add(13);
        a.add(5);
        a.add(6);
        HeapSort ob = new HeapSort();
        ob.sort(a);
        System.out.println("Sorted array is");
        printArray(a);

    }
}

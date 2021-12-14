package dsa;
import java.util.*;

public class Bfs {
	private int V;
	public ArrayList<ArrayList<Integer>>l=new ArrayList<ArrayList<Integer>>(V);
	
	
	Bfs(int h){
		V=h;
		
		for (int i = 0; i < V; i++)
		       l.add(new ArrayList<Integer>());
		
		
		int choose=1;
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
			
			
			
		}
		
		
	}
	void BFS(int source) {
		boolean visited[]=new boolean[V];
		 // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[source]=true;
        queue.add(source);
        while(!queue.isEmpty()) {
        	 source = queue.poll();
             System.out.print(source+" ");
             for(Integer num:l.get(source)) {
            	 int n=num;
            	 if (!visited[n])
                 {
                     visited[n] = true;
                     queue.add(n);
                 }
             }
        }
 
	}
	
	void addedge(ArrayList<ArrayList<Integer>>k,int u,int v) {
		k.get(u).add(v);
		k.get(v).add(u);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bfs d=new Bfs(5);
		System.out.println("BFSTRAVERSAL IS ");
		d.BFS(0);

	}

}

package dsa;
/*public class Node {
	int val;
	Node next;
	public Node() {}
	public Node(int d) {
		val=d;
		next=null;
	}

}*/

import java.util.Scanner;
class Solution {
	public Node head;
	
public  void add(int n) {
	
	Node body=new Node(n);
	if(head==null) {
		head=body;
	}
	else {
		Node ptr=head;
		while(ptr.next!=null) {
			ptr=ptr.next;
			}
		ptr.next=body;
	}}

	
  public void count() {
	Node ptr=head;
	int d=0;
	while(ptr!=null) {
		d++;
		ptr=ptr.next;
		
	}
	System.out.println("no.ofnodes: "+d);
}
  
  public void display() {
	  Node ptr=head;
	  while(ptr!=null) {
		  System.out.print(ptr.val+" ");
		  ptr=ptr.next;
	  }
  }
  public static void main(String[] args) {
	  
	Scanner s=new Scanner(System.in);
	  System.out.println("enter no.of nodes:");
	  Solution ans=new Solution();
	  int d=s.nextInt();
	  
	  while(d>0) {
		  int k=s.nextInt();
		  ans.add(k);
		  d--;
	  }
	  ans.count();
	  ans.display();
	  s.close();
	  
	  
	
	
	
        
        
    }

}
  
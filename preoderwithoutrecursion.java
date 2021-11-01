package dsa;


import java.util.*;
import java.util.Scanner;
public class preoderwithoutrecursion {
	public Treenode build(int[]arr,int l,int h,Treenode n) {
		if(l<h) {
			Treenode nw=new Treenode(arr[l]);
			n=nw;
			n.left=build(arr,2*l+1,h,n.left);
			n.right=build(arr,2*l+2,h,n.right);
			
		}
		return n;
	}
	
	public static void pre(Treenode n) {
		List<Integer>l=new ArrayList<>();
		Stack<Treenode>s=new Stack<>();
		s.push(n);
		Treenode current =n;
		System.out.println("Preorder");
		while(!s.isEmpty()) {
			current=s.pop();
			l.add(current.val);
			if(current.right != null) {
	            s.push(current.right);
	        }    
	        if(current.left != null) {
	            s.push(current.left);
	        }
			
		}
		System.out.println(l);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int h=s.nextInt();
		int[]arr=new int[h];
		for(int i=0;i<h;i++) {
			arr[i]=s.nextInt();
		}
		Binarytree tree=new Binarytree();
		Treenode root=new Treenode();
		root=tree.build(arr, 0, h, root);
		pre(root);
		// TODO Auto-generated method stub

	}

}

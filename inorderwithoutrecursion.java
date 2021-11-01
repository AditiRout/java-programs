package dsa;

import java.util.*;
public class inorderwithoutrecursion {

	
		public Treenode build(int[]arr,int l,int h,Treenode n) {
			if(l<h) {
				Treenode nw=new Treenode(arr[l]);
				n=nw;
				n.left=build(arr,2*l+1,h,n.left);
				n.right=build(arr,2*l+2,h,n.right);
				
			}
			return n;
		}
		
		public static void in(Treenode root) {
			List<Integer>l=new ArrayList<>();
			Stack<Treenode> stack = new Stack<>();
		    Treenode current = root;
		    stack.push(root);
		    while(! stack.isEmpty()) {
		        while(current.left != null) {
		            current = current.left;                
		            stack.push(current);                
		        }
		        current = stack.pop();
		        l.add(current.val);
		        if(current.right != null) {
		            current = current.right;                
		            stack.push(current);
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
			in(root);
			// TODO Auto-generated method stub

		}

		// TODO Auto-generated method stub

	}



package dsa;

/*public class Treenode {
	int val;
	Treenode right;
	Treenode left;
	Treenode(){}
	Treenode(int val){
		this.val=val;
		right=left=null;
		
	}
	

}
*/

import java.util.Scanner;

public class Binarytree {
	
	public void preorder(Treenode n) {
		if(n==null) {
			return;
		}
		System.out.print(n.val+" ");
		preorder(n.left);
		preorder(n.right);
		
	}
	public void inorder(Treenode n) {
		if(n==null) {
			return;
		}
		inorder(n.left);
		System.out.print(n.val+" ");
		inorder(n.right);
		
	}
	public void postorder(Treenode n) {
		if(n==null) {
			return;
		}
		
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.val+" ");
		
	}
	public Treenode build(int[]arr,int l,int h,Treenode n) {
		if(l<h) {
			Treenode nw=new Treenode(arr[l]);
			n=nw;
			n.left=build(arr,2*l+1,h,n.left);
			n.right=build(arr,2*l+2,h,n.right);
			
		}
		return n;
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
		System.out.println();
		tree.postorder(root);
		System.out.println();
		tree.preorder(root);
		System.out.println();
		tree.inorder(root);
		s.close();
		
		// TODO Auto-generated method stub

	}

}

package dsa;
import java.util.Scanner;
public class inverttree {

	
	public Treenode build(int[]arr,int l,int h,Treenode n) {
		if(l<h) {
			Treenode nw=new Treenode(arr[l]);
			n=nw;
			n.left=build(arr,2*l+1,h,n.left);
			n.right=build(arr,2*l+2,h,n.right);
			
		}
		return n;
	}
	
	public Treenode invert(Treenode root) {
		//invert function for any depth
		if(root==null) {
			return root;
		}
		Treenode temp=root.left;
		root.left=root.right;
		root.right=temp;
		invert(root.left);
		invert(root.right);
		return root;
		
		
		
	}
	public int depth(Treenode root) {
		//to find depth for any tree
		if(root==null) {
			return 0;
		}
		return 1+Math.max(depth(root.left),depth( root.right));
	}
	public void display(Treenode root,int h,int depth) {
		//for max depth 3 only
		
		int[]arr=new int[h];
		arr[0]=root.val;
		int n=1;
		Treenode t= new Treenode();
		Treenode z= new Treenode();
		
		
		for(int i=0;i<depth;i++) {
			arr[2*i+1]=root.left.val;
			arr[2*i+2]=root.right.val;
			if(n==1) {
				t=root;
				root=t.left;
				
				n=0;
				
			}
			else {
				root=t.right;
				n=1;
			}
			
			
		}
		for(int i=0;i<h;i++) {
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int h=s.nextInt();
		int[]arr=new int[h];
		for(int i=0;i<h;i++) {
			arr[i]=s.nextInt();
		}
		inverttree tree=new inverttree();
		Treenode root=new Treenode();
		
		root=tree.build(arr, 0, h, root);
		Treenode k=root;
		int depth=tree.depth(root);
		System.out.println("depth:" +depth);
		tree.display(k, h, depth);
		k=tree.invert(k);
		System.out.println("inverted one");
		tree.display(k, h, depth);
		
		s.close();
		

	}

}

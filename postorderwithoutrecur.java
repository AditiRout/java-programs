package dsa;

import java.util.*;
public class postorderwithoutrecur {
	public Treenode build(int[]arr,int l,int h,Treenode n) {
		if(l<h) {
			Treenode nw=new Treenode(arr[l]);
			n=nw;
			n.left=build(arr,2*l+1,h,n.left);
			n.right=build(arr,2*l+2,h,n.right);
			
		}
		return n;
	}
	public static void pos(Treenode root) {
		
		List<Integer>l=new ArrayList<>();
		Stack<Treenode> stack = new Stack<>();
	    Treenode prev = root;
	    Treenode current = root;
	    stack.push(root);

	    while (!stack.isEmpty()) {
	        current = stack.peek();
	        boolean hasChild = (current.left != null || current.right != null);
	        boolean isPrevLastChild = (prev == current.right || 
	          (prev == current.left && current.right == null));

	        if (!hasChild || isPrevLastChild) {
	            current = stack.pop();
	            l.add(current.val);
	            prev = current;
	        } else {
	            if (current.right != null) {
	                stack.push(current.right);
	            }
	            if (current.left != null) {
	                stack.push(current.left);
	            }
	        }
	    } 
	    System.out.println("Postorder");
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
		pos(root);
		// TODO Auto-generated method stub

	}
}

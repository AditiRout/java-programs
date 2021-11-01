package dsa;

import java.util.Scanner;
public class BST {
	
	
	public Treenode insert(Treenode root, int key) {
		// if the root is null, create a new node and return it
        if (root == null) {
            return new Treenode(key);
        }
 
        // if the given key is less than the root node,
        // recur for the left subtree
        if (key < root.val) {
            root.left = insert(root.left, key);
        }
 
        // otherwise, recur for the right subtree
        else {
            // key >= root.data
            root.right = insert(root.right, key);
        }
 
        return root;
    }  
	public void inorder(Treenode n) {
		

		if (n == null) {
            return;
        }
 
        inorder(n.left);
        System.out.print(n.val + " ");
        inorder(n.right);

        
	}
	
	


	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		BST t=new BST();
		int n=s.nextInt();
		int[] v=new int[n];
		
		for(int i=0;i<n;i++) {
			v[i]=s.nextInt();
			
			
		}
		Treenode root=null;
		
		for(int i=0;i<n;i++) {
			 root=t.insert(root,v[i]);
		}
		
		System.out.println("BST in inorder:");
		t.inorder(root);
		s.close();
		
		
		
	}
		// TODO Auto-generated method stub

	}



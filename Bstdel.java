package dsa;


import java.util.Scanner;

public class Bstdel {
	public Treenode root;
	public Bstdel() {
		root=null;
	}
	public void insert(int val) {  
        //Create a new Treenode  
         Treenode newnode = new Treenode(val);  

        //Check whether tree is empty  
        if(root == null){  
            root = newnode;  
            return;  
          }  
        else {  
            //current Treenode point to root of the tree  
            Treenode current = root, parent = null;  

            while(true) {  
                //parent keep track of the parent Treenode of current Treenode.  
                parent = current;  

                //If val is less than current's val, Treenode will be inserted to the left of tree  
                if(val < current.val) {  
                    current = current.left;  
                    if(current == null) {  
                        parent.left = newnode;  
                        return;  
                    }  
                }  
                //If val is greater than current's val, Treenode will be inserted to the right of tree  
                else {  
                    current = current.right;  
                    if(current == null) {  
                        parent.right = newnode;  
                        return;  
                    }  
                }  
            }  
        }  
    }  
	public Treenode min(Treenode root) {
		if(root.left!=null) {
			return min(root.left);
		}
		else {
			return root;
		}
	}
	public Treenode deleteTreenode(Treenode Treenode, int value) {  
        if(Treenode == null){  
            return null;  
         }  
        else {  
            //value is less than Treenode's val then, search the value in left subtree  
            if(value < Treenode.val)  
                Treenode.left = deleteTreenode(Treenode.left, value);  

            //value is greater than Treenode's val then, search the value in right subtree  
            else if(value > Treenode.val)  
                Treenode.right = deleteTreenode(Treenode.right, value);  

            //If value is equal to Treenode's val that is, we have found the Treenode to be deleted  
            else {  
                //If Treenode to be deleted has no child then, set the Treenode to null  
                if(Treenode.left == null && Treenode.right == null)  
                    Treenode = null;  

                //If Treenode to be deleted has only one right child  
                else if(Treenode.left == null) {  
                    Treenode = Treenode.right;  
                }  

                //If Treenode to be deleted has only one left child  
                else if(Treenode.right == null) {  
                    Treenode = Treenode.left;  
                }  

                //If Treenode to be deleted has two children Treenode  
                else {  
                    //then find the minimum Treenode from right subtree  
                    Treenode temp = min(Treenode.right);  
                    //Exchange the val between Treenode and temp  
                    Treenode.val = temp.val;  
                    //Delete the Treenode duplicate Treenode from right subtree  
                    Treenode.right = deleteTreenode(Treenode.right, temp.val);  
                }  
            }  
            return Treenode;  
        }  
    }  
	 public void inorderTraversal(Treenode node) {  
		  
         //Check whether tree is empty  
         if(root == null){  
             System.out.println("Tree is empty");  
             return;  
          }  
         else {  
 
             if(node.left!= null)  
                 inorderTraversal(node.left);  
             System.out.print(node.val + " ");  
             if(node.right!= null)  
                 inorderTraversal(node.right);  
 
         }  
     }  

	public static void main(String[] args) {
		Bstdel bt=new Bstdel();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			 bt.insert(s.nextInt());
			
		}
		   
          System.out.println("Binary search tree after insertion:");  
          //Displays the binary tree  
          bt.inorderTraversal(bt.root);  
  
          Treenode deletedNode =null;  
          //Deletes node 90 which has no child  
          deletedNode = bt.deleteTreenode(bt.root, 90);  
          System.out.println("\nBinary search tree after deleting node 90:");  
          bt.inorderTraversal(bt.root);  
  
          //Deletes node 30 which has one child  
          deletedNode = bt.deleteTreenode(bt.root, 30);  
          System.out.println("\nBinary search tree after deleting node 30:");  
          bt.inorderTraversal(bt.root);  
  
          //Deletes node 50 which has two children  
          deletedNode = bt.deleteTreenode(bt.root, 50);  
          System.out.println("\nBinary search tree after deleting node 50:");  
          bt.inorderTraversal(bt.root);  
          s.close();
      }  

  
		// TODO Auto-generated method stub

	}



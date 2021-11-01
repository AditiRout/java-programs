package dsa;

public class BSTsearch {
	
	 public void searchNode(Treenode root, int value){  
	        //Check whether tree is empty  
	        if(root == null){  
	          System.out.println("Tree is empty");  
	        }  
	        else{  
	          //If value is found in the given binary tree then, set the flag to true  
	          if(root.val == value){  
	            System.out.println("val found"); 
	          }  
	          //Search in left subtree 
	          
	          if(value<root.val && root.left != null){  
	             searchNode(root.left, value);  
	          }  
	          //Search in right subtree  
	          if(value>root.val && root.right != null){  
	             searchNode(root.right, value);  
	          }  
	        }  
	      }
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

	public static void main(String[] args) {
		BSTsearch b=new BSTsearch();
		Treenode root=new Treenode();
		b.insert(root, 0);
		b.insert(root, 30);
		b.insert(root, 40);
		b.insert(root, 5);
		b.insert(root, 23);
		b.searchNode(root, 30);
		// TODO Auto-generated method stub

	}

}

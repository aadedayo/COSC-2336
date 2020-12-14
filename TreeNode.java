/* Adedayo Adebanjo							`
 * COSC 2336
 * 12/03/2020
 * Purpose: Code implementation of the TreeNode
 **/

/**
 * @author aaded
 *
 */
public class TreeNode {
	 public int item;  
	 public TreeNode leftChild; 
	 public TreeNode rightChild;
	 
	 public TreeNode(int newItem) {
		 // Initializes tree node with item and no children.   
		 item = newItem;
		 leftChild  = null; 
		 rightChild = null;
	 } // end constructor
	 
	 public TreeNode(int newItem,                 
			 TreeNode left, TreeNode right) {
		// Initializes tree node with item and  
		 // the left and right children references.
		 item = newItem;    
		 leftChild  = left;
		 rightChild = right;
	 } // end constructor
} // end TreeNode

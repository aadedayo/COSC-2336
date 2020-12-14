/* Adedayo Adebanjo							`
 * COSC 2336
 * 12/03/2020
 * Purpose: Code implementation of the Binary Search Tree
 *          - I also tested my project with the main method**/


/**This class consist of Code implementation of the Binary Search Tree
 * It has the insert, search and inorder method
 * 
 * @author aaded
 *
 */
public class BinarySearchTree {
	TreeNode root;

	BinarySearchTree(){ 
        root = null; 
    } 
	
	// Method to check if item is presemt
	boolean searchResult(int item)  { 
        root = search(root, item); 
        if (root!= null)
            return true;
        else
            return false;
    } 
	
	
	// A method to search a given key in BST 
	public TreeNode search(TreeNode root, int item) 
	{ 
	    // Root is null or item is present at root  (Base Case)
	    if (root==null || root.item==item) 
	        return root; 
	  
	    // Item is greater than root's item 
	    if (root.item < item) 
	       return search(root.rightChild, item); 
	  
	    // Item is smaller than root's Item 
	    return search(root.leftChild, item); 
	} 
	
	
	void insert(int item)  
    {  
         root = insertRec(root, item);  
    } 
  
    /* A recursive method to insert a new item in BST */
    TreeNode insertRec(TreeNode root, int item) 
    { 
  
        if (root == null)  
        { 
            root = new TreeNode(item); 
            return root; 
        } 
        
        if (item < root.item) 
            root.leftChild = insertRec(root.leftChild, item); 
        else if (item > root.item) 
            root.rightChild = insertRec(root.rightChild, item); 
  
  
        return root; 
    } 
  
    // This method mainly calls InorderRec() 
    void inorder()  
    {  
         inorderRec(root);  
    } 
  
    // A method for inorder traversal of BST 
    void inorderRec(TreeNode root) 
    { 
        if (root != null) { 
            inorderRec(root.leftChild); 
            System.out.print(root.item + " "); 
            inorderRec(root.rightChild); 
        } 
    } 

    
	/**This main method was used to test my project
	 * 
	 * @param args NOT USED
	 */
	public static void main(String[] args) {
		// Create a new bst
		BinarySearchTree bst = new BinarySearchTree(); 
		
		// Insert into your bst
		bst.insert(23);
		bst.insert(12);
		bst.insert(34);
		bst.insert(35);
		bst.insert(25);
		bst.insert(67);
		bst.insert(45);
		bst.insert(78);
		
		// Output your bst
		System.out.print("Here is the output of the tree: ");
		bst.inorder();
		
		// Check if 55 is an item in bst
		boolean value = bst.searchResult(55);
		System.out.println();
		System.out.println("Is 55 in the BST: " + value);
		
		// Insert into bst
		bst.insert(60);
		bst.insert(55);
		
		// Check again if 55 is an item in bst
		value = bst.searchResult(55);
		System.out.println("Is 55 in the BST: " + value);
		
		// Insert into your bst
				bst.insert(23);
				bst.insert(12);
				bst.insert(34);
				bst.insert(35);
				bst.insert(25);
				bst.insert(67);
				bst.insert(45);
				bst.insert(78);
				bst.insert(60);
				bst.insert(55);
		
		
		// Output updated bst
		System.out.print("Here is the updated output of the tree: ");
		bst.inorder();
			
	}

}

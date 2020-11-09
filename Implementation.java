/* Adedayo Adebanjo							`
 * COSC 2336
 * 10/15/2020
 * Purpose: Implementation of add, remove, and display method 
 * 			- I also tested my project with the main method.*/
package linkedList;

/** This class tests the IntegerNode class
 * 
 * @author aaded
 *
 */
public class Implementation {

	    IntegerNode head;
	  
	    //This constructor initilise head pointer to null
	    Implementation() {
	        this.head = null;
	    }
	  
	    

	    /**This creates a method that takes an integer as inputs and add that input(item) to the linked list.
	     * @param item // input
	     */
	    public void insert(int item) {
	        IntegerNode newNode = new IntegerNode(item);   // This create a new node with the item
	        if (head == null) {                  // if list is empty then we insert at the top, so newnode is the head
	            head = newNode;
	        }
	        else {                             //Else add the item to the end of the list
	            IntegerNode temphead = head;
	            while (temphead.next != null) {
	                temphead = temphead.next;
	            }
	            temphead.next = newNode;
	        }
	    }

	   
	    /*
	     * *This creates a method that displays all items in the linked list.
	     */
	    public void display() {
	        IntegerNode temphead = head;
	        if (temphead == null) {                         // Warn user if linked list is empty
	            System.out.print("Empty Linked List");
	        }
	        else {                                                // else analyse all the Nodes and prints the linked list
	            while (temphead != null) {                        
	                System.out.print(temphead.item + " ");
	                temphead = temphead.next;
	            }
	        }
	        System.out.println("");
	    }
	  
	    
	    /**This creates a method that deletes an integer(item) from the linked list.
	     * @param item
	     */
	    public void delete(int item) {
	        IntegerNode curr = head;
	        IntegerNode prev = null;

	        if (head == null) {                            // Warn user if linked list is empty
	            System.out.println("Empty Linked List");
	        }
	        else if (head.item == item) {                    // if item is the first integer in the list
	            head = head.next;
	        }
	        else {                                                                //search for the item in the list
	            while (curr != null && curr.item != item) {      //if curr = null is true then item is not in the list
	                prev = curr;                                     //else when the item is found, make it prev
	                curr = curr.next;                            //point to the next node
	            }
	            if (curr == null) {
	                System.out.println("Item not found");
	            }
	            else {
	                prev.next = curr.next;
	            }
	        }
	    }

	    /** This is the main method, and it tests the whole project
		 * @param args NOT USED
		 */
	    public static void main(String[] args) {
	        Implementation test = new Implementation();
	        test.insert(2);      // add numbers 2,3 and 6
	        test.insert(3);
	        test.insert(6);
	        test.display();     //display the linked list 
	        test.insert(5);     //add 5 to the linked list
	        test.display();     //display the linked list 
	        test.delete(3);     //delete 3 from the linked list
	        test.display();     //display the linked list
	        test.delete(2);     //delete 2 from the linked list
	        test.display();     //display the linked list

	    }
	
}

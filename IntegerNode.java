/* Adedayo Adebanjo							`
 * COSC 2336
 * 10/15/2020
 * Purpose: Implementation of Integer node */

package linkedList;

/**
 * @author aaded
 *
 */
public class IntegerNode {
	public int item;
    public IntegerNode next;

    public IntegerNode(int newItem) {
        item = newItem;
        next = null;
    } // end constructor

    public IntegerNode(int newItem, IntegerNode nextNode) {
        item = newItem;
        next = nextNode;
    } // end constructor
} // end class IntegerNode

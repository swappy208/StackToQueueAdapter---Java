/**
 * Package
 */
package howard.edu.ood.adapterhw.collections;
/**
 * 
 * @author swapp_000
 *	interface StackOperations has methods to be implemented
 */
public interface StackOperations {
	// Push an item onto the stack
	public void push(int item);
	// Pop an item off the stack
	public int pop();
	// Return the top item from the stack
	public int peek();
	// Return true if empty, otherwise false
	public boolean isEmpty();
}


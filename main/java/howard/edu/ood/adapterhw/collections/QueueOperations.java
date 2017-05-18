/**
 * Package
 */
package howard.edu.ood.adapterhw.collections;
/**
 * 
 * @author swapp_000
 * interface QueueOperations has methods to be implemented
 */
public interface QueueOperations {
	// Remove an element from the queue
	public int dequeue();
	// Place an element on the queue
	public void enqueue(int  element);
	// Check if the queue is empty
	public boolean isEmpty();
	// Return element at head of queue but don’t remove it.
	public int peek();
}

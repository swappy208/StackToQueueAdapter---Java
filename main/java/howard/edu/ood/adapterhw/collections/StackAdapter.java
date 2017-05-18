/**
 * Package
 */
package howard.edu.ood.adapterhw.collections;

import java.util.NoSuchElementException;
import howard.edu.ood.adapterhw.collections.IntegerStack;
import howard.edu.ood.adapterhw.collections.QueueOperations;

/**
 * 
 * @author swapp_000
 *
 * class StackAdapater implements QueueOperations to make a stack behave like a queue
 */
public class StackAdapter implements QueueOperations {	// adapter implements Queue methods
	
	/**
	 * IntegerStack variable declaration with encapsulation
	 */
	private IntegerStack stack;
	/**
	 * 
	 * @param stack The constructor takes in a stack
	 */
	public StackAdapter(IntegerStack stack) {
		this.stack = stack;
	}
	/**
	 * @param i Integer to be enqueued
	 */
	public void enqueue(int i) {
		stack.push(i);
	}
	/**
	 * Dequeue element
	 */
	public int dequeue() {
		IntegerStack newstack = new IntegerStack();
		int lastelement = stack.peek();
		if (stack.isEmpty())
		{
			throw new NoSuchElementException("Empty Stack Adapter");
		}
		while(!stack.isEmpty())
		{
			lastelement = stack.peek();
			newstack.push(stack.pop());
		}
		newstack.pop();
		while(!newstack.isEmpty())
		{
			stack.push(newstack.pop());
		}
		return lastelement;
	}
	/**
	 * peek element
	 */
	public int peek() {
		if (stack.isEmpty())
		{
			throw new NoSuchElementException("Empty Stack Adapter");
		}
		IntegerStack newstack = new IntegerStack();
		int lastelement = stack.peek();
		while(!stack.isEmpty())
		{
			lastelement = stack.peek();
			newstack.push(stack.pop());
		}
		while(!newstack.isEmpty())
		{
			stack.push(newstack.pop());
		}
		return lastelement;
	}
	/**
	 * print the queue
	 */
	public String toString() {
		IntegerStack newstack = new IntegerStack();
		String result;
		if (!stack.isEmpty())
		{
		int lastelement = stack.peek();
		while(!stack.isEmpty())
		{
			newstack.push(stack.pop());
		}
		int firstelement = newstack.peek();
		result = "front: "+ firstelement + " back: "+lastelement+"\nfront [ ";
		while(!newstack.isEmpty())
		{
			int poppedelement = newstack.pop();
			result+=poppedelement+" ";
			stack.push(poppedelement);
		}
		result+="] back";
		}
		else
		{
			result = "front: no element back: no element\nfront [ ] back";
		}
		return result;
	}
	/**
	 * check if it is empty
	 */
	public boolean isEmpty() {
		return stack.isEmpty();
	}
} 


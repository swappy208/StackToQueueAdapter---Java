/**
 * Package name
 */
package howard.edu.ood.adapterhw.collections;
/**
 * Imports required for this class
 */
import java.util.LinkedList;
import java.util.*;
import howard.edu.ood.adapterhw.collections.QueueOperations;
/**
 * 
 * @author swapp_000
 * IntegerQueue class that implements methods from QueueOperations
 */
public class IntegerQueue implements QueueOperations{
	/**
	 * Private variables for encapsulation
	 * Queue implementation using a linked list
	 */
	private LinkedList<Integer> myqueue = new LinkedList<Integer>();
	private int size;
	/**
	 * Constructor
	 */
	public IntegerQueue()
	{
		size = 0;
	}
	/**
	 * @param element - New element to be inserted into the myqueue
	 * enqueue method allows an element to be inserted into the myqueue
	 */
	@Override
	public void enqueue(int element) {
		// TODO Auto-generated method stub
		myqueue.add(element);
		size++;
	}
	/**
	 * @param No parameters
	 * dequeue method allows an element to be removed from myqueue while returning the value of the removed element
	 	It throws NoSuchElementException if there are no elements to be removed
	 */
	@Override
	public int dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			throw new NoSuchElementException("No elements on the queue");
		}
		else
		{
			size--;
			return myqueue.removeFirst();
		}
	}
	/**
	 * @param No parameters
	 * isEmpty method checks if the IntegerQueue is empty or not and returns a boolean value
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}
	/**
	 * @param No parameters
	 * peek method looks and returns the first element in the myqueue
	 * If the myqueue is empty, it throws an exception
	 */
	@Override
	public int peek() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			throw new NoSuchElementException("No elements in the queue");
		}
		return myqueue.getFirst();
	}
	/**
	 * @param No parameters
	 * toString method is used to print the IntegerQueue
	 * 
	 */
	public String toString()
	{
		String result;
		if(isEmpty())
		{
			result = "front: no element back: no element \nfront [ ";
		}
		else
		{
		result= "front: "+myqueue.getFirst()+ " back: "+myqueue.getLast()+"\nfront [ ";
		}
		for(int i=0; i<size; i++)
		{
			result+=myqueue.get(i)+ " ";
		}
		result += "] back";
		return result;
	}

}

/**
 * Package for IntegerStack
 */
package howard.edu.ood.adapterhw.collections;
/**
 * imported items
 */
import java.util.ArrayList;
import howard.edu.ood.adapterhw.collections.StackOperations;
import java.util.NoSuchElementException;
/**
 * 
 * @author swapp_000
 *	IntegerStack class implements methods from StackOperations
 *
 */
public class IntegerStack implements StackOperations{
	
	/**
	 * data
	 */
	private ArrayList<Integer> mystack = new ArrayList<Integer>();
	private int top;
	/**
	 * constructor
	 */
	public IntegerStack()
	{
		top = -1;
	}
	/**
	 * @param item - The item to be pushed into the stack i.e. mystack
	 * push method allows an item to be added to the topmost i.e. rear of mystack
	 */
	@Override
	public void push(int item) {
		// TODO Auto-generated method stub
		mystack.add(item);
		top++;
	}
	/**
	 * @param No parameters
	 * pop method allows the removal of the topmost item i.e. rear of mystack
	 * It returns an exception if there are no elements in mystack
	 */
	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(mystack.isEmpty())
		{
			throw new NoSuchElementException("No elements on the stack");
		}
		else
		{
			int poppedelement = mystack.get(top);
			mystack.remove(top);
			top--;
			return poppedelement;
		}
	}
	/**
	 * @param No parameters
	 * peek method allows to 
	 */
	@Override
	public int peek() {
		// TODO Auto-generated method stub
		if (isEmpty())
		{
			throw new NoSuchElementException("No elements in the stack");
		}
		return mystack.get(top);
	}
	/**
	 * @param No parameters
	 * isEmpty method checks in mystack is empty
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==-1;
	}
	/**
	 * @param None
	 * toString method returns a string with the values in the stack starting from the top to the bottom
	 */
	public String toString()
	{
		String result = "top [ ";
		for (int i=top; i>=0; i--)
		{
			result+=mystack.get(i)+ " ";
		}
		result+="] bottom";
		return result;
		
	}
}

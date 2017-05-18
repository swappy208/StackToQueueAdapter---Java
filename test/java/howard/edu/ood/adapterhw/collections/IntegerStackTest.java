package howard.edu.ood.adapterhw.collections;

import static org.junit.Assert.*;
import howard.edu.ood.adapterhw.collections.IntegerStack;

import org.junit.Test;

public class IntegerStackTest {

	/**
	 * Test to check pushing into a stack
	 */
	@Test
	public void testPush()
	{
		IntegerStack testing = new IntegerStack();
		/**
		 * test for push and toString
		 */
		testing.push(50);
		testing.push(500);
		testing.push(200);
		String result = testing.toString();
		assertEquals(result, "top [ 200 500 50 ] bottom");
	}
	/**
	 * Test to check popping into a stack
	 */
	@Test
	public void testPop()
	{
		IntegerStack testing = new IntegerStack();
		testing.push(50);
		testing.push(500);
		testing.push(200);
		/**
		 * test for pop
		 */
		int poppedElement = testing.pop();
		assertEquals(poppedElement, 200);
		String result = testing.toString();
		assertEquals(result, "top [ 500 50 ] bottom");
	}
	/**
	 * Test to check if popping an empty stack returns an exception 
	 */
	@Test (expected = Exception.class)
	public void testEmptyPop()
	{
		IntegerStack testing = new IntegerStack();
		testing.pop();
	}
	/**
	 * Test to peek into the stack
	 */
	@Test
	public void testPeek()
	{
		IntegerStack testing = new IntegerStack();
		testing.push(50);
		testing.push(500);
		/**
		 * test for peek
		 */
		int peekedElement = testing.peek();
		assertEquals(peekedElement, 500);
	}
	/**
	 * Test to check if peeking into an empty stack returns exception
	 */
	@Test(expected = Exception.class)
	public void testPeekEmpty()
	{
		IntegerStack testing = new IntegerStack();
		testing.peek();
	}
	/**
	 * Test if a stack is empty
	 */
	@Test
	public void testIsEmpty()
	{
		IntegerStack testing = new IntegerStack();
		testing.push(50);
		testing.push(500);
		/**
		 * test for isEmpty
		 */
		boolean empty = testing.isEmpty();
		assertEquals(empty, false);
		IntegerStack emptyStack = new IntegerStack();
		assertEquals(emptyStack.isEmpty(), true);
	}
	@Test
	public void testtoString()
	{
		IntegerStack testing = new IntegerStack();
		assertEquals(testing.toString(), "top [ ] bottom");
	}

}

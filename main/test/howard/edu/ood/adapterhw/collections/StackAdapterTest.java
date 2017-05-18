package howard.edu.ood.adapterhw.collections;
import static org.junit.Assert.*;
import howard.edu.ood.adapterhw.collections.IntegerStack;
import howard.edu.ood.adapterhw.collections.StackAdapter;

import org.junit.Test;

public class StackAdapterTest {

	/**
	 * Test for Enqueue function
	 */
	@Test
	public void testEnqueue() {
		IntegerStack iS = new IntegerStack();
		StackAdapter testqueue = new StackAdapter(iS);
		testqueue.enqueue(5);
		testqueue.enqueue(6);
		testqueue.enqueue(7);
		String result = testqueue.toString();
		assertEquals(result, "front: 5 back: 7\nfront [ 5 6 7 ] back");
	}
	/**
	 * Test for dequeuing the elements
	 */
	@Test
	public void testDequeue()
	{
		IntegerStack iS = new IntegerStack();
		StackAdapter testqueue = new StackAdapter(iS);
		testqueue.enqueue(5);
		testqueue.enqueue(8);
		int dequeuedelement = testqueue.dequeue();
		assertEquals(dequeuedelement, 5);
	}
	/**
	 * Test for dequeuing an empty queue
	 */
	@Test (expected = Exception.class)
	public void testEmptyDequeue()
	{
		IntegerStack iS = new IntegerStack();
		StackAdapter testqueue = new StackAdapter(iS);
		testqueue.dequeue();
	}
	/**
	 * Test to check if queue is empty
	 */
	@Test
	public void testIsEmpty()
	{
		IntegerStack iS = new IntegerStack();
		StackAdapter testqueue = new StackAdapter(iS);
		boolean emptycheck = testqueue.isEmpty();
		assertEquals(emptycheck, true);
		testqueue.enqueue(5);
		emptycheck = testqueue.isEmpty();
		assertEquals(emptycheck, false);
	}
	/**
	 * Test to peek
	 */
	@Test
	public void testPeek()
	{
		IntegerStack iS = new IntegerStack();
		StackAdapter testqueue = new StackAdapter(iS);
		testqueue.enqueue(5);
		testqueue.enqueue(51);
		testqueue.enqueue(100);
		int peekedElement = testqueue.peek();
		assertEquals(peekedElement, 5);
	}
	/**
	 * Test to check peek for empty IntegerQueue
	 */
	@Test (expected = Exception.class)
	public void testEmptyPeek()
	{
		IntegerStack iS = new IntegerStack();
		StackAdapter testqueue = new StackAdapter(iS);
		testqueue.peek();
	}
	
	/**
	 * Test for toString() function for empty IntegerQueue
	 */
	@Test
	public void testEmptytoString()
	{
		IntegerStack iS = new IntegerStack();
		StackAdapter testqueue = new StackAdapter(iS);
		String result = testqueue.toString();
		assertEquals(result, "front: no element back: no element\nfront [ ] back");
	}
	/**
	 * Test for toString() function
	 */
	@Test
	public void testtoString()
	{
		IntegerStack iS = new IntegerStack();
		StackAdapter testqueue = new StackAdapter(iS);
		testqueue.enqueue(7);
		testqueue.enqueue(3);
		testqueue.enqueue(2);
		String result = testqueue.toString();
		assertEquals(result, "front: 7 back: 2\nfront [ 7 3 2 ] back");
	}


}

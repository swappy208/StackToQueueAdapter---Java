package howard.edu.ood.adapterhw.collections;
import java.util.*;
import howard.edu.ood.adapterhw.collections.IntegerStack;
import howard.edu.ood.adapterhw.collections.QueueOperations;
/**
 * 
 * @author swapp_000
 *	Queue Simulator class uses StackAdapter class to create a queue illusion
 */
public class QueueSimulator{
	/**
	 * 
	 * @param args
	 * The main function
	 */
	public static void main(String args[]) {
		/**
		 * variable declarations
		 */
		IntegerQueue iQ = new IntegerQueue();
		IntegerStack iS = new IntegerStack();
		/**
		 * creating stackAdapter by calling StackAdapter class and using as QueueOperations 
		 */
		QueueOperations stackAdapter = new StackAdapter(iS);
		List<QueueOperations> queueList = new ArrayList<QueueOperations>();
		queueList.add(iQ);
		queueList.add(stackAdapter);
		/**
		 * for loop to loop through the queueList
		 */
		for (QueueOperations q : queueList) {
			q.enqueue(10);
			q.enqueue(200);
			q.enqueue(50);
			q.dequeue();
			System.out.println(q);
		}
	}
}


package DataStructure;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class DataStructure {
	
	public static void main(String[] args) {
//		ARRAY'S
//		Arrays are collection of elements of the same data type, accessd by an index.
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(arr[0]);
		
//		LIST
//		List are ordered collections that can hold elements of different data types.
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add(arr);
		myList.add("Hello");
		System.out.println(myList.get(0));
		System.out.println(myList);
		
//		LINKED LIST
//		Linked list are linear data structures where each element is a separate object linked together.
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(1);
		ll.add("B");
		ll.add(3);
		ll.addFirst(2);
		ll.addLast(10);
		
		System.out.println(ll); 
		  
        ll.remove("B"); 
        ll.remove(3); 
        ll.removeFirst(); 
        ll.removeLast(); 
        
        System.out.println(ll);
        
//        Stack
//        Stack follow the last in first out (LIFO) principle.
        Stack<Object> stack = new Stack<Object>();
        stack.push(1);
        stack.add("new");
        System.out.println(stack.peek());
        stack.add("hello");
        stack.add(1, "stack");
        System.out.println(stack);
        
//        QUEUES
//        Queues follows the first in first out(FIFO) priciple
        Queue<Object> queue = new LinkedList<Object>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue);
        
	}

}

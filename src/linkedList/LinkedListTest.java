package linkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class LinkedListTest {
	MyLinkedList list = new MyLinkedList();

	@Rule public TestName name = new TestName();
	
	@After
	public void afterTest(){
		System.out.println("---------------------------------");
	}
	
	@Before
	public void createLinkedListTest(){
        System.out.println("Starting test: " +name.getMethodName());
		list.add(15);
		list.add(16);
		list.add(10);
	}
	
	@Test
	public void printLinkedListElements(){
		System.out.println("Starting test: " +name.getMethodName());
		list.treverse();
	}
	
	@Test
	public void findElementInLinkedList(){
		System.out.println("Starting test: " +name.getMethodName());
		System.out.println("Does 10 exists in list?" +list.find(10));
		System.out.println("Does 15 exists in list?" +list.find(15));
		System.out.println("Does 16 exists in list?" +list.find(16));
		System.out.println("Does 20 exists in list?" +list.find(20));
	}
	
	@Test
	public void deleteElementFromLinkedList(){
		System.out.println("Starting test: " +name.getMethodName());
		System.out.println("Deleting 16");
		list.delete(16);
		list.treverse();
		System.out.println("Does 16 exists in list?" +list.find(16));
		System.out.println("Deleting 20.. which is not added to the list");
		list.delete(20);
		System.out.println("Does 20 exists in list?" +list.find(20));
		list.treverse();
		System.out.println("Deleting 10.. tail element");
		list.delete(10);
		list.treverse();
		System.out.println("Does 10 exists in list?" +list.find(10));
		System.out.println("Adding 25");
		list.add(25);
		list.treverse();
		System.out.println("Does 25 exists in list?" +list.find(25));
		System.out.println("Deleting 15.. head element");
		list.delete(15);
		list.treverse();
		System.out.println("Does 15 exists in list?" +list.find(15));
		System.out.println("Deleting 25.. head and tail element");
		list.delete(25);
		System.out.println("Does 25 exists in list?" +list.find(25));
		System.out.println("Traversing LinkedList after Delete element Test:");
		list.treverse();
	}	
	
	
	@Test
	public void AddElementToPostionInLinkedList(){
		System.out.println("Starting test: " +name.getMethodName());
		list.addToPosition(9,1);
		list.addToPosition(7,0);
		list.addToPosition(4,4);
		list.addToPosition(3,10);
		System.out.println("Traversing LinkedList after Add Element To Postion Test:");
		list.treverse();
	}

		
	@Test
	public void ReverseLinkedList(){	
		System.out.println("Starting test: " +name.getMethodName());
		System.out.println("Total nodes created: " +Node.count);
		System.out.println("Traversing LinkedList before reversing:");
		list.treverse();
		System.out.println("--------");
		list.reverse();
		System.out.println("Traversing LinkedList after reversing:");
		list.treverse();
	}

}

package linkedList;

public class MyLinkedList {

	// head                                                        Tail
	//  |                                                            |
	// Node (data) -> Node (data) -> Node (data) -> Node (data) -> Node (data) 
	// Add a node
	// Delete a node
	// Find a node
	int size;
	Node head;
	Node tail;
	
	public MyLinkedList(){
		this.size=0;
		this.head=null;
		this.tail=null;
	}
	public void add(int data){
		//scenario 1: Empty linedList
		//scenario 2: Non empty linked list
		
		Node node = new Node(data);
		Node.count++;
		
		if (head == null){
			head = node;
			tail = node;
		}else{
			tail.nextNode = node;
			tail = node;
		}
		size++;
	}
	
	public void addToPosition(int data, int position){
		//Scenario 1: Empty List
		//Scenario 2: Non empty list. Position within range
		//Scenario 3: Non empty list. Position out of range
		//Scenario 4: 
		
		Node tempNode = new Node(data);
		Node.count++;
		Node node = head;
		if(head == null){
			head = tempNode;
			tail = tempNode;
		}else if (position == 0){
			tempNode.nextNode = head;
			head = tempNode;
		}else{				
			for(int i = 0; i < position; i++){
				if(node.nextNode != null){
					node = node.nextNode;
				}else{
					System.out.println("Position is out of linkedList range. So adding to tail..");					
				}
			}
			tempNode.nextNode = node.nextNode;
			node.nextNode = tempNode;
		}
		
	}
	
	
	public void delete(int data){
		//Scenario 1: empty linked list
		//Scenario 2: non empty linked list
		//scenario 3: delete element at tail
		//Scenario 4: delete element at head
		//Scenario 5: delete middle element
		
		
		Node temp = head;		
		

		if(temp.data == data && temp.nextNode == null){				
			head=null;
			tail=null;
			temp= null; 
	    }else{
	    	while(temp.nextNode != null){
				if(temp.data == data && temp == head && temp.nextNode != null){				
						head=temp.nextNode;				
				}else if (temp.nextNode.data == data && temp.nextNode.nextNode == null){
					temp.nextNode = null;
					tail = temp;
				}else if(temp.nextNode.data == data){
					temp.nextNode = temp.nextNode.nextNode;
					temp=temp.nextNode;
				}else{
					temp=temp.nextNode;
				}			
	    	}
		
	    }
	}
	


	public Node find(int data){
		if (head == null)
			return null;
		
		if(head.data == data)
			return head;
		
		Node node = head;
		while (node.nextNode != null){
			node = node.nextNode;
			if (node.data == data)
				return node;
		}
		return null;
	}
	
	void treverse(){
		if (head != null) {
			Node node = head;
			System.out.println(node);
			while (node.nextNode != null){
				node = node.nextNode;
				System.out.println(node.data);
			}
					
		}	
	}
	
	  public void reverse(){
	         
	        System.out.println("\nreversing the linked list\n");
	        Node prev = null;
	        Node current = head;
	        Node next = null;
	        while(current != null){
	            next = current.nextNode;
	            current.nextNode = prev;
	            prev = current;
	            current = next;
	        }
	        head = prev;
	    }
	
	
}

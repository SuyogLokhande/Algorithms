package linkedList;

public class Node {
	
	int data;
	Node nextNode;
	static int  count = 0;
	public Node(int data){
		this.data = data;
		nextNode=null;
	}
	
	public Node() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString(){
		return "" +data;
	}

}

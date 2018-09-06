package LINKEDLIST_NODE;
public class LinkedList {
	private Node head;
	int size;
	
	public LinkedList() {
		this.size = 0;
	}
	
	public void append(int element) {
		if(head == null) {
			head = new Node(element);
			this.size++;
			return;
		}
		
		Node current = head;
		while(current.getNextRef() != null) {
			current = current.getNextRef();
		}
		
		current.setNextRef(new Node(element));
		this.size++;
	}
	
	
	public void preAppend(int element) {
		if(head == null) {
			head = new Node(element);
			this.size++;
			return;
		}
		
		Node newNode = new Node(element);
		
		newNode.setNextRef(head);
		head = newNode;
		
		this.size++;
	}
	
	
	public void insertPosition(int element, int position) {
		if (position < 1 || position > this.size+1) {
			System.out.println("Insert out of bounce");
			return;
		}
		
		if(head == null) {
			head = new Node(element);
			this.size++;
			return;
		}
		
		if(position == 1) {
			this.preAppend(element);
			return;
		}
		
		Node current = head;
		
		int sub = 1;
		while (current.getNextRef() != null && sub < position-1) {
			current = current.getNextRef();
			sub++;
		}
		
		Node newNode = new Node(element);
		newNode.setNextRef(current.getNextRef());
		current.setNextRef(newNode);
		this.size++;
	}
	
	
	public void removeElement(int element) {
		if (head == null) {
			System.out.println("List is empty");
		}
		
		if (head.getData() == element) {
			head = head.getNextRef();
			this.size--;
			return;
		}
		
		Node prev = head;
		Node current = head.getNextRef();
		
		while (current.getNextRef() != null && current.getData() != element) {
			prev = current;
			current = current.getNextRef();
		}
		if (current.getData() == element) {
			prev.setNextRef(current.getNextRef());
			this.size--;
		}
		else { System.out.println("Element is not in a list"); }
	}
	
	
	public void printList() {
			if(head == null) {
				System.out.println("List is Empy!");
				return;
			}
			Node current = head;
			int s =1;
			while (s<=this.size) {
				System.out.println(current);
				current = current.getNextRef();
				s++;
			}
			
	}
	
	
}
package LINKEDLIST_NODE;
public class LinkedListRunner {

	public static void main(String[] args) {
		LinkedList linkedList1 = new LinkedList();
		linkedList1.append(34);
		linkedList1.append(12);
		linkedList1.append(11);
		System.out.println("--- Append ---");
		linkedList1.printList();
		
		System.out.println("\n--- preAppend ---");
		linkedList1.preAppend(55);
		linkedList1.printList();
		
		System.out.println("\n--- insertPosition ---");
		linkedList1.insertPosition(99, 5);
		linkedList1.printList();
		
		System.out.println("\n--- removeElement ---");
		linkedList1.removeElement(34);
		linkedList1.printList();
		
		
	}

}
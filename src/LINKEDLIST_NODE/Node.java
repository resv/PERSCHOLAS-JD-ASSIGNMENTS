package LINKEDLIST_NODE;

public class Node {
	private int data;
	private Node nextRef;

	public Node(int data) {
		this.data = data;
		nextRef = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextRef() {
		return nextRef;
	}

	public void setNextRef(Node ref) {
		this.nextRef = ref;
	}

	public String toString() {
		return "Current node -> " + this.data;
	}

}

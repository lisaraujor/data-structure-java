package node;

public class Node<T> {
	
	// The "T" type is for the list type to be parameterizable
	
	private T element; // Node element
	private Node<T> next; // Point to the next node
	
	public Node(T element) {
		this.element = element;
	}
	public Node(T element, Node<T> next) {
		this.element = element;
		this.next = next;
	}

	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "[element = " + element + ", next = " + next + "]";
	}
}

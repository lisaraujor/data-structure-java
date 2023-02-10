package linkedList;

import node.Node;

public class LinkedList<T> {
	
	private Node<T> first; // Creating the first node
	private Node<T> last; // Creating the last node
	private int size = 0; // List size
	  
	// Function to add a new node in the list
	public void add(T element){
		Node<T> newNode = new Node<T>(element);
		if (this.size == 0) {
			this.first = newNode; // If the list is empty, the first node will receive the new node.
		} else {
			this.last.setNext(newNode); // If the list already has nodes, the POINTER of the last (current) node, which was null, will now point to the new node.
		}
		this.last = newNode; // The last node becomes the new node
		this.size++; // Increasing the list size
	}
	
	public int getSize() { 
		return this.size; // Returns the list size
	}
	
	// Function to remove an element by index
	public int removeByIndex(int idx) {
		
		// When trying to remove an invalid index
		if (idx >= this.size) {
			System.out.println("Invalid index!");
			return 0;
		}
		// Removing the first node
		else if (idx == 0) {
			this.first = this.first.getNext();
		}
		//Removing other nodes
		else {
			Node<T> current = this.first;
			for (int i = 0; i < (idx -1); i++) {
				current = current.getNext();
			}
			Node<T> next = (current.getNext()).getNext();
			current.setNext(next);
		}
		this.size--;
		return 1;
	}

	@Override
	public String toString() {
		
		if (this.size == 0)
			return "[]";
		
		StringBuilder builder = new StringBuilder();
		
		Node<T> current = this.first;
		for (int i = 0; i < this.size - 1; i++) {
			builder.append(current.getElement()).append(", ");
			current = current.getNext();
		}
		builder.append(current.getElement());
	
		return builder.toString();
	}	
}

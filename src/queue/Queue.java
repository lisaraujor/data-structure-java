package queue;

import java.util.ArrayList;

public class Queue<T>
 {
    private ArrayList<T> queue = new ArrayList<T>();
	
	// Add element to the end of queue
	public void push(T e) {
		queue.add(e);
	}
	// Remove element to top of stack
	public void pop() {
		queue.remove(0);
	}
	public boolean isEmpty() {
		return (queue.size() == 0);
	}

	@Override
	public String toString() {
		if (queue.size() == 0){
			return "[]";
		}
		else{
			return "" + queue;
		}
	}
}

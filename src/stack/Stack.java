package stack;

import java.util.ArrayList;

public class Stack<T> {
	
	private ArrayList<T> stack = new ArrayList<T>();
	int top = -1; // Indicates the index of the top element. Starts at -1 to indicate that the list is empty;
	
	// Add element in the stack
	public void push(T e) {
		top++;
		stack.add(top, e);
	}
	public void pop() {
		stack.remove(top);
		top--;
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public int top() {
		return top;
	}

	@Override
	public String toString() {
		if (top == -1){
			return "[]";
		}
		else{
			return "" + stack;
		}
	}
}
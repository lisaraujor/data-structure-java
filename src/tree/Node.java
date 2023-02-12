package tree;

public class Node<T> {
    
    private T element; // Node element
	private Node<T> left; // Point to the left son
    private Node<T> right; // Point to the right son
    
    // When a node is created, it's children are null
    public Node(T element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }

    public T getElement() {
        return element;
    }
    public void setElement(T element) {
        this.element = element;
    }
    public Node<T> getLeft() {
        return left;
    }
    public void setLeft(Node<T> left) {
        this.left = left;
    }
    public Node<T> getRight() {
        return right;
    }
    public void setRight(Node<T> right) {
        this.right = right;
    }
}

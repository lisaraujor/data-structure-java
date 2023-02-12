package tree;

public class BinaryTree<T extends Comparable> { // Need to extend Comparable class to be able to compare nodes
    
    private Node<T> root; // Tree root

    public BinaryTree(){
        this.root = null;
    }

    // Method to insert in the tree
    public void insert(T element){
        Node<T> newNode = new Node<T>(element); // Creating a node with the element that is passed as a parameter
        if (root == null){
            this.root = newNode; // If the root is null, the new node will be the root
        }
        else{
            
            Node<T> current = this.root; // If root isn't null, the 'current' node is created to compare with tree nodes.
           
            while(true){
                if (newNode.getElement().compareTo(current.getElement()) == -1){ // If the new node is smaller then current node
                    if (current.getLeft() != null){ // And the left son of current node is not null
                        current = current.getLeft(); // The current node will be the left son
                    }
                    else { // And the left son of the current node is null
                        current.setLeft(newNode); // The left son of the current node will be the new node
                        break;
                    }
                }
                else { // If the new node is bigger or equal the current node
                    if (current.getRight() != null){ // And the right son of current node is not null
                        current = current.getRight(); // The current node will be the right son
                    }
                    else{ // And the right son of the current node is null
                        current.setRight(newNode); // The right son of the current node will be the new node
                        break;
                    }
                }
            }
        }
    }
}

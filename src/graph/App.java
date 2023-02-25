package graph;

public class App {
    public static void main(String[] args) {
        
        Graph<String> graph = new Graph<String>();

        graph.addVertex("John");
        graph.addVertex("Mike");
        graph.addVertex("Anna");
        graph.addVertex("Bia");

        graph.addEdge(2.0, "John", "Mike");
        graph.addEdge(3.0, "Anna","Bia");
    }
}

package graph;

import java.util.ArrayList;

public class Graph<T> {
    
    private ArrayList<Vertex<T>> vertices; // List of all graph vertices
    private ArrayList<Edge<T>> edges; // List of all graph edges 

    public Graph(){
        this.vertices = new ArrayList<Vertex<T>>();
        this.edges = new ArrayList<Edge<T>>();
    }

    // Adding a vertex in the graph
    public void addVertex(T value){
        Vertex<T> newVertex = new Vertex<T>(value);
        this.vertices.add(newVertex);
    }

    public void addEdge(Double weight, T startValue, T endValue){
        Vertex<T> start = this.getVertex(startValue); // Verifying if the start vertex exists
        Vertex<T> end = this.getVertex(endValue); // Verifying if the end vertex exists
        if(start != null && end != null){ // If both aren't null
            Edge<T> edge = new Edge<>(weight, start, end); 
            start.addEdgeOutput(edge);
            end.addEdgeInput(edge);
            this.edges.add(edge);
        }
    }

    // Getting vertex if it exists
    public Vertex<T> getVertex(T value){
        Vertex<T> vertex = null;
        for(int i = 0; i < this.vertices.size(); i++){
            if (this.vertices.get(i).getValue().equals(value)){
                vertex = this.vertices.get(i);
                break;
            }
        }
        return vertex;
    }
}

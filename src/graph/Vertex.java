package graph;

import java.util.ArrayList;

public class Vertex<T> {
    private T value;
    private ArrayList<Edge<T>> edgeInput;
    private ArrayList<Edge<T>> edgeOutput;

    public Vertex(T value){
        this.value = value;
        this.edgeInput = new ArrayList<Edge<T>>();
        this.edgeOutput = new ArrayList<Edge<T>>();
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void addEdgeInput(Edge<T> edge){
        this.edgeInput.add(edge);
    }

    public void addEdgeOutput(Edge<T> edge){
        this.edgeOutput.add(edge);
    }
}

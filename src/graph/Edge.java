package graph;

public class Edge<T> {
    private Double weight;
    private Vertex<T> start;
    private Vertex<T> end;

    public Edge(Double weight, Vertex<T> start, Vertex<T> end){
        this.weight = weight;
        this.start = start;
        this.end = end;
    }

    public Double getWeight() {
        return weight;
    }
    public Vertex<T> getStart() {
        return start;
    }
    public Vertex<T> getEnd() {
        return end;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public void setStart(Vertex<T> start) {
        this.start = start;
    }
    public void setEnd(Vertex<T> end) {
        this.end = end;
    }
}

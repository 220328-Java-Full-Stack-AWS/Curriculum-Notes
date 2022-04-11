package graph;

import linkedlist.GenericLinkedList;

//We can use Generics to store any type of data inside of our node
//We denote the use of Generics with <Letters>
public class GraphNode<T> {

    //Whatever datatype we pass as T will be stored in data
    private T data;
    private GenericLinkedList<GraphNode<T>> neighbors;

    public GraphNode(T data){
        this.data = data;
        this.neighbors = new GenericLinkedList<>();
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public GenericLinkedList getNeighbors(){
        return neighbors;
    }

    public void setNeighbors(GenericLinkedList neighbors){
        this.neighbors = neighbors;
    }

    public String toString(){
        return "Data: " + this.data + "Neighbors: " + this.neighbors;
    }
}

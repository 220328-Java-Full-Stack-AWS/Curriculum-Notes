package graph;

import linkedlist.GenericLinkedList;

public class GenericGraph<T> {

    private GenericLinkedList<GraphNode<T>> nodes;

    public GenericGraph(){
        nodes = new GenericLinkedList<>();
    }

    public GenericLinkedList getNodes(){
        return nodes;
    }

    public void setNodes(GenericLinkedList nodes){
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return "GenericGraph{" +
                "nodes=" + nodes +
                '}';
    }
}

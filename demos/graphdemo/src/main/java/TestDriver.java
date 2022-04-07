import graph.GenericGraph;
import graph.GraphNode;
import linkedlist.GenericLinkedList;
import linkedlist.LinkedListNode;

public class TestDriver {

    public static void main(String[] args){
        /*
        GenericLinkedList<String> gl = new GenericLinkedList<>();

        gl.insertNode(new LinkedListNode<>("Head"));
        gl.insertNode(new LinkedListNode<>("One"));
        gl.insertNode(new LinkedListNode<>("Two"));
        gl.insertNode(new LinkedListNode<>("Three"));
        gl.insertNode(new LinkedListNode<>("Four"));
        gl.insertNode(new LinkedListNode<>("Five"));

        System.out.println(gl.toString());

        System.out.println(gl.searchNode(4));

        gl.deleteNode(0);

        System.out.println(gl.toString());

        gl.deleteNode(3);

        System.out.println(gl.toString());

        gl.deleteNode(3);

        System.out.println(gl.toString());
         */

        GenericGraph<String> stringGraph = new GenericGraph<>();

        GraphNode<String> n1 = new GraphNode("Node 1");
        GraphNode<String> n2 = new GraphNode("Node 2");
        GraphNode<String> n3 = new GraphNode("Node 3");
        GraphNode<String> n4 = new GraphNode("Node 4");
        GraphNode<String> n5 = new GraphNode("Node 5");

        GenericLinkedList<GraphNode> nodes = new GenericLinkedList<GraphNode>();

        stringGraph.setNodes(nodes);
        System.out.println(stringGraph);

        //To create links between nodes, we simply add the nodes to each others neighbors list
        GenericLinkedList<GraphNode> n1neighbors = new GenericLinkedList<GraphNode>();
        n1neighbors.insertNode(new LinkedListNode<>(n2));
        n1neighbors.insertNode(new LinkedListNode<>(n4));
        //Set the neightbors list
        n1.setNeighbors(n1neighbors);
        System.out.println("N1: " + n1);

        GenericLinkedList<GraphNode> n2neighbors = new GenericLinkedList<GraphNode>();
        n2neighbors.insertNode(new LinkedListNode<>(n1));
        n2neighbors.insertNode(new LinkedListNode<>(n3));
        n2.setNeighbors(n2neighbors);

        System.out.println("N2: " + n2);

        GenericLinkedList<GraphNode> n3neighbors = new GenericLinkedList<GraphNode>();
        n3neighbors.insertNode(new LinkedListNode<>(n2));
        n3neighbors.insertNode(new LinkedListNode<>(n4));
        n3neighbors.insertNode(new LinkedListNode<>(n5));
        n3.setNeighbors(n3neighbors);

        System.out.println("N3: " + n3);

        GenericLinkedList<GraphNode> n4neighbors = new GenericLinkedList<GraphNode>();
        n4neighbors.insertNode(new LinkedListNode<>(n3));
        n4neighbors.insertNode(new LinkedListNode<>(n5));
        n4.setNeighbors(n4neighbors);

        System.out.println("N4: " + n4);

        GenericLinkedList<GraphNode> n5neighbors = new GenericLinkedList<GraphNode>();
        n5neighbors.insertNode(new LinkedListNode<>(n4));
        n5neighbors.insertNode(new LinkedListNode<>(n3));
        n5.setNeighbors(n5neighbors);

        System.out.println("N5: " + n5);

        nodes.insertNode(new LinkedListNode<>(n1));
        nodes.insertNode(new LinkedListNode<>(n2));
        nodes.insertNode(new LinkedListNode<>(n3));
        nodes.insertNode(new LinkedListNode<>(n4));
        nodes.insertNode(new LinkedListNode<>(n5));
        stringGraph.setNodes(nodes);

        System.out.println(stringGraph);
    }

}

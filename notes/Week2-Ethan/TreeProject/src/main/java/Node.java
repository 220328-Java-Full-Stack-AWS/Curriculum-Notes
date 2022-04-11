public class Node {
    //this class is a container for left and right child of current node and key value.
    int value;
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

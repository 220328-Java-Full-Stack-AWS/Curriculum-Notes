
public class BinaryTree {
    Node root;

    //This method is recursive and will add in item to the tree
    //in numerical order.
    public Node addRecursive(Node current, int value) {
        //Adds new value if there is none in the current node
        if (current == null) {
            return new Node(value);
        }
        //looks if value is less than the value of the current node
        //if it is, we return to the top of this method and moves down
        //the tree left
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        }
        //looks if value is less than the value of the current node
        //if it is, we return to the top of this method and moves down
        //the tree left
        else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }
        else {
            // value already exists
            return current;
        }
        return current;
    }
    /*
    public Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }
        //Deletes the item found
        if (value == current.value) {
            // Node to delete found
            // code to delete the node will go here
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.left == null) {
                return current.right;
            }
            if (current.right == null) {
                return current.left;
            }

        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);

        return current;

    }

     */
}

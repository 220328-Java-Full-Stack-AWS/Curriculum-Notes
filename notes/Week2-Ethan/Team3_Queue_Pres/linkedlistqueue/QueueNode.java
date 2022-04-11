package linkedlistqueue;

public class QueueNode {

    public Object data;
    public QueueNode next;

    public QueueNode() {
        this.data = new Object();
        next = null;
    }

    public QueueNode(Object data) {
        this.data = data;
        next = null;
    }

}

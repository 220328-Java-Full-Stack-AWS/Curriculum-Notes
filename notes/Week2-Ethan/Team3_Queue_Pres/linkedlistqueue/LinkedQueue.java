package linkedlistqueue;

import java.util.*;

public class LinkedQueue {

    private QueueNode head;
    private QueueNode tail;

    public LinkedQueue() {
        head = null;
        tail = null;
    }

    // add obj to end of queue and increment tail
    public void enqueue(Object data) {
        QueueNode newNode = new QueueNode(data);
        // if this is the first node, add it as head and tail
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        }
        // else, add it to the linkedlist and make it the new tail
        else {
            this.tail.next = newNode;
            this.tail = newNode;
        }

    }

    // remove the head node and return its data
    public Object dequeue() throws NoSuchElementException {
        Object returnData = null;
        // check if list is empty
        if (this.head != null) {
            // save the data to be returned
            returnData = this.head.data;
            // change head pointer to next node
            this.head = this.head.next;
            return returnData;
        }
        throw new NoSuchElementException();
    }

    // print contents of queue
    public void display() {
        QueueNode nextNode = this.head;
        System.out.print(nextNode.data);
        while (nextNode.next != null) {
            nextNode = nextNode.next;
            System.out.print(", ");
            System.out.print(nextNode.data);
        }
        System.out.print("\n");
    }

    // return next item to be removed (head) without actually removing from queue
    public Object peek() {
        return this.head.data;
    }


    public static void main(String[] args) {
        LinkedQueue test = new LinkedQueue();
        // add 5 to queue
        test.enqueue(5);
        System.out.print("Current Queue: ");
        test.display();
        // add 13 to queue
        test.enqueue(13);
        System.out.print("Current Queue: ");
        test.display();
        // add 25 to queue
        test.enqueue(25);
        System.out.print("Current Queue: ");
        test.display();
        // peek head (5)
        System.out.println("Peek result: " + test.peek());
        System.out.print("Current Queue: ");
        test.display();
        // remove head (5)
        test.dequeue();
        System.out.print("Current Queue: ");
        test.display();
        // remove head (13)
        test.dequeue();
        System.out.print("Current Queue: ");
        test.display();
        // add 75 to queue
        test.enqueue(75);
        System.out.print("Current Queue: ");
        test.display();
        // remove head (25)
        test.dequeue();
        System.out.print("Current Queue: ");
        test.display();
        // add 3 to queue
        test.enqueue(3);
        System.out.print("Current Queue: ");
        test.display();
        // add 19 to queue
        test.enqueue(19);
        System.out.print("Current Queue: ");
        test.display();
    }
    
}
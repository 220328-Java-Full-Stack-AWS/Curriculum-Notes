import model.DeQue;
import model.StackAsDeque;
import model.StackAsLinkedList;

import java.util.Deque;
import java.util.Stack;
import java.util.EmptyStackException;


public class Driver {
    public static void main(String[] args) {

        // Create stack object
        Stack s = new Stack<>();

        if (s.empty()) {
            System.out.println("The stack is empty.");
        }

        // Create and push members onto stack
        for (int i = 0; i < 10; i++) {
            s.push(i);
        }

        if (s.empty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }

        // Look at top member of stack
        System.out.println("Top element is :  " + s.peek());

        // Pop members off of stack
        System.out.println(s.pop() + " Popped from stack");

        // Look at top member of stack
        System.out.println("Top element is :  " + s.peek());

        // Pop remaining members and output
        while (!s.empty()) {
            System.out.println(s.pop() + " Popped from stack");
        }

        // The stack is now empty
        if (s.empty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }

        try {
            // Try to pop another
            System.out.println(s.pop() + " Popped from stack");
        } catch (EmptyStackException ex) {
            System.out.println("EmptyStackException was thrown.");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");


        // Stack as Linked List, implementing using methodology of
        // https://www.geeksforgeeks.org/stack-data-structure-introduction-program/?ref=lbp

        System.out.println("Stack as Linked List");
        System.out.println("");

        StackAsLinkedList sll = new StackAsLinkedList();

        if (sll.isEmpty()) {
            System.out.println("The stack is empty.");
        }

        // Create and push members onto stack
        for (int i = 0; i < 10; i++) {
            sll.push(i);
        }

        if (sll.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }

        // Look at top member of stack
        System.out.println("Top element is :  " + sll.peek());

        // Pop members off of stack
        System.out.println(sll.pop() + " Popped from stack");

        // Look at top member of stack
        System.out.println("Top element is :  " + sll.peek());


        // Pop remaining members and output
        while (!sll.isEmpty()) {
            System.out.println(sll.pop() + " Popped from stack");
        }

        // The stack is now empty
        if (sll.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }

        try {
            // Try to pop another
            System.out.println(sll.pop() + " Popped from stack");
        } catch (EmptyStackException ex) {
            System.out.println("EmptyStackException was thrown.");
        }

        // Stack as DeQue, implementing using methodology of
        // https://www.geeksforgeeks.org/implement-stack-queue-using-deque/

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Stack as Deque");
        System.out.println("");

        // Create stack object
        StackAsDeque sdq = new StackAsDeque();

        if(sdq.size() == 0) System.out.println("The stack is empty.");

        // Create and push members onto stack
        for(int i = 0; i < 10; i++){
            sdq.push(i);
            System.out.println(sdq.size());
        }

        if(sdq.size() == 0) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }

        // Look at stack
        sdq.display();

        // Pop members off of stack
        sdq.pop();
        //System.out.println(sdq.pop() + " Popped from stack");
        System.out.println(sdq.size());

        // Look at stack
        //System.out.println("Top element is :  " + sdq.peek());
        sdq.display();

        // Pop remaining members and output
        while (sdq.size() != 0){
            //System.out.println(sdq.pop() + " Popped from stack");
            sdq.pop();
            System.out.println(sdq.size());
        }

        // The stack is now empty
        if(sdq.size() == 0) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }

        try {
            // Try to pop another
            //System.out.println(s.pop() + " Popped from stack");
            sdq.pop();

        } catch (NullPointerException ex) {
            System.out.println("NullPointerException was thrown.");
        }
    }
}

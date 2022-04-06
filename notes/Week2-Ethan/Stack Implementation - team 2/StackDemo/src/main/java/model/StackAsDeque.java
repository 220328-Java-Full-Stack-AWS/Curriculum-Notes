package model;

public class StackAsDeque {

        DeQue d = new DeQue();

        // push to push element at top of stack
        // using insert at last function of deque
        public void push(int element)
        {
            d.insert_last(element);
        }

        // Returns size
        public int size()
        {
            return d.size();
        }

        // pop to remove element at top of stack
        // using remove at last function of deque
        public void pop()
        {
            d.remove_last();
        }

        // Display
        public void display()
        {
            d.display();
        }
}


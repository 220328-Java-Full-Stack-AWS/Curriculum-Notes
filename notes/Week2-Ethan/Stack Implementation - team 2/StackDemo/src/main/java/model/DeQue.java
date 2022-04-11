package model;

public class DeQue {
    // Pointers to head and tail of deque
    private DQueNode head;
    private DQueNode tail;

    // Constructor
    public DeQue()
    {
        head = tail = null;
    }

    // If list is empty
    public boolean isEmpty()
    {
        if (head == null)
            return true;

        return false;
    }




    // count the number of nodes in list
    int size()
    {

        // If list is not empty
        if (!isEmpty())
        {
            DQueNode temp = head;
            int len = 0;

            while (temp != null)
            {
                len++;
                temp = temp.next;
            }
            return len;
        }
        return 0;
    }

    // Insert at the first position
    void insert_first(int element)
    {

        // Allocating node of DQueNode type
        DQueNode temp = new DQueNode();
        temp.value = element;

        // If the element is first element
        if (head == null)
        {
            head = tail = temp;
            temp.next = temp.prev = null;
        }
        else
        {
            head.prev = temp;
            temp.next = head;
            temp.prev = null;
            head = temp;
        }
    }

    // Insert at last position of deque
    void insert_last(int element)
    {

        // Allocating node of DQueNode type
        DQueNode temp = new DQueNode();
        temp.value = element;

        // If element is the first element
        if (head == null)
        {
            head = tail = temp;
            temp.next = temp.prev = null;
        }
        else
        {
            tail.next = temp;
            temp.next = null;
            temp.prev = tail;
            tail = temp;
        }
    }

    // Remove element at the first position
    void remove_first()
    {

        // If list is not empty
        if (!isEmpty())
        {
            DQueNode temp = head;
            head = head.next;
            head.prev = null;

            return;
        }
        System.out.print("List is Empty");
    }

    // Remove element at the last position
    void remove_last()
    {

        // If list is not empty
        if (!isEmpty())
        {
            DQueNode temp = tail;
            tail = tail.prev;
            tail.next = null;

            return;
        }
        System.out.print("List is Empty");
    }

    // Displays the elements in deque
    void display()
    {

        // If list is not empty
        if (!isEmpty())
        {
            DQueNode temp = head;

            while (temp != null)
            {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }

            return;
        }
        System.out.print("List is Empty");
    }
}


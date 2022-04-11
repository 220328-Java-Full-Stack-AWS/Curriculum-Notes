package linkedlist;

//We want to be able to use this GenericLinkedList with any datatype
public class GenericLinkedList<T> {

    //Is just a list of nodes, that has a pointer to the next node
    private LinkedListNode<T> head;
    private int size;

    public GenericLinkedList(){
        head = null;
    }

    public GenericLinkedList(LinkedListNode<T> head){
        this.head = head;
        this.size = 1;
    }

    public void insertNode(LinkedListNode<T> node){
        //The end of the list is when current node.next = null
        if(head == null){
            head = node;
            size++;
            return;
        }
        LinkedListNode next = head;
        while(next.getNext() != null){
            next = next.getNext();
        }

        next.setNext(node);
        size++;

    }

    public LinkedListNode searchNode(int index){
        LinkedListNode node = head;
        for(int i=0; i<index; i++){
            node = node.getNext();
        }
        return node;
    }

    public LinkedListNode deleteNode(int index){
        LinkedListNode deleted;
        if(index == 0){
            deleted = head;
            head = head.getNext();
            size--;
            return deleted;
        }

        //1. Loop until the node before deletion
        LinkedListNode beforeDeletion = head;

        if(index == size-1){
            for(int i=0; i<index-1; i++){
                beforeDeletion = beforeDeletion.getNext();
            }

            deleted = beforeDeletion.getNext();
            beforeDeletion.setNext(null);
            size--;
            return deleted;
        }

        //Node before deletion
        //Node after deletion

        for(int i=0; i<index-1; i++){
            beforeDeletion = beforeDeletion.getNext();
        }

        System.out.println("Before node " + beforeDeletion);


        //2. Store the node being deleted to be returned
        deleted = beforeDeletion.getNext();

        //3. Set next of the node before deletion to the node of after deletion
        beforeDeletion.setNext(beforeDeletion.getNext().getNext());
        size--;

        return deleted;
    }

    @Override
    public String toString() {
        /*
        StringBuilder sb = new StringBuilder();
        String start = "GenericLinkedList{" +
                "head=" + head;
        if(head != null){


            LinkedListNode node = head.getNext();
            while(node != null){
                sb.append(node.toString() + " ");
                node = node.getNext();
            }
        }

        return start + sb.toString() + "}";

         */
        return "GenericLinkedList{ Size: " + size + "}";

    }

}

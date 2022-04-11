package linkedlist;

//Again we will use generics to act as a stand in
public class LinkedListNode<T> {

    private T data;
    private LinkedListNode<T> next;

    public LinkedListNode (T data){
        this.data = data;
        next = null;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setNext(LinkedListNode<T> node){
        this.next = node;
    }

    public LinkedListNode<T> getNext(){
        return next;
    }

    public String toString(){
        return "Data: " + this.data + " ";
    }

}

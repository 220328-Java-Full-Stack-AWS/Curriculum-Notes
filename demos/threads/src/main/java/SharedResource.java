import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    private Queue<String> queue = new LinkedList<>();
    private int MAX_SIZE = 10;

    public synchronized void produce() throws InterruptedException {
        //We want to never try to produce (and thus lock the resource) if it's full
        if(queue.size() < MAX_SIZE) {
            System.out.println("Adding string to queue...");
            queue.add("produced!");
            notifyAll();
        }
        wait();
    }

    public synchronized void consume() throws InterruptedException {
        if(!queue.isEmpty()) {
            System.out.println("String pulled from queue: " + queue.remove());
            notifyAll();
        }
        wait();
    }

}

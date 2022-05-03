public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedResource = new SharedResource();
        int processLength = 4000;

        //producer
        Thread myRunnable = new Thread(new MyRunnable(sharedResource));

        //consumer
        Thread myThread = new MyThread(sharedResource);

        myRunnable.start();
        myThread.start();

        Thread workerThread = new Thread(() -> {
            System.out.println("Start process...");
            for (int i = 1; i < 10; i++) {
                for(int j = 1; j < processLength; j++) {
                    for (int k = 1; k < processLength; k++) {
                        int x = k * j /i + (1/(i+k));
                    }
                }
                System.out.println("processing...");
            }
            System.out.println("Process complete!");
        });

        workerThread.start();

        //while we wait for the other thread to complete...
        for (int i = 0; i < 10; i++) {
            System.out.println("Something.");
        }


        workerThread.join();
        System.out.println("Thread complete and joined.");



    }
}

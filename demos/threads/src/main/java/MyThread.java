public class MyThread extends Thread{
    private SharedResource sharedResource;

    public MyThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public SharedResource getSharedResource() {
        return sharedResource;
    }

    public void setSharedResource(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        System.out.println("MyThread start.");
        for(int i = 0; i < 100; i++) {
            try {
                sharedResource.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("MyThread complete.");

    }
}

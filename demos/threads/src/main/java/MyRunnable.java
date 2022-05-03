public class MyRunnable implements Runnable{
    private SharedResource sharedResource;

    public MyRunnable(SharedResource sharedResource) {
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
        System.out.println("MyRunnable start.");
        for (int i = 0; i < 100; i++) {
            try {
                sharedResource.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("MyRunnable complete.");
    }
}

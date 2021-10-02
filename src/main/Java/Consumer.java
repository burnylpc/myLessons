import java.util.concurrent.LinkedBlockingDeque;

public class Consumer implements Runnable {

    private LinkedBlockingDeque<String> linkedBlockingDeque;

    public Consumer(LinkedBlockingDeque<String> linkedBlockingDeque) {
        this.linkedBlockingDeque = linkedBlockingDeque;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                System.out.println(linkedBlockingDeque.take());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

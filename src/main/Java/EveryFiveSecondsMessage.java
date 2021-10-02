public class EveryFiveSecondsMessage implements Runnable {

    private volatile Message message;

    public EveryFiveSecondsMessage(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

        try {
            while (!Thread.currentThread().isInterrupted()) {

                //выводит сообщение каждые 5 секунд
                System.out.println("Every 5 seconds message" + message.take());

                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }



}

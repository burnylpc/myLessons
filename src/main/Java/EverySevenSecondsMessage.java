public class EverySevenSecondsMessage implements Runnable {

    @Override
    public void run() {

        try {
            while (!Thread.currentThread().isInterrupted()) {

                //выводит сообщение каждые 5 секунд
                System.out.println("Every 7 seconds message");

                Thread.sleep(7000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        }
    }
}

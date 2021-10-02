import java.util.concurrent.LinkedBlockingDeque;

public class Consumer implements Runnable {

    private LinkedBlockingDeque<String> linkedBlockingDeque;
    private boolean play = true;

    public Consumer(LinkedBlockingDeque<String> linkedBlockingDeque) {
        this.linkedBlockingDeque = linkedBlockingDeque;
    }

    @Override
    public void run() {
        while (play) {
            try {
                String word = linkedBlockingDeque.take();
                if (ConstVal.END_STR.equals(word)) {
                    play = false;
                }else {
                    System.out.println(word);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

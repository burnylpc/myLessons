import java.util.Date;

public class EverySecondDate implements Runnable {

    private Message message;

    public EverySecondDate(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

        try {
            while (!Thread.currentThread().isInterrupted()) {

                Date date = new Date();
                System.out.println(date.toString()); // сам поток выводит дату каждую секунду

                //создадим новое сообщение и запишем значение
                message.put("Massage from EverySecondDate: " + date.toString());

                Thread.sleep(1000); //каждую секунду
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        }

    }
}

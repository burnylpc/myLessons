public class Message {

    private String message;

    public synchronized String take() throws InterruptedException {

        while (this.message == null) {
            this.wait(); //ждем, прежде чем прочитать
        }

        String result = this.message; //сохраняем значение для вывода

        this.message = null; //удаляем старое сообщение
        this.notifyAll(); //оповещаем о прочтении

        return result;

    }

    public synchronized void put(String message) throws InterruptedException {

        while (this.message != null) {
            this.wait(); //ждем прочтения
        }

        this.message = message;
        this.notifyAll(); //оповещение о записи

    }
}

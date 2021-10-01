
public class MainClass {

    public static void main(String[] args) {

        //поток каждую секунду отображает время на экране и воспроизводит сообщение для второго потока
        //использование методов wait(), notifyAll().

        Message message = new Message();

        new Thread(new EverySecondDate(message)).start();
        new Thread(new EveryFiveSecondsMessage(message)).start();


        //?? еще один поток, который выводит на экран другое сообщение
        new Thread(new EverySevenSecondsMessage()).start();



    }
}

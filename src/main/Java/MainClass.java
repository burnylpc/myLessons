import java.util.concurrent.LinkedBlockingDeque;

public class MainClass {

    public static void main(String[] args) {

        //поток каждую секунду отображает время на экране и воспроизводит сообщение для второго потока
        //использование методов wait(), notifyAll().

//        Message message = new Message();
//
//        new Thread(new EverySecondDate(message)).start();
//        new Thread(new EveryFiveSecondsMessage(message)).start();
//
//
//        //?? еще один поток, который выводит на экран другое сообщение
//        new Thread(new EverySevenSecondsMessage()).start();


        //Написать многопотоковый Producer и Consumer,
        //где Producer на одном потоке вгружает в блокирующую очередь (LinkedBlockingQueue) слова "Страдание" из книги Война и Мир том 1,
        //а Consumer на другом потоке их выгружает и считает. В конце корректно остановить приложение.

        LinkedBlockingDeque<String> strings = new LinkedBlockingDeque<>();

        new Thread(new Producer(strings)).start();
        new Thread(new Consumer(strings)).start();







    }
}

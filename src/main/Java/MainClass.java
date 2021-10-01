import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainClass {

    public static void main(String[] args) {
/*
        //поток каждую секунду отображает время на экране и воспроизводит сообщение для второго потока
        //использование методов wait(), notifyAll().

        Message message = new Message();

        new Thread(new EverySecondDate(message)).start();
        new Thread(new EveryFiveSecondsMessage(message)).start();


        //?? еще один поток, который выводит на экран другое сообщение
        new Thread(new EverySevenSecondsMessage()).start();
*/

        //Написать многопотоковый Producer и Consumer,
        //где Producer на одном потоке вгружает в блокирующую очередь (LinkedBlockingQueue) слова "Страдание" из книги Война и Мир том 1,
        //а Consumer на другом потоке их выгружает и считает. В конце корректно остановить приложение.
        Parser parser = new Parser();
        ArrayList list = null;

        File file = new File("voyna.txt");
        try {
            list = parser.parse(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int quantityWithScanner = 0;

        for (int i = 0; i < list.size(); i++) {

            //текущая строка
            String str = (String) list.get(i);
            Scanner scanner = new Scanner(str);
            Pattern pattern = Pattern.compile(".*([Сс]традан).*", Pattern.UNICODE_CASE); //в кодировке Unicode

            if (scanner.findInLine(pattern) != null) {
                quantityWithScanner = quantityWithScanner++;
            }

        }

        System.out.println("Всего слов \"Страдание\" (сканер): " + quantityWithScanner);



    }
}

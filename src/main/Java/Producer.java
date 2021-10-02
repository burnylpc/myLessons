import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Producer implements Runnable {

    private LinkedBlockingDeque<String> linkedBlockingDeque;

    public Producer(LinkedBlockingDeque<String> linkedBlockingDeque) {
        this.linkedBlockingDeque = linkedBlockingDeque;
    }

    @Override
    public void run() {

        Parser parser = new Parser();
        ArrayList list = null;

        File file = new File("voyna.txt");
        try {
            list = parser.parse(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < list.size(); i++) {

            //текущая строка
            String str = (String) list.get(i);

            //разбить строку на массив слов
            String[] subString = str.split("\\s");

            for (int j = 0; j < subString.length; j++) {

                String word = subString[j];
                Pattern pattern = Pattern.compile(".*([Сс]традан).*", Pattern.UNICODE_CASE);
                Matcher matcher = pattern.matcher(word);

                if (matcher.matches()) {
                    try {
                        linkedBlockingDeque.put(word);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        try {
            linkedBlockingDeque.put("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}

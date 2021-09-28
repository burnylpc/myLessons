import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {

    public static void main(String[] args){

//        HashMap<String,TestSubject> hashMap = new HashMap<>();
//
//        String selectString = "";
//
//        for (int i = 0; i < 100; i++) {
//            TestSubject subject = new TestSubject(i);
//            hashMap.put(subject.getId(), subject);
//            if (i == 27) {
//                selectString = subject.getId();
//            }
//        }
//
//        System.out.println(hashMap.get(selectString).getId());
//
//        if (hashMap.get(selectString).getId() == selectString) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//
//        TreeMap<Integer, TestSubject> subjectTreeMap = new TreeMap<>(new TestComparator());
//
//        for (int i = 0; i < 100; i++) {
//            TestSubject subject = new TestSubject(i);
//            subjectTreeMap.put(subject.getOrdinal(), subject);
//        }
//
//        System.out.println(subjectTreeMap.lastEntry());
//
//        //////////////////////////////////////////////////////


        //Домашнее задание:
        //01. Посчитать вхождения на слово "Страдание" (вне зависимости от склонения и регистра) в книге "Война и Мир том 1"

        Parser parser = new Parser();
        ArrayList list = null;

        File file = new File("voyna.txt");
        try {
            list = parser.parse(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        list.forEach(System.out::println);

        ////////////////////////////////////////////////////

        int quantityWithPattern = 0;

        for (int i = 0; i < list.size(); i++) {

            //текущая строка
            String str = (String) list.get(i);

            //разбить строку на массив слов
            String[] subString = str.split("\\s");

            for (int j = 0; j < subString.length; j++) {

                String word = subString[j];
                Pattern pattern = Pattern.compile(".*([Сс]традан)(ие|ия|ию|ии|ием|иях|ий).*", Pattern.UNICODE_CASE); //в кодировке Unicode
                Matcher matcher = pattern.matcher(word);

                if (matcher.matches()) {quantityWithPattern++;} //счетчик
            }
        }

        System.out.println("Всего слов \"Страдание\": " + quantityWithPattern);



        //02. Сделать тоже самое с помощью класса Scanner
        int quantityWithScanner = 0;

        for (int i = 0; i < list.size(); i++) {

            //текущая строка
            String str = (String) list.get(i);

            //разбить строку на массив слов
            String[] subString = str.split("\\s");

            for (int j = 0; j < subString.length; j++) {

                String word = subString[j];

                Scanner scanner = new Scanner(word);
                Pattern pattern = Pattern.compile(".*([Сс]традан)(ие|ия|ию|ии|ием|иях|ий).*", Pattern.UNICODE_CASE); //в кодировке Unicode
                Scanner sc = null;

                while (scanner.hasNextLine()) {
                    sc = new Scanner(scanner.nextLine());
                    while (sc.findInLine(pattern) != null) {
                        quantityWithScanner = quantityWithScanner + sc.match().groupCount();
                    }
                }
            }
        }

        System.out.println("Всего слов \"Страдание\" (сканер): " + quantityWithScanner);

    }

}

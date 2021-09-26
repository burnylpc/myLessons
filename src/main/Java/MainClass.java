import java.util.LinkedList;

public class MainClass {

    public static void main(String[] args){

//        ArrayList<String> strings = new ArrayList<>();
//
//        System.out.println(strings.isEmpty());
//
//        strings.add("one");
//        strings.add("two");
//        strings.add("three");
//        strings.forEach(element -> System.out.println(element));
//
//        System.out.println(strings.size());
//        System.out.println(strings.isEmpty());
//
//        strings.delete(1);
//        strings.forEach(element -> System.out.println(element));
//
//        strings.add("new");
//        strings.add("five");
//        strings.forEach(element -> System.out.println(element));
//
//        strings.update(2, "four");
//        strings.forEach(element -> System.out.println(element));
//
//
//        System.out.println(strings.find("two"));
//        System.out.println(strings.find("five"));

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(10);

        System.out.println(linkedList.toString());
        System.out.println(linkedList.getFirst());

    }
}


public class MainClass {

    public static void main(String[] args){

        ArrayList<String> strings = new ArrayList<>();

        System.out.println(strings.isEmpty());

        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.forEach(element -> System.out.println(element));

        System.out.println(strings.size());
        System.out.println(strings.isEmpty());

        strings.delete(1);
        strings.forEach(element -> System.out.println(element));

        strings.add("new");
        strings.add("five");
        strings.forEach(element -> System.out.println(element));

        strings.update(2, "four");
        strings.forEach(element -> System.out.println(element));


        System.out.println(strings.find("two"));
        System.out.println(strings.find("five"));

        LinkedList<String> linkedList = new LinkedList();

        linkedList.addFirst("01");
        linkedList.addLast("02");
        linkedList.addLast("03");
        linkedList.addLast("04");

        System.out.println(linkedList.size());
        System.out.println(linkedList.isEmpty());

        linkedList.remove("03");
        linkedList.print();

        linkedList.add("03");
        linkedList.print();

        linkedList.delete(2);
        linkedList.print();

        System.out.println(linkedList.find("03"));
        System.out.println(linkedList.find("04"));

        linkedList.update(0, "one");
        linkedList.print();

    }
}

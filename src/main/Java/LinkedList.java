import java.util.Iterator;

public class LinkedList<E> implements List<E> {

    private Node<E> head;

    //Один элемент содержит значение и ссылку на следующий элемент
    private static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
        }
    }

    //Добавление в начало списка
    public void addFirst(E element) {
        Node<E> firstNode = new Node<>(element);
        firstNode.next = head;
        head = firstNode;
    }

    //Добавление в конец списка
    public void addLast(E element) {

        if (head == null) {
            head = new Node<>(element);
            return;
        }

        //Находим последний элемент в списке
        Node<E> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node<>(element);
    }

    public void remove(E element) {

        if (head == null) {
            return;
        }

        if (head.value == element) {
            head = head.next;
        }

        Node<E> currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.value == element) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public void print() {

        if (head == null) {
            System.out.println("пустой");
            return;
        }

        Node<E> currentNode = head;

        if (currentNode.next == null) {
            System.out.println(currentNode.value);
        }

        while (currentNode.next != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
            if (currentNode.next == null) {
                System.out.println(currentNode.value);
            }
        }
    }

    @Override
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    @Override
    public void delete(int index) {

        if (head == null) {
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node<E> currentNode = head;
        int currentIndex = 0;
        while (currentNode.next != null) {
            currentIndex++;
            if (index == currentIndex) {
               currentNode.next = currentNode.next.next;
               return;
           }
           currentNode = currentNode.next;
        }
    }

    @Override
    public int find(E element) {

        if (head == null) {
            return -1;
        }

        if (head.value == element) {
            return 0;
        }

        Node<E> currentNode = head;
        int index = 0;
        while (currentNode.next != null) {
            ++index;
            if (currentNode.next.value == element) {
                return index;
            }
            currentNode = currentNode.next;
        }

        return -1;
    }

    @Override
    public void update(int index, E element) {

        if (head.value == null) {
            return;
        }

        if (index == 0) {
            head.value = element;
        }

        if (index > 0 & index < size()) {

            int currentIndex = 0;
            Node<E> currentNode = head;
            while (currentNode.next != null) {
                if (index == ++currentIndex) {
                    currentNode.next.value = element;
                    return;
                }
                currentNode = currentNode.next;
            }
        }
    }

    @Override
    public boolean isEmpty() {

        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {

        if (head == null) {
            return 0;
        }

        Node<E> currentNode = head;

        if (currentNode.next == null) {
            return 1;
        }

        int index = 1;
        while (currentNode.next != null) {
            ++index;
            currentNode = currentNode.next;
        }
        return index;
    }

    @Override
    public Iterator<E> iterator() {
        E[] values = (E[]) new Object[size()];
        ArrayIterator<E> ArrayIterator = new ArrayIterator<>(values);
        return ArrayIterator;
    }
}

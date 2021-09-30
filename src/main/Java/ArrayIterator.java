import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {

    private int index = 0;
    private E[] values;

    ArrayIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length; //возвращет true, если не выходит за границы массива
    }

    @Override
    public E next() {
        return values[index++]; //возвращает следующее значение по индексу
    }
}

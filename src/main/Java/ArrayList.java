import java.util.Iterator;

public class ArrayList<E> implements List<E> {

    private E[] values;

    public ArrayList() {
        this.values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E element) {

        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = element;
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }

        return true;
    }

    @Override
    public void delete(int index) {

        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            System.arraycopy(temp, index + 1, values, index, temp.length - index - 1);
        } catch (ClassCastException | ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public int find(E element) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == element) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(int index, E element) {
        values[index] = element;
    }

    @Override
    public boolean isEmpty() {
        return values.length == 0;
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public Iterator<E> iterator() {
        ArrayIterator<E> eArrayIterator = new ArrayIterator<>(values);
        return eArrayIterator;
    }
}

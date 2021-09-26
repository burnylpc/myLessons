
public interface List<E> extends Iterable<E> {

    //добавление элемента
    boolean add(E element);

    //удаление по индексу
    void delete(int index);

    //поиск по элементу
    int find(E element);

    //присвоение по индексу
    void update(int index, E element);

    //запрос на пустое значение
    boolean isEmpty();

    //размер массива
    int size();

}

package MyList;

interface ILinkedList<E>{
    public void add (E data);
    public void add(int index,E data);
    public void clear();
    public E get(int index);
    int indexOf(E element);
    boolean  remove(int index);
    E set(int index, E element);
    int size();
    E[] toArray();
    String toString();

}

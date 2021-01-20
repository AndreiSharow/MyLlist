package MyList;

import java.util.Iterator;

public class MyIterator<T> implements Iterator {

   private  Node<T> node;

    public MyIterator(MyLinkedList list){
        this.node=  list.getHead();
    }

    @Override
    public boolean hasNext() {
        return node!=null;
    }

    @Override
    public T next() {
        T data=this.node.data;
        node=node.nextNode;
        return data;
    }
}

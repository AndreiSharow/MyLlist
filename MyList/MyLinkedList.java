package MyList;
import java.util.Iterator;

class MyLinkedList<E> implements ILinkedList,Iterable{
    private Node first;
    private int size=0;


    public Node getHead(){
        return first;
    }

    @Override
    public void add(Object data) {

        Node newNode=new Node(data);
        newNode.nextNode=null;
        if (first == null) {
            first = newNode;
            size++;
        }else {
            Node laste = first;
            while (laste.nextNode != null) {
                laste = laste.nextNode;
            }
            laste.nextNode = newNode;
            size++;
        }
    }

    @Override
    public void add(int index, Object data) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException("POS > SIZE");
        }
        if (index == 0 && size > 0) {
            Node node = new Node(data);
            node.nextNode = first;
            first = node;
            size++;
            return;
        }

        Node cursor = first;
        for (int i = 0; i < index; i++) {
            cursor = cursor.nextNode;
        }

        Node elem = new Node(data);
        elem.nextNode = cursor.nextNode;
        cursor.nextNode = elem;
        size++;
    }

    @Override
    public void clear() {
        if(first==null){
            System.out.println("Is clear");;
        }

        Node next;
        for(Node x = this.first; x != null; x = next) {
            next = x.nextNode;
            x.nextNode = null;
        }
        this.first = null;
        this.size = 0;
    }

    @Override
    public Object get(int index) {

        Node cursor = first;
        for (int i = 0; i < index; i++) {
            cursor = cursor.nextNode;
        }

        return (E) cursor.data;

    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        Node x;
        if (o == null) {
            for(x = this.first; x != null; x = x.nextNode) {
                if (x.data == null) {
                    return index;
                }

                ++index;
            }
        } else {
            for(x = this.first; x != null; x = x.nextNode) {
                if (o.equals(x.data)) {
                    return index;
                }

                ++index;
            }
        }

        return -1;

    }

    @Override
    public boolean  remove(int index) {

        Node cursor=first;
        Node prev=null;
        for ( int i = 0; i < index; i++) {
            prev=cursor;
            cursor = cursor.nextNode;

        }
        if(cursor !=null){
            prev.nextNode = cursor.nextNode;
        }else {
            return false;
        }
        return true;
    }

    @Override
    public Object set(int index, Object element) {

        Node cursor = first;
        for (int i = 0; i < index; i++) {
            cursor = cursor.nextNode;
        }

        Node node=new Node(element);
        node.nextNode=cursor.nextNode;
        first=node;


        return cursor.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E[] toArray() {

        E[] result=(E[])java.lang.reflect.Array.newInstance(first.data.getClass(),size);

        Node node=first;
        for(int i=0; i<size;i++){
            result[i]= (E)node.data;
            node=node.nextNode;
        }
        return  result;
    }


    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public String toString() {

        StringBuilder builder=new StringBuilder();

        builder.append("[ ");
        Node node=first;
        for(int i=0; i<size;i++){
            builder.append("["+node.toString()+" ]");
            node=node.nextNode;
        }
        builder.append(" ]");
        return builder.toString();





    }
}

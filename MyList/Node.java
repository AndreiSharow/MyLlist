package MyList;

class Node<T>{
    Node nextNode;
    T data;


    Node(T ob){
        data=ob;
        nextNode=null;
    }

    @Override
    public String toString() {
        return " "+data.toString();
    }
}
package TestCase6;



import java.util.Scanner;


// doubly linked list, uses header and trailer sentinels.

public class DoubleLinkedList<T> {
    private DoubleNode<T> header, trailer;
    private int size;

    public DoubleLinkedList() {
        size = 0;
        header = new DoubleNode<T>(null, null, null);

        trailer = new DoubleNode<>(null, header, null);
        // header = new DoubleNode<>(null,null,trailer);
        header.setNext(trailer);
    }

    // utility methods

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // give clients access to nodes, but not to the header or trailer

    public DoubleNode<T> getFirst() throws Exception {
        if (isEmpty())
            throw new Exception("Empty");
        return header.getNext();
    }

    public DoubleNode<T> getLast() throws Exception {
        if (isEmpty())
            throw new Exception("Empty");
        return trailer.getPrev();
    }

    public DoubleNode<T> getNext(DoubleNode<T> v) throws Exception {
        DoubleNode<T> temp = v.getNext();
        if (temp == null || temp == trailer)
            throw new Exception("No such node");
        return temp;
    }

    public DoubleNode<T> getPrev(DoubleNode<T> v) throws Exception {
        DoubleNode<T> ans = v.getPrev();
        if (ans == null || ans == header)
            throw new Exception("No such node");
        return ans;
    }

    // methods to change the list

    public DoubleNode addBefore(T d, DoubleNode<T> current) {
        DoubleNode<T> temp = current.getPrev();   // This is the node that was already before the current
        DoubleNode<T> newNode = new DoubleNode<T>(d,temp,current); // Node created with have current previous and
        temp.setNext(newNode);
        current.setPrev(newNode);

        size++;
        return newNode;
    }

    public DoubleNode<T> addAfter(T d, DoubleNode<T> current) {

        DoubleNode<T> x = new DoubleNode<T>(d,current,current.getNext());
        current.setNext(x);
        current.getNext().setPrev(x);

        size++;
        return x;
    }

    public DoubleNode<T> addFirst(T d) throws Exception {
        return  addAfter(d, header);
    }

    public DoubleNode addLast(T d) {
       return addBefore(d, trailer);

    }

    public T remove(DoubleNode<T> v) throws Exception {
        if (v == header || v == trailer)
            throw new Exception("Sentinel");


        v.getNext().setPrev(v.getPrev());
        v.getPrev().setNext(v.getNext());
        size--;
        return v.getData();
    }

    // LinkedList testing methods:

    public String toString() {
        String ans = "";
        DoubleNode<T> n = header;
        ans += "(H)<-->";
        do {
            n = n.getNext();
            if (n == trailer)
                ans += "(T)";
            else
                ans += (n.getData() + "<-->");
        } while (n != trailer);
        return ans;
    }

    public static void main(String args[]) {

    }
}

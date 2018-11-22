package TestCase6;

public class DoubleNode<T> {
    private T data;
    private DoubleNode<T> prev, next;

    public DoubleNode(T d, DoubleNode<T> p, DoubleNode<T> n) {
        data = d;
        next = n;
        prev = p;
    }

    public T getData() {
        return data;
    }

    public DoubleNode<T> getNext() {
        return next;
    }

    public DoubleNode<T> getPrev() {
        return prev;
    }

    public void setData(T d) {
        data = d;
    }

    public void setNext(DoubleNode<T> n) {
        next = n;
    }

    public void setPrev(DoubleNode<T> p) {
        prev = p;
    }
}

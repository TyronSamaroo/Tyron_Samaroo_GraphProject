package TestCase3;

import java.util.Scanner;

public class Vertices<T> {

    private T data;
    private Vertices next;

    public Vertices() {
        data = null;
    }
    public Vertices(T data) {
        this.data = data;

    }
    public Vertices(T data, Vertices next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Vertices getNext() {
        return next;
    }

    public void setNext(Vertices next) {
        this.next = next;
    }

    @Override
    public String toString() {
        String ans = "";
        Vertices current =this;
      while (current!= null) {

          ans += current.getData();

          current = current.getNext();

      }
        return "Vertices: {" + ans + "}";
    }

    public static void main(String[] args) {
        Vertices<Integer> a = new Vertices<>(1);
        Vertices<Integer> b = new Vertices<>(2);
        Vertices<Integer> c = new Vertices<>(3);
        Vertices<Integer> d = new Vertices<>(4);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        Vertices data = new Vertices();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("  Use Command D to Add Nodes)");
            System.out.println("Current is " + data);
            String choice = scan.next();
            int datapoint = scan.nextInt();
            if (choice.charAt(0) == 'D')
                data = new Vertices(datapoint,data);
            if (choice.charAt(0) == 'Q')
                break;

        }

    }
}

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
        // current as its next
        temp.setNext(newNode);
        current.setPrev(newNode);

//        DoubleNode<T> x = new DoubleNode<T>(d, current.getPrev(), current);
//        x.getPrev().setNext(x);
//        x.getNext().setPrev(x);
//                DoubleNode<T> x = new DoubleNode<T>(d, current.getPrev(), current);
//                current.getPrev().setNext(x);
//                current.setPrev(x);
        size++;
        return newNode;
    }

    public DoubleNode<T> addAfter(T d, DoubleNode<T> current) {
//        DoubleNode<T> w = v.getNext();
//        DoubleNode<T> x = new DoubleNode<T>(d, v, w);
//        v.setNext(x);
//        w.setPrev(x);
        // DoubleNode<T> x = new DoubleNode<>(d,current,current.getNext());
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
//        DoubleNode<T> u = v.getPrev();
//        DoubleNode<T> w = v.getNext();
//        w.setPrev(u);
//        u.setNext(w);

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
        DoubleLinkedList<Integer> a = new DoubleLinkedList<>();
        a.addLast(2);
        System.out.println(a);


//        DoubleLinkedList<String> list = new DoubleLinkedList<String>();
//        DoubleNode<String> cursor = null;
//        boolean done = false;
//        Scanner s = new Scanner(System.in);
//        while (!done) {
//            try {
//                System.out.print(list + "  ");
//                if (cursor != null && cursor.getData() != null)
//                    System.out.print(" ^^ " + cursor.getData());
//                System.out.println("\ncmds are H(elp) F L B A R + - Q: >>");
//                String cmd = s.next().trim().toUpperCase();
//                String entry = null;
//                char command = cmd.charAt(0);
//                if (command == 'F' || command == 'L' || command == 'B'
//                        || command == 'A')
//                    entry = s.next();
//                switch (cmd.charAt(0)) {
//                    case 'Q':
//                        done = true;
//                        break;
//                    case 'H':
//                        String help = "H: Help \n" + "F x: Add x at first place\n"
//                                + "L x: Add x at last place\n"
//                                + "B x: Add x before the cursor\n"
//                                + "A x: Add x after the cursor\n"
//                                + "A x: Add x after the cursor\n"
//                                + "+  : Advance the cursor\n"
//                                + "-  : Move the cursor back\n";
//                        System.out.print(help);
//                        break;
//                    case 'R':
//                        DoubleNode<String> e = cursor.getNext();
//                        list.remove(cursor);
//                        cursor = e;
//                        if (cursor == list.trailer)
//                            cursor = cursor.getPrev();
//                        break;
//                    case '+':
//                        cursor = list.getNext(cursor);
//                        break;
//                    case '-':
//                        cursor = list.getPrev(cursor);
//                        break;
//                    case 'F':
//                        list.addFirst(entry);
//                        cursor = list.getFirst();
//                        break;
//                    case 'L':
//                        list.addLast(entry);
//                        cursor = list.getLast();
//                        break;
//                    case 'B':
//                        list.addBefore(entry, cursor);
//                        cursor = list.getPrev(cursor);
//                        break;
//                    case 'A':
//                        list.addAfter(entry, cursor);
//                        cursor = list.getNext(cursor);
//                        break;
//                }
//            } catch (Exception e) {
//                System.out.println("Command failed because: " + e.toString());
//            }
//        }
//        s.close();
    }
}

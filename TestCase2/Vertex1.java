package TestCase2;

import java.util.Iterator;

public class Vertex1<T> {
    /**
     * 3 Instance Variables
     * 1st Stores Data, 2nd stores the current vertex, 3rd stores all connections to current vertext
     */
    private T data;

    private Iterator<Vertex1> nextConnections;


    public Vertex1(){
        data = null;
        nextConnections = null;
    }



    public T getData() {
        return data;
    }


    public Iterator<Vertex1> getNextConnections() {
        return nextConnections;
    }

    public void setData(T data) {
        this.data = data;
    }





    /**
     * Im trying to have a Vertex Node have a connection to all Vertex Nodes
     * @param nextConnections
     */
    /*public void setNextConnections(Vertex<T> nextConnections) {
        this.nextConnections = nextConnections;
    }*/

    @Override
    public String toString() {
        Vertex1 vertex = this;
        String list = "";
        while (vertex != null) {
            list += vertex.getData();
            list += " Connects to ";
         //   vertex = vertex.getNextConnections();
        }
        return " Vertex " + list;

        }

    public static void main(String[] args) {
//        Vertex<Object> data = new Vertex<Object>();
//        Vertex<Object> nextdata = new Vertex<Object>();
//        Scanner scan = new Scanner(System.in);
//        while(true){
//            System.out.println("Set of Vertex ");
//            String choices = scan.next();
//            String points = scan.next();
//            //String next = scan.next();
//            if(choices.charAt(0) == 'V')
//                data = new Vertex<>(points, data, );
//            if(choices.charAt(0) == 'Q')
//                break;
//        }
        Vertex1<String> empty = new Vertex1<>();
      //  Vertex<String> a = new Vertex<String>("A",a,empty);
      //  Vertex<String> b = new Vertex<String>("B",b,a);
      //  System.out.println(b);

    }


    }


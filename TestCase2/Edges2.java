package TestCase2;

import java.util.ArrayList;
import java.util.Iterator;

public class Edges2<T> implements Vertex2 {
    T data;
    Vertex2 current;
    private ArrayList<Vertex2> nextVertex;



    public Edges2(T data,Vertex2 current){
        this.current = current;
        this.data = data;
        nextVertex = new ArrayList<Vertex2>();

    }
    @Override
    public Iterator<Vertex2> nextVertex() {
        return null;
    }

    @Override
    public Vertex2 getCurrent() {
        return current;
    }

    @Override
    public String printData() {
        return null;
    }

    //jjjj
}

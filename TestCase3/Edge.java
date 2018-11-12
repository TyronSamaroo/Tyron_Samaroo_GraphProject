package TestCase3;

public class Edge<T> {

    private  T data;
    private Vertices first;
    private Vertices last;

    public Edge(){
        data = null;
        first = null;
        last = null;
    }
    public Edge(T data){
        this.data = data;
    }
    public Edge(Vertices first, Vertices last){
        this.first=first;
        first.setNext(last);
        this.last = last;
        last.setNext(first);

    }
    public Edge(T data, Vertices first, Vertices last){
        this.data = data;
        this.first = first;
        first.setNext(last);
        this.last = last;
        last.setNext(first);

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Vertices getFirst() {
        return first;
    }

    public Vertices getLast() {
        return last;
    }

    public void setFirst(Vertices first) {
        this.first = first;
    }

    public void setLast(Vertices last) {
        this.last = last;
    }

    @Override
    public String toString() {
        String answer = "Edge";
        Vertices<T> n = first;
        while (n != null){
            answer += n.getData();
            answer += ",";
            n.getNext();
        }

    return  answer;

    }

    public static void main(String[] args) {
        Vertices<Integer> one = new Vertices<>(1);
        Vertices<Integer> two = new Vertices<>(2);
        Edge<Integer> edge = new Edge<>(1,one,two);
        System.out.println(edge.getData());
//        System.out.println(edge.getData());
        System.out.println(edge.getFirst().getData());
        System.out.println(edge.getLast().getData());

    }
}

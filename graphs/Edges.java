package graphs;

//llllll

public class Edges  {
    private Vertices current;
    private Vertices next;


    public Edges(Vertices current, Vertices next) {
        this.current = current;
        this.next = next;
    }

    public Vertices getCurrent() {
        return current;
    }

    public void setCurrent(Vertices current) {
        this.current = current;
    }


    private Vertices getNext(){
        return  next;

    }
    private void setNext(Vertices next){
        this.next = next;
    }
    public void addVertex(int data){
        Vertices n = new Vertices(data,current);
        current = n;


    }

    @Override
    public String toString() {
        Edges current = this;
        String result = "";
        while(current!= null){
            result  += current.getCurrent();
            result += " is Connected to ";
            current.getNext();
        }
        return "Edges: " + result;


    }

    public static void main(String[] args) {
        Vertices one = new Vertices(1);
        Vertices two = new Vertices(2);

        Edges one_two = new Edges(one,two);
        System.out.println(one_two.getCurrent());
        System.out.println(one_two);





    }
}



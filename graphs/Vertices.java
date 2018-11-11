package graphs;


public class Vertices {


    private int data;
    protected Vertices current;

    public Vertices(){
        data = 0;
        current = null;
    }
    public Vertices(int data, Vertices current){
        this.data = data;
        this.current = current;
    }

    public Vertices(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Vertices getCurrent() {
        return current;
    }

    public void setCurrent(Vertices current) {
        this.current = current;
    }

    public void setData(int data) {
        this.data = data;
    }
}

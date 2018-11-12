package TestCase4;



public class Graph {


    LinkedList<Integer> list[];  // Store edges
    Integer Vertex;                  // Store vertex

    public Graph(int vertex){
        this.Vertex = vertex;
        list = new LinkedList[vertex];

//        for (int i = 0; i < vertex; i++) {
//            list[i] = new LinkedList<>();
//        }

        // So depending on what I give to the list it will have
        // all vertex up to current vertex;

    }

    public void addEdge(int first, int last){
        list[first].addHead(last);
        list[last].addTail(first);
    }

    public void printAllEdges(){
        for (int i = 0; i < Vertex; i++) {
            if(list[i].size() > 0){
                System.out.println(i + "connect to");
            }

            for (int j = 0; j <list[i].size() ; j++) {

            }
            System.out.println();
        }
    }




    public static void main(String[] args) {

        Graph graph = new Graph(3);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.printAllEdges();

    }

}

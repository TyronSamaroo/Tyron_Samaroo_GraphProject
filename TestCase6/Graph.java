package TestCase6;




public  class Graph<V,E>  {
    // Two DoubleLinklist to store vertex and edges
 private DoubleLinkedList<Vertex<V>> vertexDoubleLinkedList = new DoubleLinkedList<>();
 private DoubleLinkedList<Edge<E>> edgeDoubleLinkedList = new DoubleLinkedList<>();

 public Graph(){
     vertexDoubleLinkedList = new DoubleLinkedList<>();
     edgeDoubleLinkedList = new DoubleLinkedList<>();
 }

 // Methods for graph will go here
 public int numberVertex(){return  vertexDoubleLinkedList.size(); }
 public int numberEdges(){ return  edgeDoubleLinkedList.size(); }


 // This is how I will add a Vertex to the Graph.
    public void addVertex(V data) throws Exception {

     Vertex<V> vnew = new InnerVertex<>(data);

        vertexDoubleLinkedList.addLast(vnew);

    }


     // I made an InnerVertex class to help access the unique data type V
          class InnerVertex<V> implements Vertex<V>{
         protected V data;
         public DoubleNode<Vertex<V>> vertexDoubleNode;

         public InnerVertex(V data){
             this.data = data;
         }
         public V getVertex(){return  data; }
         public void setVertex(V data){this.data =data;}


         public void setVertexDoubleNode(DoubleNode<Vertex<V>> vertexDoubleNode){
             this.vertexDoubleNode = vertexDoubleNode; }
         public DoubleNode<Vertex<V>> getVertexDoubleNode() {return vertexDoubleNode; }
     }

    // I made an InnerVertex class to help access the unique data type V
      private class InnerEdges<E> implements Edge<E> {
         public E data;
         private DoubleNode<Edge<E>> edgeDoubleNode;
         private Vertex<V>[] endpoints;

         public InnerEdges(Vertex<Vertex> a, Vertex<Vertex> b, E data){
             this.data = data;
             endpoints = (Vertex<V>[]) new Vertex[]{a,b};
         }
         public E getEdge(){return  data;}
         public void setEdge(E data){ this.data = data;}

          public void setEdgeDoubleNode(DoubleLinkedList<Vertex<V>> a){
              this.edgeDoubleNode = edgeDoubleNode; }
          public DoubleNode<Edge<E>> getEdgeDoubleNode() {return edgeDoubleNode; }


     }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Graph<Integer,Integer> somegraph = new Graph<>();
        try {

            somegraph.addVertex(2);
            System.out.println(somegraph.numberVertex());

        }
        catch (Exception e){
            System.out.println("Error");
        }
    }







}

package TestCase6;




public  class Graph<V,E>  {
    // Two DoubleLinklist to store vertex and edges
 private DoubleLinkedList<Vertex<V>> vertexDoubleLinkedList = new DoubleLinkedList<>();
 private DoubleLinkedList<Edge<E>> edgeDoubleLinkedList = new DoubleLinkedList<>();

 public Graph(){
     vertexDoubleLinkedList = null;
     edgeDoubleLinkedList = null;
 }

 // Methods for graph will go here
 public int numberVertex(){return  vertexDoubleLinkedList.size(); }
 public int numberEdges(){ return  edgeDoubleLinkedList.size(); }


 // This is how I will add a Vertex to the Graph.
    public Vertex<V> addVertex(V data){
     InnerVertex<V> vnew = new InnerVertex<>(data);
     vertexDoubleLinkedList.addLast(vnew);
     return  vnew;
    }


     // I made an InnerVertex class to help access the unique data type V
          class InnerVertex<V> implements Vertex<V>{
         protected V data;
         private DoubleNode<Vertex<V>> location;

         public InnerVertex(V data){
             this.data = data;
         }
         public V getVertex(){return  data; }
         public void setVertex(V data){this.data =data;}


         public void setLocation(DoubleNode<Vertex<V>> location){
             this.location = location; }
         public DoubleNode<Vertex<V>> getLocation() {return location; }
     }

    // I made an InnerVertex class to help access the unique data type V
      private class InnerEdges<E> implements Edge<E> {
         public E data;
         private DoubleNode<Edge<E>> location;
         private Vertex<V>[] endpoints;

         public InnerEdges(Vertex<Vertex> a, Vertex<Vertex> b, E data){
             this.data = data;
             endpoints = (Vertex<V>[]) new Vertex[]{a,b};
         }
         public E getEdge(){return  data;}
         public void setEdge(E data){ this.data = data;}

          public void setLocation(DoubleLinkedList<Vertex<V>> a){
              this.location = location; }
          public DoubleNode<Edge<E>> getLocation() {return location; }








     }







}

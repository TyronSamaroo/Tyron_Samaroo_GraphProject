package TestCase6;




public  class Graph<V,E>  {
    // Two DoubleLinklist to store vertex and edges
 private DList<Vertex<V>> vertexDList = new DList<>();
 private DList<Edge<E>> edgeDList = new DList<>();

 public Graph(){
     vertexDList = null;
     edgeDList = null;
 }

 // Methods for graph will go here
 public int numberVertex(){return  vertexDList.size(); }
 public int numberEdges(){ return  edgeDList.size(); }


 // This is how I will add a Vertex to the Graph.
    public Vertex<V> addVertex(V data){
     InnerVertex<V> vnew = new InnerVertex<>(data);
     vertexDList.addLast(vnew);
     return  vnew;
    }



     // I made an InnerVertex class to help access the unique data type V
          class InnerVertex<V> implements Vertex<V>{
         protected V data;
         private DNode<Vertex<V>> location;

         public InnerVertex(V data){
             this.data = data;
         }
         public V getVertex(){return  data; }
         public void setVertex(V data){this.data =data;}


         public void setLocation(DNode<Vertex<V>> location){
             this.location = location; }
         public DNode<Vertex<V>> getLocation() {return location; }
     }

    // I made an InnerVertex class to help access the unique data type V
      private class InnerEdges<E> implements Edge<E> {
         public E data;
         private DNode<Edge<E>> location;
         private Vertex<V>[] endpoints;

         public InnerEdges(Vertex<Vertex> a, Vertex<Vertex> b, E data){
             this.data = data;
             endpoints = (Vertex<V>[]) new Vertex[]{a,b};
         }
         public E getEdge(){return  data;}
         public void setEdge(E data){ this.data = data;}

          public void setLocation(DList<Vertex<V>> a){
              this.location = location; }
          public DNode<Edge<E>> getLocation() {return location; }








     }







}

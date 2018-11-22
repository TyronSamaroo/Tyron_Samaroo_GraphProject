package TestCase5;
import java.io.*;
import java.util.*;
public class AdjListCode {

        private int numVertices;
        private LinkedList<Integer> adjLists[];

        AdjListCode(int vertices)
        {
            numVertices = vertices;
            adjLists = new LinkedList[vertices];

            for (int i = 0; i < vertices; i++)
                adjLists[i] = new LinkedList();
        }

        void addEdge(int src, int dest)
        {
            adjLists[src].add(dest);
        }

        public static void main(String args[])
        {
            AdjListCode g = new AdjListCode(4);

            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 2);
            g.addEdge(2, 3);

        }
    }



import java.util.LinkedList;
public class Weighted_Graph {
        int vertices;                   // integer S => number of streets in the city
        LinkedList<Edge> [] adjacencyTable;

        Weighted_Graph(int vertices){
            this.vertices = vertices;
            this.adjacencyTable = new LinkedList[vertices];

            //initialising the adjacency table for the streets
            for (int i = 0; i < vertices ; i++) {
                this.adjacencyTable[i] = new LinkedList<>();
            }
        }

        public void addEdge(int src, int dst, double w){
            Edge edge = new Edge(src, dst, w);
            adjacencyTable[src].addFirst(edge);
        }

        public void printGraph(){
            for (int i=0; i<vertices; i++){
                LinkedList<Edge> list = adjacencyTable[i];
                for (int j = 0; j <list.size() ; j++) {
                System.out.println("vertex-" + i + " is connected to " +
                        list.get(j).destination + " with weight " +  list.get(j).weight);
                }
            }
        }


}

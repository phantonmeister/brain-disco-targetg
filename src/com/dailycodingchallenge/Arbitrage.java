package dailycodingchallenge;

import java.util.ArrayList;
import java.util.HashMap;

public class Arbitrage {
    // Edge with weight
    public static class Edge{
        public String getVertex() {
            return vertex;
        }

        public void setVertex(String vertex) {
            this.vertex = vertex;
        }

        public float getWeight() {
            return weight;
        }

        public void setWeight(float weight) {
            this.weight = weight;
        }

        public Edge(String label, float weight){
            this.vertex = label;
            this.weight = weight;
        }

        private String vertex;
        private float weight;
    }
    /*
    Graph Class
     */
    public static class Graph {

        public   HashMap<String, ArrayList<Edge>> adjacencyList = new HashMap<>();

        public void  addVertex(String vertex){
            this.adjacencyList.putIfAbsent(vertex, new ArrayList<>());
        }

        public void  addEdge(String source, Edge edge){
            this.adjacencyList.putIfAbsent(source, new ArrayList<>());
            this.adjacencyList.putIfAbsent(edge.getVertex(), new ArrayList<>());
            this.adjacencyList.get(source).add(edge);
        }
        @Override
        public  String toString (){
            StringBuilder gString = new StringBuilder();
            for(String t : this.adjacencyList.keySet()){
                gString.append(t).append("->");
                ArrayList<Edge> neighbors = this.adjacencyList.get(t);
                for(Edge edges : neighbors){
                    gString.append(edges.getVertex()).append(",");
                }
                gString.append("\n");
            }
            return gString.toString();
        }
     }

     public static boolean depthFirstSearch(Graph g, float weight, String vertex, HashMap<String, Integer> visited, String source){
        if(visited.get(vertex) == 1)
            return false;
        if(visited.get(vertex) == 0 && weight >1){
            return true;
        }
        //Mark existing node as being "visiting"
        visited.put(vertex, 0);
        ArrayList<Edge> edges = g.adjacencyList.get(vertex);
        for(Edge edge : edges){
            if(depthFirstSearch(g, weight*edge.getWeight(),edge.getVertex(),visited, source))
                return true;
        }
        visited.put(vertex,1);
        return false;
     }

     public static void main(String... args){
        Graph g = new Graph();
        g.addEdge("A", new Edge("B", 1));
        g.addEdge("A", new Edge("C",5));
        g.addEdge("B", new Edge("A", 0.5F));
        g.addEdge("B", new Edge("C",3));
        g.addEdge("C", new Edge("A",0.2F));
        g.addEdge("C", new Edge("B",.33F));
        System.out.println(g.toString());
         // Integer value of -1 indicates unvisited, 0 indicated visiting and 1 indicates visited.
         HashMap<String, Integer> visited = new HashMap<>();
         for(String vertex : g.adjacencyList.keySet())
             visited.putIfAbsent(vertex,-1);

         System.out.println(depthFirstSearch(g, 1,"A",visited, "A"));

     }
}

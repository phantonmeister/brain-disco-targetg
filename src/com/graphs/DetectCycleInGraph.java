package graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class DetectCycleInGraph {

    public static class  Graph<T> {
        public HashMap<T, ArrayList<T>> adjacencyMap = new HashMap<>();

        public void addVertex(T vertex){
            this.adjacencyMap.putIfAbsent(vertex, new ArrayList<>());
        }

        public void addEdge(T source, T destination){
            addVertex(source);
            addVertex(destination);
            this.adjacencyMap.get(source).add(destination);
        }

        @Override
        public  String toString (){
            StringBuilder gString = new StringBuilder();
            for(T t : this.adjacencyMap.keySet()){
                gString.append(t).append("->");
                ArrayList<T> neighbors = this.adjacencyMap.get(t);
                for(T edges : neighbors){
                    gString.append(edges).append(",");
                }
                gString.append("\n");
            }
            return gString.toString();
        }
    }

    public static boolean detectCycle(Graph<String> g, HashMap<String, Integer> visited, String vertex){
        if(visited.get(vertex) == 0)
            return true;
        visited.put(vertex, 0);
        ArrayList<String> neighbors = g.adjacencyMap.get(vertex);
        for(String s : neighbors){
            if(visited.get(s) == 0)
                return true;
            else if(visited.get(s) != 1 && detectCycle(g, visited, s)){
                return true;
            }
        }
        visited.put(vertex,1);
        return  false;
    }

    public static void main(String... args){
        Graph<String> g = new Graph<>();
        g.addEdge("A", "B");
        g.addEdge("A","C");
        g.addEdge("C","D");
        g.addEdge("D","B");
        g.addEdge("D","F");
        g.addEdge("B","F");
        g.addEdge("B", "C");

        boolean cycleExists = false;
        // Integer value of -1 indicates unvisited, 0 indicated visiting and 1 indicates visited.
        HashMap<String, Integer> visited = new HashMap<>();
        for(String vertex : g.adjacencyMap.keySet())
            visited.putIfAbsent(vertex,-1);

        for(String s : g.adjacencyMap.keySet()){
            if(visited.get(s) == -1){
                cycleExists = detectCycle(g, visited, s);
                if(cycleExists) {
                    System.out.println("Cycle Exists in graph");
                    break;
                }
            }
        }
    }
}

package sorting;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

public class TopologicalSorting {
    public static class Graph{
        HashMap<Integer, ArrayList<Integer>> adjacencyMap = new HashMap<>();

        public  void addVertex(int v){
            adjacencyMap.putIfAbsent(v, new ArrayList<>());
        }

        public void addEdge(int source, int destination){
            addVertex(source);

            addVertex(destination);

            adjacencyMap.get(source).add(destination);
        }

        @Override
        public String toString(){
            StringBuilder builder = new StringBuilder();
            for(int v : adjacencyMap.keySet()){
                builder.append(v).append(": ");
                for (int w : adjacencyMap.get(v)) {
                    builder.append(w).append(",");
                }
                builder.append("\n");
            }
            return (builder.toString());
        }

    }

    public static void topSort(int vertex, LinkedList<Integer> s, Graph  g, boolean[] visited){
        visited[vertex] = true;
        ArrayList<Integer> neighbors = g.adjacencyMap.get(vertex);
        for(int e : neighbors){
            if(!visited[e]){
                topSort(e, s, g, visited);
            }
        }
        s.push(vertex);
    }

    public static void main(String... args){
        Graph g = new Graph();
        g.addEdge(0,1);
        g.addEdge(0,3);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(4,3);
        g.addEdge(4,5);
        g.addEdge(4,6);
        g.addEdge(5,6);
        System.out.println(g);

        LinkedList<Integer> s = new LinkedList<Integer>() ;
        boolean[] visited = new boolean[g.adjacencyMap.keySet().size()];

        for(Integer e : g.adjacencyMap.keySet()){
            if(!visited[e]){
                topSort(e, s, g, visited);
            }
        }
        s.forEach(System.out::println);
    }
}

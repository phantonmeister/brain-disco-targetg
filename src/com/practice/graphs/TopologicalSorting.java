package practice.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TopologicalSorting {

    static class Graph {
        public Map<Integer, ArrayList<Integer>> adjacencyMap = new HashMap<>();

        public void addVertex(int v){
            adjacencyMap.putIfAbsent(v, new ArrayList<>());
        }

        public void addEdge(int source, int destination){

            adjacencyMap.putIfAbsent(source, new ArrayList<>());
            adjacencyMap.putIfAbsent(destination, new ArrayList<>());
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

    static void topologicalSorting(int vertex, boolean[] visited, Stack<Integer> s, Graph g){

        visited[vertex] = true;

        ArrayList<Integer> neighbors = g.adjacencyMap.get(vertex);
        for(int j : neighbors){
            if(!visited[j]){
                topologicalSorting(j,visited,s,g);
            }
        }

        s.push(vertex);
    }
    public static void main (String... args){

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

        Stack<Integer> s = new Stack<>();

        boolean[] visited = new boolean[g.adjacencyMap.keySet().size()];
        for(int i : g.adjacencyMap.keySet()){
            if(!visited[i]){
                topologicalSorting(i, visited, s, g);
            }
        }

        int[] topologicalBuildOrder = new int[g.adjacencyMap.keySet().size()];

       for (int i = topologicalBuildOrder.length-1; i >= 0; i--)
           topologicalBuildOrder[i] = s.pop();

       for(int k : topologicalBuildOrder)
           System.out.println(k);
    }

}

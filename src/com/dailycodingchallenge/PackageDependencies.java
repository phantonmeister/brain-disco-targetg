package dailycodingchallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class PackageDependencies {

private static class Graph{

    public HashMap<String, ArrayList<String>> adjacencyList = new HashMap<>();

    private void addVertex(String s){
        adjacencyList.putIfAbsent(s, new ArrayList<>());
    }

    private void addEdge(String source, String destination){
        addVertex(source);
        addVertex(destination);
        adjacencyList.get(source).add(destination);
    }
}

public static void topologicalOrdering(String node, List<String> visited, Graph g, Stack<String> s){
    visited.add(node);

    List<String> neighbors = g.adjacencyList.get(node);
    for(String l : neighbors){
        if(!visited.contains(l))
        {
            topologicalOrdering(l, visited, g, s);
        }
    }
    s.push(node);
}

    public static void main(String... args){
    Graph g = new Graph();
    g.addEdge("A", "B");
    g.addEdge("A","C");
    g.addEdge("B","E");
    g.addEdge("C","D");
    g.addEdge("D","E");
    g.addEdge("D","F");
    g.addEdge("G","C");

        Stack<String> s = new Stack<>();
        List<String> nodesvisited = new ArrayList<String>();
        topologicalOrdering("A", nodesvisited, g, s);

        Stack<String> dependency = new Stack<>();
        while(!s.isEmpty())
            dependency.push(s.pop());

        while(!dependency.isEmpty()){
            System.out.println(dependency.pop());
        }
    }
}

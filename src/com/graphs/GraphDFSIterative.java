package graphs;

import java.util.*;

public class GraphDFSIterative {

    private Map<Integer, List<Integer>> adjacencyMap = new HashMap<>();

    public void addVertex(int v){
        adjacencyMap.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(int source, int destination){
        adjacencyMap.putIfAbsent(source, new ArrayList<>());
        adjacencyMap.putIfAbsent(destination, new ArrayList<>());
        adjacencyMap.get(source).add(destination);
    }

    public boolean hasEdge(int source, int destination){
        if(adjacencyMap.get(source)!= null)
            return adjacencyMap.get(source).contains(destination);
        return false;
    }

    public void dfs_iterative(int source, boolean[] visited){
        Stack<Integer> s = new Stack<Integer>();
        s.push(source);

        while(!s.isEmpty()){
            int node =s.pop();

            if(!visited[node]){
                visited[node] = true;
                System.out.println(node);
            }

            List<Integer> neighbors = adjacencyMap.get(node);
           for(int j = 0; j < neighbors.size(); j++)
            {
                int neighbor = neighbors.get(j);
                if(!visited[neighbor])
                    s.push(neighbor);
            }
        }
    }

    public void DFS()
    {
        boolean[] visited = new boolean[adjacencyMap.size()];
        for (int i = 0; i < adjacencyMap.size(); i++)
            if (!visited[i])
                dfs_iterative(i, visited);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(int v : adjacencyMap.keySet()){
            builder.append(v).append(": ");
            for (int w : adjacencyMap.get(v)) {
                builder.append(w).append(" ");
            }
            builder.append("\n");
        }
        return (builder.toString());
    }

    public static void main(String... args){
        GraphDFSIterative g = new GraphDFSIterative();
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        // print the graph.
        System.out.println("Graph:\n"+ g);
        g.DFS();
    }

}

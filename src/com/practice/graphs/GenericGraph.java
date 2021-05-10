package practice.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericGraph<T> {

    private Map<T, List<T>> map = new HashMap<T, List<T>>();

    public void addVertex(T s){
        if(s != null){
            map.putIfAbsent(s, new ArrayList<T>());
        }
    }

    public void addEdge(T source, T destination){
        map.putIfAbsent(source, new ArrayList<>());
        map.putIfAbsent(destination, new ArrayList<>());
        map.get(source).add(destination);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(T v : map.keySet()){
            builder.append(v.toString()).append(": ");
            for (T w : map.get(v)) {
                builder.append(w.toString()).append(",");
            }
            builder.append("\n");
        }
        return (builder.toString());
        }

    public static void main(String... args){
        GenericGraph<Integer> g = new GenericGraph<>();
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        // print the graph.
        System.out.println("Graph:\n"+ g);
    }
}

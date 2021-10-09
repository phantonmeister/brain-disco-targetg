package heaps;

import java.util.PriorityQueue;

public class StackFromHeap {

    private class PQNode implements  Comparable<PQNode> {
        private final int key;
        private final int value;

        public PQNode(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(PQNode o) {
            return Integer.compare(o.key,key);
        }
    }

    private final PriorityQueue<PQNode> pq;
    int order = 1;

    public StackFromHeap(int capacity ){
        pq = new PriorityQueue<>(capacity);
    }

    public void push(int value){
        PQNode pnode = new PQNode(order++, value);
        pq.add(pnode);
    }

    public Integer pop(){
        if(pq.isEmpty()){
            System.out.println("Empty Stack");
            return null;
        }
        return pq.poll().value;
    }

    public static void main(String... args) {

        StackFromHeap heapStack = new StackFromHeap(10);
        heapStack.push(5);
        heapStack.push(1);
        heapStack.push(0);
        heapStack.push(30);
        heapStack.push(25);
        System.out.println(heapStack.pop());
        System.out.println(heapStack.pop());
        System.out.println(heapStack.pop());
        heapStack.push(10);
        System.out.println(heapStack.pop());
    }
}
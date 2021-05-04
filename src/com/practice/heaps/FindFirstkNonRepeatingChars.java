package com.practice.heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FindFirstkNonRepeatingChars {
    /*
    Given a string, find first  K non-repeating characters in it by doing only a single traversal of string.
    Ex:- If the string is  ABCDBAGHCHFAC and k = 3, output would be D G F.
     */
    static class IndexCountPair implements Comparable<IndexCountPair>{
        int index, count;

        public IndexCountPair(int index, int count){
            this.count = count;
            this.index = index;
        }
        public IndexCountPair(){
        };

        @Override
        public int compareTo(IndexCountPair o) {
            return Integer.compare(index, o.index);
        }
    }

    public static void findFirstKNonRepeatingCharacters(char[] inout, int k){

        Map<Character, IndexCountPair> map = new HashMap<Character, IndexCountPair>();
        for (int i =0; i < inout.length; i++){
            IndexCountPair pair = map.getOrDefault(inout[i], new IndexCountPair());
            pair.count = pair.count+1;
            pair.index = i;
            map.put(inout[i], pair);
        }

        PriorityQueue<IndexCountPair> pq = new PriorityQueue<IndexCountPair>();
        for (IndexCountPair value : map.values()){
            if(value.count == 1)
                pq.add(value);
        }
        while(k-- > 0 && !pq.isEmpty()){
            System.out.println(inout[pq.poll().index]+" ");
        }
    }
    public static void main(String... args){
        String input = "ABCDBAGHCHFAC";
        findFirstKNonRepeatingCharacters(input.toCharArray(), 3);
    }
}

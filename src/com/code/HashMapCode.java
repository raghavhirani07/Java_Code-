package com.code;

import java.util.LinkedList;

public class HashMapCode {
    public static void main(String[] args) {

    }

    public static class HashMap<K, V> {

        private int n;  /* Total number of Element */
        private int N;    /* Total space in Bucket */
        private LinkedList<Node> buckets[];

        private class Node {
            K key;
            V value;
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<> ();
            }
        }
    }
}

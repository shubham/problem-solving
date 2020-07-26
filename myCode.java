/* package whatever; // don't place package name! */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class myCode {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        LRUCache lruCache = new LRUCache(5);
        while (scanner.hasNext()) {
          List<String> inputList= Arrays.asList(scanner.next().split(" "));
            switch (scanner.next()) {
                case "get":
                    System.out.println( lruCache.get(Integer.parseInt(inputList.get(1))));
                    break;
                case "add":
                    lruCache.put(Integer.parseInt(inputList.get(1)),Integer.parseInt(inputList.get(2)));
                    break;
                case "evict":

                    break;
                case "remove":
                    System.out.println(lruCache.get(Integer.parseInt(inputList.get(1))));
                    break;
                case "exit":
                    return;
            }
        }

    }

    static class LRUCache {

        Node head, tail;
        HashMap<Integer, Node> map;
        int size;

        public LRUCache(int capacity) {
            this.size = capacity;
            map = new HashMap<>();

            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
        }

        public int get(int key) {
            Node node = map.get(key);
            if (node == null) return -1;

            node.deleteNode();
            node.insertNode(head);

            return node.val;
        }

        public void put(int key, int value) {
            Node node = map.get(key);
            if (node != null) {
                node.val = value;
                node.deleteNode();
                node.insertNode(head);

                return;
            }

            if (map.size() == size) {
                node = tail.prev;
                node.deleteNode();
                map.remove(node.key);
            }

            node = new Node(key, value);
            node.insertNode(head);
            map.put(key, node);
        }

        class Node {
            int val;
            Node next, prev;
            int key;

            public Node(int key, int val) {
                this.key = key;
                this.val = val;
            }

            void deleteNode() {
                this.prev.next = this.next;
                this.next.prev = this.prev;
            }

            void insertNode(Node head) {
                this.next = head.next;
                head.next = this;
                this.prev = head;
                this.next.prev = this;
            }
        }
    }
}

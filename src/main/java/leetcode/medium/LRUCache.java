package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class LRUCache {
    class Node{
        Node next;
        Node prev;
        int key;
        int value;
    }

    final Node head = new Node();
    final Node tail = new Node();

    Map<Integer, Node> nodeMap;
    int capacity;

    public LRUCache(int capacity) {
        nodeMap = new HashMap<>(capacity);
        this.capacity = capacity;

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = nodeMap.get(key);
        if(node!=null){
            remove(node);
            add(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        Node node = nodeMap.get(key);
        if(node!=null){
            remove(node);
            //update existing node
            node.value = value;
        }
        else {
            node = new Node();
            node.value = value;
            node.key = key;

            if(nodeMap.size() == capacity){
                //remove last node
                nodeMap.remove(tail.prev.key);
                remove(tail.prev);
            }
            nodeMap.put(key, node);
        }
        add(node);
    }

    private void add(Node node){
        Node head_next = head.next;
        head.next = node;
        node.prev = head;
        node.next = head_next;
        head_next.prev = node;
    }
    private void remove(Node node){
        Node next_node = node.next;
        Node prev_node = node.prev;

        next_node.prev = prev_node;
        prev_node.next = next_node;
    }
}
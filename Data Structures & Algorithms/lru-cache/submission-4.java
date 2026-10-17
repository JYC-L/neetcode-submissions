class Node {
    int key;
    int value;
    Node next;
    Node prev;

    
    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}


class LRUCache {
    public Map<Integer, Node> cache;
    public Node head;
    public Node tail;
    public int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        this.head.next = this.tail;
        this.tail.prev = this.head;
        
    }
    
    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            remove(cache.get(key));
        }
        Node node = new Node(key, value);
        insert(node);
        cache.put(key, node);
        
        if (cache.size() > this.capacity) {
            Node lru = this.tail.prev;
            remove(lru);
            cache.remove(lru.key);
        }

    }


    public void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public void insert(Node node) {
        Node second = this.head.next;
        node.next = second;
        second.prev = node;
        this.head.next = node;
        node.prev = this.head;
    }



}

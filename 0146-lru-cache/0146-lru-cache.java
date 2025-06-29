class LRUCache {
    class Node{
        int key, val;
        Node prev = null;
        Node next = null;
        public Node(int k ,int v){
            this.key = k;
            this.val = v;
        }
    }

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    int capacity;
    Map<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node temp = map.get(key);
        delete(temp);
        insert(temp);
        return temp.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node temp = map.get(key);
            temp.val = value;
            delete(temp);
            insert(temp);
        } else{
            if(map.size() == capacity){
                Node temp = tail.prev;
                delete(temp);
                map.remove(temp.key);
            } 
            Node temp = new Node(key, value);
            map.put(key, temp);
            insert(temp);
        }
    }

    void delete(Node node){
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
    }

    void insert(Node node) {
        Node aage = head.next;
        head.next = node;
        node.prev = head;
        node.next = aage;
        if (aage != null) {
            aage.prev = node;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
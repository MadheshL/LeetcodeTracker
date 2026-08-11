// Last updated: 11/08/2026, 11:39:16
 class MyLinkedList {

    private Node head;
    private Node tail;
    private int size;
public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index >= size){
            return - 1;
        }
        Node curr = head;
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head = node;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        if(tail == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size){
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == size){
            addAtTail(val);
            return;
        }
        Node node = new Node(val); 
        Node curr = head;
        for(int i = 1; i < index; i++){
            curr = curr.next;
        }
        Node temp = curr.next;
        curr.next = node;
        node.next = temp;
        if(node.next == null){
            tail = node;
        }
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index >= size){
            return;
        }
        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        Node curr = head;
        for(int i = 1; i < index; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        if(curr.next == null){
            tail = curr;
        }
        size--;
    }

    class Node {
        private int val;
        private Node next;

        public Node(){
        }
        public Node(int val){
            this.val = val;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
 
    
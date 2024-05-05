package model;

public class LinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void addNode(Node node) {
        if(head == null){
            head = node;
        }else{
            Node nodeElement = head;
            while(nodeElement.next != null){
                nodeElement = nodeElement.next;
            }
            nodeElement.next = node;
        }
    }

    public void printList(){
        Node node = head;
        while(node != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println(" null");
    }

    public int getLength(){
        Node node = head;
        int len = 0;
        while(node != null){
            len++;
            node = node.next;
        }
        return len;
    }

    public Node getTail(){
        Node node = head;
        while(node.next != null){
            node = node.next;
        }
        return node;
    }
}

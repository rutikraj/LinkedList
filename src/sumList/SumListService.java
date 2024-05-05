package sumList;

import model.LinkedList;
import model.Node;

public class SumListService {

    public static Node sum(Node node1, Node node2, int carry){
        if(node1 == null && node2 == null && carry == 0){
            return null;
        }
        int val = carry;
        if(node1 != null)
            val += node1.data;
        if(node2 != null){
            val += node2.data;
        }
        int temp = val % 10;
        Node result = new Node(temp);
        node1 = node1 == null ? null : node1.next;
        node2 = node2 == null ? null : node2.next;
        carry = val >= 10 ? 1 : 0;
        result.next = sum(node1, node2, carry);
        return result;
    }

    public static LinkedList sum(LinkedList list1, LinkedList list2){
        Node head = sum(list1.getHead(), list2.getHead(), 0);
        LinkedList result = new LinkedList();
        result.setHead(head);
        return result;
    }
}

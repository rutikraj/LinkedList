package sumList;

import model.LinkedList;
import model.Node;
import model.sumList.SumCarryNode;

public class ForwardSumListService {

    public static LinkedList forwardSum(LinkedList list1, LinkedList list2){
        int len1 = getLen(list1);
        int len2 = getLen(list2);
        int diff = Math.abs(len1 - len2);
        if(len1 > len2) {
            System.out.println("List 2 :");
            appendZeroes(list2, diff);
            list2.printList();
        } else {
            System.out.println("List 1 :");
            appendZeroes(list1, diff);
            list1.printList();
        }
        SumCarryNode resultNode = forwardSum(list1.getHead(), list2.getHead());
        LinkedList list = new LinkedList();
        list.setHead(resultNode.node);

        return list;
    }

    private static SumCarryNode forwardSum(Node node1, Node node2) {
        if(node1 == null && node2 == null){
            SumCarryNode sumCarryNode = new SumCarryNode();
            return sumCarryNode;
        }
        SumCarryNode nextSumCarryNode = forwardSum(node1.next, node2.next);
        int sum = 0;
        sum += node1 == null ? 0: node1.data;
        sum += node2 == null ? 0: node2.data;
        sum += nextSumCarryNode.carry;
        int data = sum % 10;
        Node node = new Node(data);
        SumCarryNode sumCarryNode = new SumCarryNode();
        sumCarryNode.node = node;
        sumCarryNode.carry = sum >= 10 ? 1:0;
        sumCarryNode.node.next = nextSumCarryNode.node;
        return sumCarryNode;
    }

    private static void appendZeroes(LinkedList list, int diff) {
        Node head = list.getHead();
        for(int i = 0; i < diff; i++){
            Node node = new Node(0);
            node.next = head;
            head = node;
        }
        list.setHead(head);
        System.out.println("Modified list");
    }

    private static int getLen(LinkedList list) {
        Node node = list.getHead();
        int len = 0;
        while(node != null){
            len++;
            node = node.next;
        }
        return len;
    }
}

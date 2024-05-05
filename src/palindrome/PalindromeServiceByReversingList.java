package palindrome;

import model.LinkedList;
import model.Node;

public class PalindromeServiceByReversingList {

    public static boolean isPalindromeByReplication(LinkedList list){
        LinkedList reverseList = getNewReverseList(list);
        Node reverseNode = reverseList.getHead();
        Node node = list.getHead();
        while(reverseNode != null && node != null){
            if(reverseNode.data != node.data)
                return false;
            reverseNode = reverseNode.next;
            node = node.next;
        }
        return (reverseNode == null && node == null);
    }

    private static LinkedList getNewReverseList(LinkedList list) {
        Node node = list.getHead();
        Node reverseHead = null;
        while (node != null){
            Node temp = new Node(node.data);
            temp.next = reverseHead;
            reverseHead = temp;
            node = node.next;
        }
        LinkedList reverseList = new LinkedList();
        reverseList.setHead(reverseHead);
        return reverseList;
    }
}

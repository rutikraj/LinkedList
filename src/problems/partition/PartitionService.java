package problems.partition;

import model.LinkedList;
import model.Node;

public class PartitionService {

    public static LinkedList partition(LinkedList list, int x){
        Node node  = list.getHead();
        Node leftEnd = null;
        Node leftStart = null;
        Node rightStart =  null;
        Node rightEnd = null;

        while(node != null){
            if(node.data < x){
                if(leftStart == null){
                    leftStart = node;
                    leftEnd = leftStart;
                }else{
                    leftEnd.next = node;
                    leftEnd = leftEnd.next;
                }
            }else{
                if(rightStart == null){
                    rightStart = node;
                    rightEnd = rightStart;
                }else{
                    rightEnd.next = node;
                    rightEnd = rightEnd.next;
                }
            }
            node = node.next;
        }
        rightEnd.next = null;
        leftEnd.next = rightStart;
        LinkedList partitionList = new LinkedList();
        partitionList.setHead(leftStart);
        return partitionList;
    }

    public static LinkedList partitionWithTwoTemp(LinkedList list, int x){
        Node head = list.getHead();
        Node tail = list.getHead();
        Node node = list.getHead();

        while(node != null){
            Node next = node.next;
            if(node.data < x){
                node.next = head;
                head = node;
            }else{
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next =  null;
        LinkedList partitionList = new LinkedList();
        partitionList.setHead(head);
        return partitionList;
    }
}

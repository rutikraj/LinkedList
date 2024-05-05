package DetectLoop;

import model.LinkedList;
import model.Node;

public class DetectLoop {

    public static Node getLoopingNode(LinkedList list){
        Node head = list.getHead();
        Node slow = list.getHead();
        Node fast = list.getHead();
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        if(fast != slow)
            return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}

package palindrome;

import model.LinkedList;
import model.Node;

import java.util.Stack;

public class PalindromeServiceByStack {

    public static boolean isPalindromeByReplication(LinkedList list){
        Node slow = list.getHead();
        Node fast = list.getHead();
        Stack<Integer> stack = new Stack<>();
        while(fast != null && fast.next != null){
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        while(slow != null){
            int data = stack.pop();
            if(data != slow.data)
                return false;
            slow = slow.next;
        }
        return true;
    }
}

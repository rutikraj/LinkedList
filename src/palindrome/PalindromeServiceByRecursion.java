package palindrome;

import model.LinkedList;
import model.Node;

public class PalindromeServiceByRecursion {

    public static boolean isPalindromeByReplication(LinkedList list){
        int len = getLen(list);
        Result result = recursion(list.getHead(), len);
        return  result.result;
    }

    private static Result recursion(Node head, int len) {
        if(len == 0 || head == null){
            return new Result(head, true);
        }
        if(len == 1){
            return new Result(head.next, true);
        }
        Result result = recursion(head.next, len-2);
        if(!result.result){
            return result;
        }
        result.result = head.data == result.node.data;
        result.node = result.node.next;
        return result;
    }

    private static int getLen(LinkedList list) {
        Node node = list.getHead();
        int len = 0;
        while (node != null){
            len++;
            node = node.next;
        }
        return len;
    }
}

class Result{
    public Node node;
    public boolean result;

    public Result(Node node, boolean result){
        this.result = result;
        this.node = node;
    }
}

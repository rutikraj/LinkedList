package problems.last.nth;

import model.LinkedList;
import model.Node;

public class NthLastElement {

    public static Node kthLstElement(int k, LinkedList lst){
        int i = 1;
        Node node = lst.getHead();
        while(node != null){
            if(i == k)
                break;
            i++;
            node = node.next;
        }
        Node answer = lst.getHead();
        while(node.next !=  null){
            answer = answer.next;
            node = node.next;
        }
        return answer;
    }

    public static Node kthLstElementRecursive(int k, LinkedList lst){
        Index index =  new Index();
        return findKthLastEle(k, lst.getHead(), index);
    }

    private static Node findKthLastEle(int k, Node node, Index index) {
        if(node == null)
            return node;
        Node ans = findKthLastEle(k, node.next, index);
        index.indx++;
        if(index.indx ==  k)
        {
            return node;
        }
        return ans;
    }
}

class Index{
    public Integer indx = 0;
}

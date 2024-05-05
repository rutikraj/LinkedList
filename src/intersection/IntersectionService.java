package intersection;

import model.LinkedList;
import model.Node;

public class IntersectionService {
    public static Node getInterSectedNode(LinkedList list1, LinkedList list2){
        int len1 = list1.getLength();
        int len2 = list2.getLength();

        if(list1.getTail() != list2.getTail()){
            return null;
        }
        Node shorter = len1 < len2 ? list1.getHead() : list2.getHead();
        Node longer = len1 < len2 ? list2.getHead() : list1.getHead();
        longer = getKthNode(longer, Math.abs(len2 - len1));

        while (shorter != longer){
            shorter = shorter.next;
            longer = longer.next;
        }
        return shorter;

    }

    private static Node getKthNode(Node longer, int num) {
        while(num > 0){
            num--;
            longer = longer.next;
        }
        return longer;

    }

}

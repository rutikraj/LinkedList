import intersection.IntersectionService;
import model.LinkedList;
import model.Node;

import java.util.Scanner;
//2.7
public class IntersectionApp {

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = scanner.nextInt();
        LinkedList list1 = new LinkedList();
        LinkedList list2 = getLinkedList();
        System.out.println("Enter the elements");

        for(int i = 0; i < n; i++){
            int num = scanner.nextInt();
            Node node = new Node(num);
            list1.addNode(node);
            if(i == 2)
                list2.addNode(node);
        }

        System.out.println("List 1 : " );
        list1.printList();
        System.out.println("List 2 : ");
        list2.printList();

        System.out.println("Intersected node: ");
        Node ans = IntersectionService.getInterSectedNode(list1, list2);
        System.out.println(ans.data);
    }

    private static LinkedList getLinkedList() {
        LinkedList lst = new LinkedList();
        for(int i = 1; i < 4; i++){
            Node node = new Node(i);
            lst.addNode(node);
        }
        return lst;
    }
}

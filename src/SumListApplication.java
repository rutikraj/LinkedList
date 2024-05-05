import model.LinkedList;
import model.Node;
import sumList.ForwardSumListService;
import sumList.SumListService;

import java.util.Scanner;
//2.5
public class SumListApplication {

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements of list1");
        int n = scanner.nextInt();
        LinkedList list1 = new LinkedList();
        System.out.println("Enter the list 1");
        for(int i = 0;i < n; i++){
            int temp = scanner.nextInt();
            Node node = new Node(temp);
            list1.addNode(node);
        }

        System.out.println("Enter the number of elements of list1");
        int n2 = scanner.nextInt();
        LinkedList list2 = new LinkedList();
        System.out.println("Enter the list 2");
        for(int i = 0;i < n2; i++){
            int temp = scanner.nextInt();
            Node node = new Node(temp);
            list2.addNode(node);
        }

        System.out.print("List1 is  = ");
        list1.printList();
        System.out.print("List2 is  = ");
        list2.printList();
        System.out.println("List 3 is  = 3");
//        LinkedList list3 = SumListService.sum(list1, list2);
//        System.out.println("List wil reverse order for sum");
//        list3.printList();
        LinkedList list4 = ForwardSumListService.forwardSum(list1, list2);
        System.out.println("List with forward order sum");
        list4.printList();

    }
}

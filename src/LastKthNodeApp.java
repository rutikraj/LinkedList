import model.LinkedList;
import model.Node;
import problems.last.nth.NthLastElement;

import java.util.Scanner;
//2.2
public class LastKthNodeApp {

    public static void main(String []args){
        System.out.println("Enter number of elements");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter elements");
        LinkedList lst = new LinkedList();
        for(int i =0;i < n; i++){
            int data = scanner.nextInt();
            Node node = new Node(data);
            lst.addNode(node);
        }
        System.out.println("Enter Kth last element");
        int k = scanner.nextInt();
        //iterative
        Node answerIterator =NthLastElement.kthLstElement(k, lst);
        //recursive
        Node answeRecursive = NthLastElement.kthLstElementRecursive(k, lst);
        System.out.println("Kth Last node with ierative is : "+ answerIterator.data);
        System.out.println("Kth Last node with recursive  is : " +  answeRecursive.data);
        lst.printList();
    }
}

import DetectLoop.DetectLoop;
import model.LinkedList;
import model.Node;

import java.util.Scanner;

public class DetectLoopApp {

    public static void main(String []args){
        System.out.println("Enter the number of elements");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter the elements");
        LinkedList list = new LinkedList();
        for(int i = 0; i < n; i ++){
            int num = scanner.nextInt();
            list.addNode(new Node(num));
        }
        System.out.println("Enter intersected loop number");
        int interSected = scanner.nextInt();
        interSectNode(list, interSected);
        printLoop(list, n);
        Node node = DetectLoop.getLoopingNode(list);
        if(node == null){
            System.out.println("No loop");
        }else {
            System.out.println("Intersected node: " + node.data);
        }

    }

    private static void printLoop(LinkedList list, int n) {
        Node node = list.getHead();
        for(int i = 0; i<=n; i++){
            if(node == null)
                break;
            System.out.print(node.data+" -> " );
            node = node.next;
        }
        System.out.println();
    }

    private static void interSectNode(LinkedList list, int num) {
        Node tail = list.getTail();
        Node node = list.getHead();
        if(list.getLength() < num || num < 0) {
            System.out.println("Invalid length");
            return;
        }

        for(int i = 0; i < num-1; i++){
             node = node.next;
        }
        tail.next = node;

    }
}

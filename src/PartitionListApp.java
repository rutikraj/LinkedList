import model.LinkedList;
import model.Node;
import problems.partition.PartitionService;

import java.util.Scanner;

//2.4
public class PartitionListApp {
    public static void main(String []args){
        System.out.println("Enter number of elements");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter elements");
        LinkedList list = new LinkedList();
        for(int i = 0 ; i< n; i++){
            int data = scanner.nextInt();
            Node node = new Node(data);
            list.addNode(node);
        }
        System.out.println("Enter partition element");
        int x = scanner.nextInt();
        System.out.println("Original List");
        list.printList();
        System.out.println("Partioned list");
//        LinkedList partitionedList = PartitionService.partition(list, x);
        LinkedList partitionedList = PartitionService.partitionWithTwoTemp(list, x);
        partitionedList.printList();
    }
}

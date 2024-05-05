import model.LinkedList;
import model.Node;
import palindrome.PalindromeServiceByRecursion;
import palindrome.PalindromeServiceByReversingList;
import palindrome.PalindromeServiceByStack;

import java.util.Scanner;


//2.6
public class PalindromeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = scanner.nextInt();
        LinkedList list = new LinkedList();
        System.out.println("Enter the elements");
        for(int i = 0; i < n; i++){
            int data = scanner.nextInt();
            Node node = new Node(data);
            list.addNode(node);
        }
        System.out.println("Elements of list : ");
        list.printList();
//        boolean isPal =  PalindromeServiceByReversingList.isPalindromeByReplication(list);
//        boolean isPal =  PalindromeServiceByStack.isPalindromeByReplication(list);
        boolean isPal =  PalindromeServiceByRecursion.isPalindromeByReplication(list);
        if(isPal){
            System.out.println("List is palindrome");
        }else{
            System.out.println("List is not palindrome");
        }
    }
}

import java.util.*;
class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
    }
}
class LinkedList{
    Node head = null;
    void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next =  newNode;
        }
    }
    //Reversing the linked list
    void reverseItr(){
        if(head == null){
            return;  }
        Node prev = null;
        Node curr = head;
        Node forward = null;
        while(curr!= null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        head = prev;
    }
    //Reversing Using Recursion
    void reveresRec(Node prev,Node curr){
         if(head == null) {
            head = prev;
         }else{
             Node forward = curr.next; //only we need to write Node Because of forword get initilised as null again in recursion thats why
             curr.next = prev;
             prev = curr;
             curr = forward;
         }
         reveresRec(prev,curr);
      }
    void printDLL(){
         if(head == null){
             System.out.print(" Linked list Is Empty ");
         }else {
             Node temp = head;
             while (temp != null) {
                 System.out.print(temp.data+" ");
                 temp = temp.next;
             }
             System.out.println();
         }
     }
}
class client{
    public static void main(String[] args){
        LinkedList dll = new LinkedList();
        char ch;
        do{
            System.out.println("Doubly Linked List");
            System.out.println("1.addNode");
            System.out.println("2.PrintLL");
            System.out.println("3.ReverseItr");
            System.out.println("4.ReverseRec");
            System.out.print("Enter Your Choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice){
                case 1:{
                    System.out.print("EnterData");
                    int data = sc.nextInt();
                    dll.addNode(data);
                }
                break;
                case 2:{
                    dll.printDLL();
                }
                break;
                case 3:{
                    dll.reverseItr();
                }
                break;
                case 4:{
                    Node prev = null;
                    dll.reveresRec(prev, dll.head);
                   } break;
            }
            System.out.print("Do You Want To Continue?");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
        }
    }
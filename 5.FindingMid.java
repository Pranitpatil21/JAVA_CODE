//findinf middle of Linked List Using two methods
//1.Normal Method
//2.Two Pointer Method

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

    void reveresRec(Node prev,Node curr){
         if(head == null) {
            head = prev;
         }else{
             Node forward = curr.next;
             curr.next = prev;
             prev = curr;
             curr = forward;
         }
         reveresRec(prev,curr);
      }
    int countNode(){
       Node temp = head;
       int count=0;
       while(temp.next != null){
        temp = temp.next;
        count++;
       }
       return count;
    }
    //Normal Approch
    void middleNode1(){
     int len = countNode();
     Node temp = head;
     int cnt = 0;
     while(cnt < len/2){
         temp = temp.next;
         cnt++;
     }
        System.out.println(temp.data);
    }
    //Two Pointer Approch
    void middleNode2() {
        if (head == null)
            return;     
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
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
            System.out.println("5.CountNode");
            System.out.println("6.MiddleApproch 1");
            System.out.println("7.MiddleApproch 2");
            System.out.println("Enter Your Choice");
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
                case 5:{
                   int x=  dll.countNode();
                    System.out.println(x);
                }break;
                case 6:{
                    dll.middleNode1();
                }break;
                case 7:{
                    dll.middleNode2();
                }
                break;
                default:
                    System.out.print("Wrong Input");
                    break;
            }
            System.out.println("Do You Want To Continue?");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
        }
    }
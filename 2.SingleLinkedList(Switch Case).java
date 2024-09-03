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
    void addfirst(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node temp =head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    int countNode(){
        Node temp = head;
        int count = 0;

        while(temp != null){

            count++;
            temp = temp.next;
        }
        return count;
    }
    void addAtPos(int pos ,int data) {
        if (pos <= 0 || pos >= countNode() + 2) {

            System.out.println("Wrong Input");
            return;
        }
        if (pos == 1) {
            addfirst(data);
        } else if (pos == countNode() + 1) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            while (pos - 2 != 0) {
                temp = temp.next;
                pos--;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    void delFirst(){
        if(head == null){
            System.out.println("Empty Linked List");
        }
        if(countNode() == 1){
            head = null;
        }else{
            head = head.next;
        }
    }
    void delLast(){
        if(head == null){
            System.out.println("Empty Linked List");
        }
        if(countNode() == 1){
            head = null;
        }else {
              Node temp = head;
              while(temp.next.next != null){
                  temp = temp.next;
              }
              temp.next = null;
        }
    }
    void delAtPos(int pos){
        if (pos <= 0 || pos >= countNode() + 1) {
            System.out.println("Wrong Input");
            return;
        }
        if (pos == 1) {
            delFirst();
        } else if (pos == countNode()) {
            delLast();
        } else {
            Node temp = head;
            while (pos - 2 != 0) {
                temp = temp.next;
                pos--;
            }
            temp.next = temp.next.next;
        }
    }
    void printSLL(){
        if(head == null){
            System.out.println("Empty LinkedList");
        }else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
}
class client{
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        char ch;
        do {
            System.out.println("Singly LinkedList");
            System.out.println("1.addFirst");
            System.out.println("2.addLast");
            System.out.println("3.addAtPos");
            System.out.println("4.delFirst");
            System.out.println("5.delLast");
            System.out.println("6.delAtPos");
            System.out.println("7.countNode");
            System.out.println("8.printSLL");
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch(choice){
                case 1:{
                    System.out.println("Enter Data");
                    int data = sc.nextInt();
                    ll.addfirst(data);
                }
                    break;
                case 2:{
                    System.out.println("Enter Data");
                    int data = sc.nextInt();
                    ll.addLast(data);
                }
                    break;
                case 3:{
                    System.out.println("Enter Data");
                    int data = sc.nextInt();
                    System.out.println("Enter Pos");
                    int pos = sc.nextInt();
                    ll.addAtPos(pos,data);
                }
                    break;
                case 4:
                    ll.delFirst();
                    break;
                case 5:
                    ll.delLast();
                    break;
                case 6: {
                    System.out.println("Enter Pos");
                    int pos = sc.nextInt();
                    ll.delAtPos(pos);
                }
                    break;
                case 7: {
                    int count = ll.countNode();
                    System.out.println(count);
                }
                    break;
                case 8:
                    ll.printSLL();
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }

            System.out.println("Continue?");
            ch = sc.next().charAt(0);
        }while(ch =='Y' || ch == 'y');
    }
}
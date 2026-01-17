import java.util.*;
class Node{
    int data;
    Node next = null;
    Node prev = null; 
    Node(int data){
        this.data = data;
    }
}
class DoublyLinkedList{
     Node head = null;
     void addFirst(int data){
         Node newNode = new Node(data);
         if (head != null) {
             newNode.next = head;
             head.prev = newNode;
         }
         head = newNode;
     }
     void addLast(int data){
         Node newNode = new Node(data);
         if(head == null){
             addFirst(data);
         }else{
             Node temp = head;
             while(temp.next != null){
                 temp = temp.next;
             }
             temp.next = newNode;
             newNode.prev = temp;
         }
     }
      void addAtPos(int pos,int data){
         if(pos <= 0 || pos >= countNode()+2){
             System.out.print("Worng Input");
             return;
         }
         Node newNode = new Node(data);
         Node temp = head;
         if(pos == 1){
             addFirst(data);
         }else if(pos == countNode()+1){
             addLast(data);
         }else{
             while(pos-2 != 0){
                 temp = temp.next;
                 pos--;
             }
             newNode.prev = temp;
             newNode.next = temp.next;
             temp.next = newNode;
             newNode.next.prev = newNode;
         }
      }
     int countNode(){
            int count = 0;
             Node temp = head;
             while(temp != null){
                 count++;
                 temp = temp.next;
             }
         return count;
     }
     void delFirst(){
          if(head == null){
              System.out.print("Empty Linked List");
              return;
          }else if(countNode()==1) {
              head = null;
            }else{
               head = head.next;
               head.prev = null;
            }
     }
     void deleteLast(){
         if(head == null){
             System.out.print("Empty LinkedList");
             return;
         }
         if(countNode()==1){
             delFirst();
         }else {
               Node temp = head;
               while(temp.next.next != null){
                   temp = temp.next;
               }
               temp.next = null;
         }
     }
    void delAtPos(int pos){
            if(pos <= 0 || pos >= countNode()+1){
                System.out.print("Invalid Input");
            }
            if(pos == 1){
                delFirst();
            } else if(pos == countNode()){
                deleteLast();
            }else{
                Node temp = head;
                while(pos-2 != 0){
                    temp = temp.next;
                    pos--;
                }
                temp.next = temp.next.next;//200 = 300
                temp.next.prev = temp; //value updated of temp.next //300 prev = 100
            }
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
        DoublyLinkedList dll = new DoublyLinkedList();
        char ch;
        do{ 
            System.out.print("Doubly Linked List");
            System.out.println("1.addFirst");
            System.out.println("2.addLast");
            System.out.println("3.addAtPos");
            System.out.println("4.delFirst");
            System.out.println("5.delLast");
            System.out.println("6.delAtPos");
            System.out.println("7.CountNode");
            System.out.println("8.PrintDLL");
            System.out.print("Enter Your Choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice){
                case 1:{
                    System.out.print("EnterData");
                    int data = sc.nextInt();
                    dll.addFirst(data);
                }
                break;
                case 2:{
                    System.out.println("Add Last");
                    int data = sc.nextInt();
                    dll.addLast(data);
                }
                break;
                case 3:{
                    System.out.println("Position");
                    int pos = sc.nextInt();
                    System.out.println("Data");
                    int data = sc.nextInt();
                    dll.addAtPos(pos,data);
                }
                break;
                case 4:
                     dll.delFirst();
                     break;
                case 5:
                    dll.deleteLast();
                    break;
                case 6:{
                    System.out.println("pos");
                    int pos = sc.nextInt();
                    dll.delAtPos(pos);
                }
                break;
                case 7:
                    dll.countNode();
                    break;
                case 8:
                    dll.printDLL();
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;
            }
            System.out.print("Do You Want To Continue?");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
    }
}

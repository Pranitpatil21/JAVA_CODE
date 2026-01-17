//Singly Linked List
class Node{ 
    int data;
    Node next = null;
    Node(int data){
        this.data = data; //This class is divided in two type data and next
    }
}
class LinkedList{
    Node head = null;
    void addfirst(int data) {
        Node newNode = new Node(data);  //helps to creates new node //it is on stack contain next node address   //object is on  heap -> node
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head; //head will have adress of previous node linking the prev node to new node
            head = newNode;  // head pointing to new node
        }
    }
    void addLast(int data){
        Node newNode = new Node(data); //Creating new Node and adding it to last
        if(head == null){
            head = newNode;
        }else{
            Node temp =head;
            while(temp.next != null){ //when temp get null value means it reached at last then we can add new Node there
                temp = temp.next;
            }
            temp.next = newNode;    //adding new Node at last
        }
    }
    int countNode(){
        Node temp = head; //giving temp node heads address
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
            head = head.next; //Means first Node will get deleted automatically and collected by garbage collector
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
            Node temp = head;                     // We used variable and given it head value to print because if we used -
            while(temp != null){                  // - head then our previous nodes will get deleted as we move foreword
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
}
class client{
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.addLast(15);
        ll.addAtPos(5,25);
        ll.printSLL();
        ll.delFirst();
        ll.printSLL();
        System.out.println();
        ll.delLast();
        ll.printSLL();
        System.out.println();
        ll.delAtPos(2);
        ll.printSLL();
    }
}


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}


class Main {
    static Node head = null;
    static void  insertAtFront(int data){
        if(head == null) {
            head = new Node(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    static int getLength(Node head){
        if(head == null){
            return 0;
        }
        Node t = head;
        int c=0;
        while (t!= null){
            t=t.next;
            c++;
        }
        return c;
    }
    static void insertAtMiddle(int data){
        if(head == null)
        {
            head = new Node(data);
            return;
        }

        int n = getLength(head);
        if (n%2!=0) {
            n = n/2 + 1;
        } else {
            n = n/2;
        }
        Node t=head,t1;
        while (--n>0){
            t=t.next;
        }

        t1 = t.next;
        Node newNode = new Node(data);
        t.next = newNode;
        newNode.next = t1;
    }
    static void display() {
        if (head == null){
            System.out.println("NULL");
            return;
        }

        Node t = head;
        while (t!= null){
            System.out.print(t.data + " ");
            t=t.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        display();
        insertAtFront(5);        
        insertAtFront(4);        
        insertAtFront(3);        
        insertAtFront(2);        
        insertAtFront(1);        
        display();
        insertAtMiddle(7);
        display();
    }
}

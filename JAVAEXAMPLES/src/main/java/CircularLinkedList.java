

public class CircularLinkedList {

    Node head;
    Node tail;

    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void addnode(int d)
    {
        Node n = new Node(d);
        if(head == null)
        {
            head = n;
            tail = n;
            tail.next = head;
        }
        else
        {
            tail.next = n;
            tail = n;
            tail.next = head;
            System.out.print("tail.data" + tail.data);
        }
    }

    public void printCList()
    {
        Node t = head;
       if(t ==null)
       {
           System.out.println("List is empty");
       }
       if(t.next ==head)
       {
           System.out.print("Only one element is present" +t.data );
       }
       do
       {
           System.out.print(" " +t.data );
           t = t.next;
       }while(t != head);
    }
    public static void main(String args[])
    {
        CircularLinkedList c = new CircularLinkedList();
        c.addnode(5);
        c.addnode(6);
        c.addnode(7);
        c.printCList();








    }


}

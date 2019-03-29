class LinkedList1
{
    Node h;  // head of list

    //C c;
    /* Linked list Node.  This inner class is made static so that
       main() can access it */
    static class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next=null; } // Constructor
    }

    public void addNode(Node addnew)
    {
        Node n = h;
        if ( n== null)
        {
            System.out.println("List is null");
            h = addnew;
        }
        /*else{
            System.out.println("in else"+h.data+" "+h.next.data+" "+n.next);
        }*/
        while (n!=null)
        {
            System.out.println("List is not null");
            if(n.next ==null)
            {
                System.out.println("List is n.next ==null");
                n.next = addnew;
                break;

            }
           n=n.next;
        }

    }

    public void addNodeAtPosition(Node addnew, String S , int val)
    {
        Node n = h;
        if ( n== null)
        {
            System.out.println("List is null");
            h = addnew;
        }
        while (n!=null)
        {
            System.out.println("List is not null");
            if(S.equals("before") && n.next.data == val  ) //n.data ==2
            {
                Node temp1 = n.next;
                n.next = addnew;
                addnew.next = temp1;
                System.out.println("value added after next");
                //n.next = addnew;
                break;
            }
            else if(S.equals("after") && n.data == val  )
            {
                Node temp1=n.next;
                //if(n.next !=null)
                  //  temp1 = n.next;
                //else
                   // temp1 = null;
                n.next = addnew;
                addnew.next = temp1;
                System.out.println("value added after next");
                //n.next = addnew;
                break;
            }
            if(S.equals("last") && n.next ==null)
            {
                System.out.println("List is n.next ==null");
                n.next = addnew;
                break;

            }

            n=n.next;
        }

    }

    /* This function prints contents of linked list starting from head */
    public void printList()
    {
        Node n = h;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }

    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList1 llist = new LinkedList1();

        llist.h          = new Node(1);
        Node second      = new Node(2);
        Node third      = new Node(5);
        Node fourth       = new Node(3);

        llist.h.next = second; // Link first node with the second node
        second.next = third; // Link first node with the second node
        third.next = fourth;
        //Result 1 2 5 7 3 8 10
        Node temp = new Node(7);
        Node temp1 = new Node(8);
        Node temp2 = new Node(10);

        //llist.addNode(temp);
        llist.addNodeAtPosition(temp,"before",3);
        llist.addNodeAtPosition(temp1,"after",3);
        llist.addNodeAtPosition(temp2,"last",-1);
        llist.printList();
    }




}
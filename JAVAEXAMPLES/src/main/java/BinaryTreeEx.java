public class BinaryTreeEx {
    Node root;

    class Node {
        Node left, right;
        int value;

        Node(int item) {
            value = item;
            left = right = null;
        }
    }

    void insert(int val) {
        root = addNewNode(root, val);
    }


    Node addNewNode(Node root, int val) {

        if (root == null){

            root = new Node(val);
            return root;
            // System.out.println(root.value);
        }

        if (root.value > val)
        {  root.left = addNewNode(root.left, val);
           // System.out.println(root.value);
            //System.out.println(root.left.value);
        }
       else if (root.value < val)
        { root.right = addNewNode(root.right, val);
           // System.out.println(root.right.value);
        }

            return root;
        }


    void inorderRec(Node root) {

        if (root != null) {
            //System.out.println("in inorderRec");
            inorderRec(root.left);
            System.out.println(root.value);
            inorderRec(root.right);
        }
    }
    public static void main (String args[])
        {
            BinaryTreeEx e = new BinaryTreeEx();
            e.insert(5);
           e.insert( 10);
            e.insert( 2);
           e.insert(1);
           e.inorderRec(e.root);


        }

    }

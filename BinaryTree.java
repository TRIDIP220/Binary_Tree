public class BinaryTree {

    static class Node{

        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right=null;
        }
    }

    static class Binarytree{

        static int idx = -1;

         Node build(int nodes[])
         {
            idx++;

            if(nodes[idx]==-1)
            {

                return null;
            }

            Node newnode = new Node(nodes[idx]);

            newnode.left = build(nodes);
            newnode.right = build(nodes);

            return newnode;
        }

    }

    public static void inorder(Node root)
    {

        if(root == null)
        {

            return;
        }

        preorder(root.left);
        System.out.println(root.data +" ");
    
        preorder(root.right);

    }


    public static void postorder(Node root)
    {

        if(root == null)
        {

            return;
        }

        preorder(root.left);
        preorder(root.right);
        System.out.println(root.data +" ");

    }



    public static void preorder(Node root)
    {

        if(root == null)
        {

            return;
        }

        System.out.println(root.data +" ");
        preorder(root.left);
        preorder(root.right);

    }


    public static void main(String[] args)
    {
        
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Binarytree tree = new Binarytree();

        Node root = tree.build(nodes);

        System.out.println(root.data);
        
        BinaryTree.preorder(root);


    }
    
}

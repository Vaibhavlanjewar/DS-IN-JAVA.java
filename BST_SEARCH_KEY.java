import java.util.*;

public class BST_SEARCH_KEY {
    static class Node{
        int data; //data
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;

        }
    }
    public static Node insert (Node root,int val){
        if(root==null){
            root=new Node(val);
            return root ;
        }
        if(root.data>val){
            // left subtree
            root.left=insert(root.left,val);

        }
        else{
            root.right=insert(root.right,val);
        }
        return root;

    }
    public static void inorder(Node root){
        //inorder -- LVR--left subtree,root ,right subtree
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+"");
        inorder(root.right);
    }

    // Search BST if key is given
    public static boolean search(Node root,int key ){
        if(root==null){
            return false ;
        }
        if(root.data>key){  //key<root.data i.e left subtree
            return search(root.left,key );

        }

         else if (root.data==key ){
             return true;
        }
        else{
            return search(root.right,key );
        }

    }

    public static void main(String []args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        int i;
        Node root = null;

        System.out.println("Inorder --");

        try {
            for (i = 0; i <= values.length; i++)

                root = insert(root, values[i]);

        } catch (Exception e) {
            System.out.println("\nException caught");

        }

        inorder(root);
        System.out.println();
        if (search(root, 1)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}

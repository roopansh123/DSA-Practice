public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right =null;
        }
    }

    public static Node BuildTree(Node root, int x){
        if (root == null) {
            root = new Node(x);
            return root;
        }
        if (x> root.data) {
            root.right= BuildTree(root.right, x);
        }else{
            root.left = BuildTree(root.left, x);
        }
        return root;
    }


    public static void inorder(Node root){
        if (root == null ) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean Search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        
        if (root.data>key) {
            return Search(root.left, key);
        }else{
            return Search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int arr[]= {5,1,3,2,4,7};

        Node root= null;
        for(int i =0; i<arr.length; i++){
            root = BuildTree(root, arr[i]);
        }

        inorder(root);
        
        System.out.println(Search(root, 9));

    }

}

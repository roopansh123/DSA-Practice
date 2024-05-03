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

    public static Node inorderSuccessor(Node root){
        while (root.left !=null) {
            root =root.left;
        }
        return root;
    }
    public static Node delete(Node root,int val){
        if (root == null) {
            return null;
        }
        if(root.data > val){
            root.left =delete(root.left, val);
        }
        if (root.data< val) {
            root.right = delete(root.right, val);
        }
        else{
            if (root.right == null && root.left==null) {
                return null;
            }
            if (root.right==null) {
                return root.left;
            }
            else if (root.left==null) {
                return root.right;
            }
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right=delete(root.right, IS.data);

        }
        return root;
    }
    public static void main(String[] args) {
        int arr[]= {8,5,3,1,4,6,10,11,14};

        Node root= null;
        for(int i =0; i<arr.length; i++){
            root = BuildTree(root, arr[i]);
        }

        inorder(root);
        System.out.println();
        // System.out.println(Search(root, 9));
        delete(root, 3);
        System.out.println();
        inorder(root);


    }

}

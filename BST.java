import java.util.ArrayList;

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
    public static void inorder(Node root){
        if (root == null ) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node inorderSuccessor(Node root){
        while (root.left !=null) {
            root =root.left;
        }
        return root;
    }

    public static Node delete(Node root,int val){
        
        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if (root.data < val) {
            root.right = delete(root.right, val);
        }
        else{
            if (root.right == null && root.left==null) {
                return null;
            }
            else if (root.left==null) {
                return root.right;
            }
            else if (root.right==null) {
                return root.left;
            }
            
            else{
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right=delete(root.right, IS.data);
            }
        }
        return root;
    }

    public static void printinRange(Node root, int k1, int k2){
        if (root== null) {
            return ;
        }
        if(root.data >= k1 && root.data <= k2 ){
            printinRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printinRange(root.right, k1, k2);
        }
        else if (k1>root.data) {
            printinRange(root.left, k1, k2); 
        }
        else{
            printinRange(root.right, k1, k2);
        }

    }
    public static void printpath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"-->");
        }
        System.out.println("null");
    }
    public static void root2leaf(Node root, ArrayList<Integer>path){
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left== null && root .right == null) {
            printpath(path);
        }
        root2leaf(root.left, path);
        root2leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static boolean validBst(Node root , Node min, Node max){
        if (root == null) {
            return true;
        }
        if (max!=null&& root.data>max.data) {
            return false;
        }
        if (min!=null && root.data<min.data) {
            return false;
        }

        return validBst(root.left, min, root) && validBst(root.right, root, max);
    }


    public static void main(String[] args) {
        int arr[]= {8,5,3,1,4,6,10,11,14};
        

        Node root= null;
        for(int i =0; i<arr.length; i++){
            root = BuildTree(root, arr[i]);
        }

        // inorder(root);
        // System.out.println();
        // delete(root, 1);
        // System.out.println();
        // inorder(root);

        // printinRange(root, 5, 12);
        // root2leaf(root, new ArrayList<>());
        System.out.println(validBst(root, null, null));
    }

}

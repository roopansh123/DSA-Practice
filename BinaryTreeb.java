import java.util.*;


public class BinaryTreeb {

    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right =null;
        }
    }

    static class BinaryTree{
        static int idx =-1;
        public Node BuildTree(int []nodes){
            idx++;
            if (nodes[idx]==-1) {
                return null;
            }
            
            
            Node n = new Node(nodes[idx]);
            n.left = BuildTree(nodes);
            n.right =BuildTree(nodes);
            return n;
        }
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
   
   
    public static void postorder(Node root){
        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        
    }

    public static void levelOrder(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode =q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data);
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }

            }
        }

    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh)+1;
    }

    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int lc = count(root.left);
        int rc = count(root.right);

        return lc+rc+1;
    }


    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int ls = sum(root.left);
        int rs = sum(root.right);

        return ls+rs+root.data;
    }

    public static int Diameter(Node root){
        if(root == null){
            return 0;
        }
        int ldiam= Diameter(root.left);
        int lheight = height(root.left);
        int rdiam = Diameter(root.right);
        int rheight = height(root.right);

        int currdiam = lheight + rheight+1;

        return Math.max(currdiam, Math.max(rdiam, ldiam));


    }
    public static boolean  isIdentical(Node root, Node subRoot){
        
        if (root == null && subRoot == null) {
            return true ;
        }
        else if ( root == null || subRoot  == null || root.data != subRoot.data){
            return false;
        }
        
        if (!isIdentical(root.left, subRoot.left)) {
            return false;
        }

        if (!isIdentical(root.right, subRoot.right)) {
            return false;
        }
        
        return true;
    }

    public static boolean isSubtree(Node root , Node subroot){

        if (root == null) {
            return false;
        }

        if (subroot.data == root.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static void Klevel(Node root, int level, int k){
        if(root == null){
             return;
        }

        if (level == k){
            System.out.print(root.data+" ");
        }

        Klevel(root.left, level+1, k);
        Klevel(root.right, level+1, k);
    }

    public static boolean getpath(Node root, int n1, ArrayList<Node>path){
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data== n1) {
            return true;
        }


        boolean left= getpath(root.left, n1, path);
        boolean right = getpath(root.right, n1, path);

        if (right|| left) {
            return true;
        }

        path.remove(path.size()-1);

        return false;



    }
    public static Node lca(Node root, int n1 , int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getpath(root, n1, path1);
        getpath(root, n2, path2);

        int i=0;
        for(; i<path1.size()&& i<path2.size();i++){
            if (path1.get(i)!=path2.get(i)) {
                break;
            }
        }

        Node lca = path1.get(i-1);
        return lca;
    }
    public static void main(String[] args) {
        // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree t = new BinaryTree();
        // Node root = t.BuildTree(nodes);
        // // levelOrder(root);
        // // System.out.println(sum(root));

        // System.out.println(Diameter(root));


        Node root  = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //   1
        // /   \
        // 2    3
        // / \   / \
        // 4 5   6  7

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(5);
        // subRoot.right = new Node(5);


        // System.out.println(isSubtree(root, subRoot));

        // Klevel(root, 1, 2);


        System.out.println(lca(root, 4, 5).data);

        
    }

}
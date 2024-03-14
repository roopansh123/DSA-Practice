public class Linkedlist {
    public static class Node {
        int data;
        Node  next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    public  void addfirst(int data){
        Node n = new Node(data);
        size++;
        if(head==null){
            head=tail=n;
            return;
        }
        n.next=head;
        head=n;
    }

    public void addlast(int data){
        Node n= new Node(data);
        size++;
        if(head==null){
            head=tail=n;
            return;
        }
        tail.next=n;
        tail=n;
    }

    public  void printll(){
        Node temp=head;
        if(head==null){
            System.out.println("LL is Empty");
        }

        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void addmid(int idx, int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        Node n=new Node(data);
        size++;
        Node temp= head; 
        int i=0;
        
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        n.next=temp.next;
        temp.next=n;
    }

    public int removefirst(){
        if(size==0){
            System.out.println("ll is Empty");
            return Integer.MAX_VALUE;
        }
        else if (size==1) {
            int val=head.data;
            head= tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast(){
        if(size==0){
            System.out.println("ll is Empty");
            return Integer.MAX_VALUE;
        }
        else if (size==1) {
            int val=head.data;
            head= tail=null;
            size--;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val = tail.data;
        prev.next=null;
        size--;
        tail=prev;

        return val;
    }

    public int itrSearch(int key){
        Node temp=head;
        for(int i=0;i<size;i++){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            
        }
        return -1;
    }
    public void reverse(){
        Node prev=null;
        Node curr = head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev = curr;
            curr= next;
        }
        head= prev;
    }

    public void removeNthfromEnd(int n){
        int sz=0;
        Node temp=head;
        while (temp !=null) {
            temp=temp.next;
            sz++;
        }

        if(n==sz){
            head=head.next;
            return;
        }

        Node prev =head;
        int i =1;
        int iToFind = sz-n;
        while (i<iToFind) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public Node findmid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head==null|| head.next==null){
            return true;
        }

        Node mid =findmid(head);

        Node curr= mid;
        Node prev=null;
        while (curr!=null) {
            Node next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;
        }
        Node right=prev;
        Node left=head;


        while (right!=null) {
            if(right.data!=left.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }

    public static boolean detectcycle(){
        Node fast = head;
        Node slow = head;

        while (fast!=null && fast.next!=null) {
            slow= slow.next;
            fast= fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        
        Node fast = head;
        Node slow = head;
        boolean cycle = false;

        while (fast!=null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                cycle = true;
                break;
            }
        }

        if(!cycle){
            return ;
        }

        slow = head;
        Node prev = null;

        while (slow!=fast) {
            prev=fast;
            slow= slow.next;
            fast= fast.next;
        }
        prev.next= null;
    }
    public Node Merged(Node head1, Node head2){
        Node mergedll=new Node(-1);
        Node temp=mergedll;

        while (head1!=null && head2!=null) {
            if(head1.data <= head2.data){
                temp.next = head1;
                head1=head1.next;
                temp = temp.next;
            }
            else{
                temp.next= head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while (head1!=null) {
            temp.next = head1;
            head1=head1.next;
            temp = temp.next;
        }

        while (head2!=null) {
            temp.next= head2;
            head2=head2.next;
            temp=temp.next;
        }

        return mergedll.next;
    }

    public Node getmid(Node head){
        Node fast = head.next;
        Node slow = head;
        while (fast !=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
    public  Node MergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node mid =getmid(head);

        Node rightHead= mid.next;
        mid.next=null;

        Node newLeft= MergeSort(head);
        Node newRight =MergeSort(rightHead);
        return  Merged(newLeft,newRight);
    }

    public void zigzag(){
        //find mid
        Node slow = head;
        Node fast= head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }

        Node mid = slow;


        // reverse 2nd half

        Node curr= mid.next;
        mid.next = null;
        Node next;
        Node prev = null;

        while (curr !=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        Node right = prev;
        Node left =  head;
        Node nextl;
        Node nextr;
        while (left!=null && right!=null) {
            nextl = left.next;
            left.next= right;
            nextr = right.next;
            right.next = nextl;
            left=nextl;
            right=nextr;
        }
    }


    public static void main(String[] args) {
        // Linkedlist ll= new Linkedlist();
        // ll.addfirst(2);
        // ll.addfirst(1);
        // ll.addlast(3);
        // ll.addlast(4);
        // ll.addmid(2, 8);
       
        // ll.printll();
        // System.out.println("Size is  "+ll.size);
        // System.out.println("Removing "+ll.removelast()+" from Linked list;");
        // ll.printll();
        // System.out.println("Size is  "+ll.size);
        // // System.out.println(ll.itrSearch(2));
        // ll.reverse();
        // ll.printll();
        // ll.removeNthfromEnd(3);
        // ll.printll();
        // System.out.println(ll.findmid(head).data);
        // ll.addfirst(1);
        // ll.addfirst(2);
        // ll.addfirst(2);
        // ll.addfirst(1);
        // ll.printll();
        // System.out.println( ll.checkPalindrome());

        // head= new Node(1);
        // Node temp =new Node(3);
        // head.next= temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        
        // System.out.println(detectcycle());
        // removeCycle();
        // System.out.println(detectcycle());

        // Linkedlist ll= new Linkedlist();
        // ll.addfirst(1);
        // ll.addfirst(2);
        // ll.addfirst(3);
        // ll.addfirst(4);
        // ll.addfirst(5);
        // ll.printll();
        // ll.head = ll.MergeSort(ll.head); 
        // ll.printll();


        Linkedlist ll= new Linkedlist();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.printll();

        ll.zigzag();
        ll.printll();
    }
}

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

    public static void main(String[] args) {
        Linkedlist ll= new Linkedlist();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.addmid(2, 8);
        ll.addlast(9);
        ll.printll();
        // System.out.println("Size is  "+ll.size);
        // System.out.println("Removing "+ll.removelast()+" from Linked list;");
        // ll.printll();
        // System.out.println("Size is  "+ll.size);
        // System.out.println(ll.itrSearch(2));
        ll.reverse();
        ll.printll();
    }
}

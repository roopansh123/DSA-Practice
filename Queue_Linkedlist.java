public class Queue_Linkedlist{
    static class Node{
        int data;
        Node next;
        Node(int data){
        this.data = data;
        this.next=null;
        }
    }


    static class Queue{
        static Node head = null;
        static Node tail = null;

        public boolean isEmpty(){
            return head==null && tail==null;
        }

        public void add(int data){
            Node n = new Node(data);
            if (isEmpty()) {
                head = tail = n;
                return;
            }

            tail.next = n;
            tail = n; 

        }

        public int remove(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = head.data;
            if(head==tail){
                head= tail =null;
            }
            else{
                head=head.next;
            }

            return result;

        }

        public int peek(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}

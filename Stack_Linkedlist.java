public class Stack_Linkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    static class stack {
        static Node head = null;
        public boolean is_Empty(){
            return head == null;
        }

        public void push(int data){
            Node newNode = new Node(data);
            if(is_Empty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head= newNode;
        }

        public int pop(){
            if (is_Empty()) {
                return-1;
            }
            int top= head.data;
            head=head.next;
            return top;

        }

        public int peek(){
            if (is_Empty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        stack ss = new stack();
        ss.push(1);
        ss.push(2);
        ss.push(3);

        System.out.println(ss.is_Empty());
        while (! ss.is_Empty()) {
            System.out.println(ss.peek());
            ss.pop();
        }
        System.out.println(ss.is_Empty());
    }
    
}

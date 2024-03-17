import java.util.ArrayList;

public class Stack_Arraylist {

     public static class stack{
        static ArrayList<Integer>list =new ArrayList<>();
        public boolean is_Empty(){
            return list.size()==0;
        }

        public void push(int data){
            list.add(data);
        }

        public int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }


        public int peek(){
            return list.get(list.size()-1);
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
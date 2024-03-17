import java.util.Stack;

public class StackB {

    public static void push_at_bottom(Stack<Integer>s, int data ){
        if(s.isEmpty()){
            s.push(data);
                return;
        }
        
        int top = s.pop();
        push_at_bottom(s, data);
        s.push(top);
    }
    public static String Reversestr (String str){
        Stack<Character>st= new Stack<>();
        StringBuilder s = new StringBuilder();
        int n= str.length();
        int idx = 0;

        while (idx<n) {
            st.push(str.charAt(idx));
            idx++;
        }

        while (!s.isEmpty()) {
            char curr=st.pop();
            s.append(curr);
        }

        return s.toString();
    }


    public static void main(String[] args) {
        // Stack<Integer> ss= new Stack<>();
        // ss.push(1);
        // ss.push(2);
        // ss.push(3);

        
        // while (!ss.isEmpty()) {
        //     System.out.println(ss.peek());
        //     ss.pop();
        // }
        // push_at_bottom(ss, 5);

        // while (!ss.isEmpty()) {
        //     System.out.println(ss.peek());
        //     ss.pop();
        // }
    }
}

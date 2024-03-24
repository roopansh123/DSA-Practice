
import java.util.*;

public class Queueb {
    public static void printNonRepeting(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();


        for(int i= 0; i<str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() -'a']>1) {
                q.remove();
            }

            if(q.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(q.peek()+" ");
            }
        }
    }

    public static void QueueInterLeave(Queue<Integer>q){
        Queue<Integer> firsthalf = new LinkedList<>();
        int size = q.size();

        for(int i =0; i<size/2;i++){
            firsthalf.add(q.remove());
        }
        while (!firsthalf.isEmpty()) {
            q.add(firsthalf.remove());
            q.add(q.remove());
        }
    }


    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // q.remove();
        // q.add(4);

        // while (!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }

        // String str = "aabccxb";
        // printNonRepeting(str);


        Queue<Integer> q = new LinkedList<>();
        for(int i =1 ;i<=10; i++){
            q.add(i);
        }

        QueueInterLeave(q);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
    
}

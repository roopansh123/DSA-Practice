import java.util.ArrayList;
// import java.util.Collections;

public class arraylistpractice {
    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
        int temp =list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }

 public static void main(String args[]){
    //  ArrayList<Integer> list = new ArrayList<>();
    //  list.add(1);
    //  list.add(2);
    //  list.add(3);
    //  list.add(4);
    //  list.add(5);
    //  System.out.println(list);
    //  swap(list, 1, 4);
    //  System.out.println(list);
    //  Collections.sort(list);
    //  System.out.println(list);
     //  System.out.println(list.get(2));

     //  list.remove(2);
    //  list.set(1, 9);
    //  System.out.println(list);
    //  System.out.println(list.size());

    // for(int i=list.size()-1;i>=0;i--){
    //     System.out.print(list.get(i)+" ");
    // }

    // int max = Integer.MIN_VALUE;
    // for(int i=0;i<list.size();i++){
    //     max=Math.max(max, list.get(i));
    // }
    // System.out.println("Max Element is "+max);

    // Collections.sort(list,Collections.reverseOrder());
    // System.out.println(list);


    // ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
    // ArrayList<Integer>list =new ArrayList<>();
    // list.add(1);list.add(2);
    // mainlist.add(list);

    // ArrayList<Integer>list2 =new ArrayList<>();
    // list2.add(3);list2.add(4);
    // mainlist.add(list2);

    // // System.out.println(mainlist);
    //     for(int i=0;i<mainlist.size();i++){
    //         ArrayList<Integer>currlist=mainlist.get(i);
    //         for(int j=0;j<currlist.size();j++){
    //             System.out.print(currlist.get(j));
    //         }
    //         System.out.println();
    //     }

    ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
    ArrayList<Integer>list =new ArrayList<>();
    ArrayList<Integer>list1 =new ArrayList<>();
    ArrayList<Integer>list2 =new ArrayList<>();
    for(int i=1;i<=5;i++){
        list.add(1*i);
        list1.add(2*i);
        list2.add(3*i);
    }
    mainlist.add(list);
    mainlist.add(list1);
    mainlist.add(list2);

    System.out.println(mainlist);



  }
}
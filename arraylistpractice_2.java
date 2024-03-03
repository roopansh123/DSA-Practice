import java.util.ArrayList;

public class arraylistpractice_2 {
    public static boolean pairsum1(ArrayList<Integer>list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if (list.get(i)+list.get(j)==target) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean pairsum1op(ArrayList<Integer>list,int target){
        int lp=0;
        int rp=list.size()-1;

        while (lp<rp) {
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if (list.get(lp)+list.get(rp)<target) {
                lp++;
            }
            else{
                rp--;
            }
            
        }
        return false;
    }

    public static int storewater(ArrayList<Integer>list){
        int max=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int height= Math.min(list.get(i), list.get(j));
                int width=j-i;
                int currwater=height*width;
                max=Math.max(max,currwater);
            }
        }
        return max;
    }


    public static int storewateropti(ArrayList<Integer>list){
        int max=0;
        int lp=0;
        int rp=list.size()-1;
        while (lp<rp) {
            int height=Math.min(list.get(rp),list.get(lp));
            int width=rp-lp;
            int currwater=height*width;
            max= Math.max(max, currwater);
            if(list.get(lp)<list.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return max;
    }
    public static void main(String args[]){
        int target =50;
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // System.out.println(storewateropti(list));
        // System.out.println(pairsum1(list, target));
        System.out.println(pairsum1op(list, target));
        
    }
    
}

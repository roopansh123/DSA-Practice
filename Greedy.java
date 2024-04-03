public class Greedy{
    public static void main(String[] args) {

        // // Activity Selection
        // int [] start = {1,3,0,5,8,5};
        // int [] end = {2,4,6,7,9,9};

        // ArrayList<Integer> ans  = new ArrayList<>();
        // int maxAct=1;
        // ans.add(0);
        // int lastAct= end[0];
        // for(int i=0;i<end.length;i++){
        //     if (start[i]>=lastAct) {
        //         maxAct++;
        //         ans.add(i);
        //         lastAct = end[i];
        //     }
        // }

        // System.out.println(maxAct);
        // System.out.println(ans);




        // // Fractional Knapsack
        // int[] value ={60,100,120};
        // int[] weight = {10,20,30};
        // int W =50;

        // int [][] ratio = new int[value.length][2];

        // for(int i=0;i<ratio.length;i++){
        //     ratio[i][0]= i;
        //     ratio[i][1]= value[i]/weight[i];
        // }
        
        // Arrays.sort(ratio,Comparator.comparingInt(o -> o[1]));


        // int capacity= W;
        // int finalVal =0;
        // for(int i = ratio.length-1; i>=0;i--){
        //     int idx = ratio[i][0];
        //     if (capacity>=weight[idx]) {
        //         finalVal += value[idx];
        //         capacity-=weight[idx];
        //     }else{
        //         finalVal += (ratio[i][1]*capacity);
        //         capacity=0;
        //         break;
        //     }
        // }

        // System.out.println(finalVal);

        // // Absolute Difference

        // int [] A={4,1,8,7};
        // int [] B ={2,3,6,5};

        // Arrays.sort(A);
        // Arrays.sort(B);

        // int MaxDiff=0;
        // for(int i=0; i<A.length;i++){
        //     MaxDiff+=Math.abs(A[i]-B[i]);
        // }
        
        // System.out.println(MaxDiff);
        

        // // Length Chain of Pairs 
        // int [][] pairs = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        // Arrays.sort(pairs,Comparator.comparingInt(o -> o[1]));
        // int pair =1;
        // int endPair = pairs[0][1];

        // for(int i =1; i<pairs.length;i++){
        //     if (pairs[i][1]>endPair){
        //         pair ++;
        //         endPair = pairs[i][1];

        //     }
        // }
        
        // System.out.println(pair);

        // // Indian Coins
        // Integer coins[]= {1,2,5,10,20,50,100,500,2000};

        // Arrays.sort(coins,Comparator.reverseOrder());
        
        // int count =0;
        // int amt =590;
        // ArrayList<Integer> ans = new ArrayList<>();
        // for(int i =0; i<coins.length; i++){
        //     if(coins[i]<=amt){
        //         while (coins[i]<=amt) {
        //             count++;
        //             amt-=coins[i];
        //             ans.add(coins[i]);
        //         }
        //     }
        // }
        // System.out.println(count);
        // System.out.println(ans);

        


    }
}
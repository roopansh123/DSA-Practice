public class arrayassign {

    public static boolean containduplicate(int []arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }

        }
       return false; 
    }

    public static int maxProfit(int price[]){
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        int profit;
        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){
            profit=price[i]-buyprice;
            maxprofit=Math.max(maxprofit, profit); }  
            else{
                buyprice=price[i];
            }          
        }
        return maxprofit;
    }


    public static int TrappingRainWater(int height[]){
        int trappedwater=0;
        int n=height.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];

        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }


        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        int waterlevel;
        for(int i=0;i<n;i++){
            waterlevel=Math.min(rightmax[i],leftmax[i]);
            trappedwater+=waterlevel-height[i];
        }




        return trappedwater;

    }

    public static void main(String[]args){
        //Q1 containduplicate
        //  int arr[]={1,2,3,1};
        // System.out.println(containduplicate(arr));


        // Q3 Buy and Sell Stock
        // int price[]={7, 6, 4, 3, 1};
        // System.out.println(maxProfit(price));

        // Q4 Trapping RainWater
        int height[]={4, 2, 0, 3, 2, 5};
        System.out.println(TrappingRainWater(height));






        
        
    }
    
}

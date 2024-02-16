public class arraypractice {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]+=1; 
        }

    }

    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
             }
        }
        return -1;
    }

    public static int linearSearch(String arr[], String key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
             }
        }
        return -1;
    }
    

    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length; i++){
            if(numbers[i]>largest){
                largest =numbers[i];
            }
        }
        return largest;
    }

    public static int getsmallest(int arr[]){
        int smallest= Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(smallest>arr[i]){
                    smallest=arr[i];
                }
            }

        
        return smallest;
    }

    public static int binarySearch(int numbers[],int key){
        int start=0, end = numbers.length-1;

        while(start<=end){
            int mid= (start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return-1;
    }

    public static void reverse(int numbers[]){
        int start=0, end=numbers.length-1;

        while (start<end) {
            int temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;

            start++;
            end--;
            
        }
        
    }

    public static void printArray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }


    public static void printpairs(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            int current = numbers[i];
            for(int j=i+1;j<numbers.length; j++){
                System.out.print("("+current+","+numbers[j]+") ");    
            }
            System.out.println();
        }

    }

    public static void printSubarray(int []numbers){
        for(int i=0;i<numbers.length;i++){
            for(int j=i; j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxSubarraySum(int []numbers){
        int currsum=0;
        int maxsum= Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i; j<numbers.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if (maxsum< currsum) {
                    maxsum = currsum;
                    
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("max sum is :- "+  maxsum);
    }

    public static void maxSubarraySumPrefix(int numbers[]){
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        

        for(int i=0;i<numbers.length;i++){
            for(int k=1;k<numbers.length;k++){
             currsum= i==0 ?  prefix[k]:  prefix[k]-prefix[i-1];

             if(maxsum<currsum){
                maxsum=currsum;
             }

            }
        }
        System.out.println("max sum is :- "+  maxsum);
    }


    public static void kadane(int [] numbers){
        int ms= Integer.MIN_VALUE;
        int cs= 0;

        for(int i=0;i<numbers.length;i++){
            cs+=numbers[i];
            if(cs < 0){
                cs=0;
            }

            ms=Math.max(cs, ms);
        }

        System.out.println("max sum is "+ms);
    }


    public static int SecondLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int second_largest=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>largest){
                    second_largest= largest;
                    largest=arr[i];
                }
            }

        return second_largest;


    }

    public static void main(String []args){
        // int numbers[]={2,4,6,8,10,12,14,16,18};
        // int index= linearSearch(numbers, keyi);
        // System.out.println("key is at index: " + index);
        // String Menu[]={"dosa", "idli", "sambar"};
        // String key="idli";
        // int indexc= linearSearch(Menu, key); 
        // System.out.println("key is at index: " + indexc);
        // System.out.println("largest number is "+getlargest(numbers));
        // System.out.println("smallest number is "+getsmallest(numbers));
        // System.out.println(binarySearch(numbers, 12)); 
        // reverse(numbers);
        // printArray(numbers);
        // printpairs(numbers);
        // printSubarray(numbers);
        // maxSubarraySum(numbers);     
        // int numbers[]={1,-2,6,-1,3};
        // maxSubarraySumPrefix(numbers);
        // kadane(numbers);

        int arr[]={0,1,2,5};
        System.out.println(SecondLargest(arr));

          

        

        
        
        
    }
}

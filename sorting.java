// import java.util.Arrays;
// import java.util.Collections;

public class sorting {


    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                 int temp = arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;   
                }

            }
        }

    }


    public static void selectionSort(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp= arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
    }

    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
           int current =arr[i];
           int j=i-1;
           while(j>=0 && current<arr[j]){
            arr[j+1]=arr[j];
            j--;
           } 
            arr[j+1]=current;
        }
    }


    public static void countingsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }

        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }


        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] =i;              
                j++;
                count[i]--;
            }
        }

    }


    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    
    }

    public static void print(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    
    }




    public static void main(String[] args) {
    int arr[]={5,4,1,3,2};
    // Integer arr1[]={5,4,1,3,2};
    // bubbleSort(arr);
    // selectionSort(arr);  
    // insertionsort(arr);         
    // Arrays.sort(arr1,Collections.reverseOrder());
    print(arr);
    countingsort(arr);
    print(arr);
    }
}

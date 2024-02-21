// import java.util.Arrays;

public class divide_and_conquer {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void printarr(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void mergesort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;

        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr, si, mid, ei);

    }


    public static void merge(int arr[],int si, int mid, int ei){

        int temp[]=new int [ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while (i<=mid && j<=ei) {
            if (arr[i]<arr[j]) {
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
            
        }

        while (i<=mid) {
            temp[k++]=arr[i++];
        }

        while (j<=ei) {
            temp[k++]=arr[j++];            
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }


    }

    public static void quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pidx = partition(arr, si, ei);
        quicksort(arr, si, pidx-1);
        quicksort(arr, pidx+1, ei);
    }


    public static int partition(int arr[],int si,int ei){
        int i=si-1;
        int pivot = arr[ei];

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
        }
        i++;
        int temp =pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void mergesort(String arr[],int si, int ei ){

        if(si>=ei){
            return;
        }

        int mid=(si+ei)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr, si, ei, mid);

    }

    public static void merge(String arr [], int si, int ei , int mid){
        
        int i=si;
        int j=mid+1;
        int k=0;
        String[]res=new String[ei-si+1];

        while (i<=mid && j<=ei) {
            if(arr[i].compareTo(arr[j])<=0){
                res[k++]=arr[i++];
            }
            else{
                res[k++]=arr[j++];
            }            
        }

        while (i<=mid) {
            res[k++]=arr[i++];
        }

        while (j<=ei) {
            res[k++]=arr[j++];            
        }

        for(k=0, i=si; k<res.length;k++,i++){
            arr[i]=res[k];
        }

    }


    public static void main(String[]args){
        // int arr[]= {6,8,9,4,3,2};
        // quicksort(arr, 0, arr.length-1);
        // 

        String arr[]={"sun", "earth", "mars","mercury"};
        mergesort(arr, 0, arr.length-1);
        // System.out.println(Arrays.toString(arr));
        printarr(arr);
    }
    
}

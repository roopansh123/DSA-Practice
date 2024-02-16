public class Recursion {
    public static void printdec(int n){

        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
    }
    
    public static void printinc(int n){

        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printinc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n){
        if (n==0) {
            return 1;            
        }

        int fnm = fact(n-1);

        int fn= n* fnm;
        
        return fn;
    }

    public static int sum(int n){
        if (n==1) {
            return 1;
        }
        int fs = sum(n-1);

        int fn= n + fs;

        return fn;
    }


    public static void printFibonacci(int n) {
        int n0 = 0, n1 = 1, n2;
        System.out.print(n0 + " " + n1); // Printing first two Fibonacci numbers
        for (int i = 1; i < n; ++i) {
            n2 = n0 + n1;
            System.out.print(" " + n2);
            n0 = n1;
            n1 = n2;
        }
    }

    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);

        int fn = fnm1+fnm2;

        return fn;
    }
    public static boolean issorted(int arr[],int i){
        if (arr[i]==arr.length-1) {
            return true;            
        }

        if(arr[i]>arr[i+1]){
            return false;
        }

        return issorted(arr, i+1);

    }


    public static int firstocc(int arr[],int key, int i){
        if(i==arr.length-1){
            return-1;
        }

        if(arr[i]==key){
            return i;
        }

        return firstocc(arr, key, i+1);
    }

    public static int lastocc(int arr[],int key,int i){
        if(i==arr.length){
            return-1;
        }
        int isfound=lastocc(arr, key, i+1);

        if(isfound== -1 && arr[i]==key ){
            return i;
        }
        return isfound;
    }


    public static int power(int x, int n){
        if( n==0){
            return 1;
        }
        return x* power(x, n-1);
    }

    public static int powoptimized(int x,int n){
        if (n==0) {
            return 1;            
        }

        int half=powoptimized(x, n/2);
        int halfpow =half*half;
        
        if(n %2 !=0){
            halfpow=  x * halfpow; 
        }
        return halfpow;
    }


    public static int tilling (int n){
        if(n==0 || n==1){
            return 1;
        }


        int fnm1 = tilling(n-1);
        int fnm2 = tilling(n-2);

        int noways= fnm1 + fnm2;
    
        return noways;

    }


    public static void toh(int n , int A, int C, int B){
        if (n==0) {
            return;
        }

        toh(n-1, A, B, C);
        System.out.println("moving"+n+"th disk from"+A+" to"+C);
        toh(n-1,B, C, A);
    }


    public static void printarr(int arr[], int i){
        if (i== arr.length) {
            return;            
        }

        System.out.println(arr[i]);
        printarr(arr, i+1);
    }


    public static void main(String args[]){
        // int arr[]={1,2,3,4,6,5,3,5,3};
        // int n=1;
        // printinc(n);
        // System.out.println();
        // printdec(n);
         System.out.println(fact(10 ));
        // System.out.println(sum(n));
        // printFibonacci(n);
        // System.out.println(fib(n));
        // System.out.println(issorted(arr, 0));
        // System.out.println(lastocc(arr, 3, 0));
        // System.out.println(powoptimized(2, 5));
        // System.out.println(tilling(3));

        // printarr(arr, 0);
        // toh(5, 1, 3, 2);
    }
}

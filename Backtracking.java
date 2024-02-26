public class Backtracking {
    public static void changearr(int arr[], int i, int val){
        if(i == arr.length){
            printarr(arr);
            return;
        }
        
        arr[i]= val;
        changearr(arr, i+1, val+1);
        arr[i]-=2;

    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
    
    public static void printsubstr(String str, String ans, int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }

        printsubstr(str,ans+str.charAt(i),i+1);

        printsubstr(str, ans, i+1);

    }
    public static void swap(char ar[],int i, int fi){
        char temp =ar[i];
        ar[i]= ar[fi];
        ar[fi]=temp;
    }

    public static void permutation(char[]ar, int fi){
        if(fi == ar.length-1){
            System.out.println(ar);
            return;
        }
        
        for(int i=fi;i<ar.length;i++){
            swap(ar, i, fi);
            permutation(ar, fi+1);
            swap(ar, i, fi);
        }
    }


    public static void printca(char ar[][]){
        int n= ar.length;
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }


    public static void nqueen(char ar [][],int n){

    }
    public static void main(String []args){
        // int arr[]=new int[5];
        // changearr(arr, 0, 1);
        // printarr(arr);
        // String str="abc";
        // permutation(str.toCharArray(), 0);
        // printsubstr(str, "", 0);
        int n=2;
        char c[][]= new char[n][n];

        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j]='.';
            }
        }


    }
    
}

public class Backtracking_2 {
    public static void printboard(char arr[][]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void nqueen( char arr[][], int row){
        if(row == arr.length){
            printboard(arr);
            return;
        }

        for(int j=0;j<arr.length;j++){
            arr[row][j]='Q';
            nqueen(arr, row+1);
            arr[row][j]='x';
        }
    }
    public static void main(String []args){
        int n=2;
        char arr[][] = new char[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='x';
            }
        }

        nqueen(arr,0);


    }
    
}

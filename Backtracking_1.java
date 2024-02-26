public class Backtracking_1 {
    public static void rat_in_a_maze(int i,int j,int n, int[][]matrix,boolean[][]visited,String path){
        if(i>=n||i<0||j>=n||j<0||matrix[i][j]==0||visited[i][j]==true){
            return;
        }
        if(i==n-1&&j==n-1){
            System.out.println("Reached Destination  "+path);
            return;
        }
        visited[i][j]=true;
        rat_in_a_maze(i-1,j,n,matrix,visited,path+"U");
        rat_in_a_maze(i+1,j,n,matrix,visited,path+"D");
        rat_in_a_maze(i,j+1,n,matrix,visited,path+"R");
        rat_in_a_maze(i,j-1,n,matrix,visited,path+"L");
        visited[i][j]=false;
    }

    public static void grid_ways(int i, int j,int n,int m,String path){
        if(i>=n||j>=m||i<0||j<0){
            return;
        }
        if(i==n-1 && j==m-1){
            System.out.println("Reached"+path);
        }

        grid_ways(i+1, j, n, m, path+" R");
        grid_ways(i, j+1, n, m, path+" D");
        
    }

    
    
    public static void main(String args[]){

        // RAT IN A MAZE
        // int [][] matrix ={{1,1,1,1},{0,1,0,1},{1,1,1,1},{1,0,1,1}};
        // int n = matrix.length;
        // boolean[][]visited=new boolean[n][n];
        // rat_in_a_maze(0,0,n,matrix,visited,"");

        // GRID WAYS

        int n=3;
        int m=3;
        
        grid_ways(0, 0, n, m, "");

        



    
    }
    
}

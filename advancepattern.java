public class advancepattern {

    public static void hollowrectangle(int rows, int columns){
        for(int row=1;row<=rows;row++){
            for(int col =1; col<=columns; col++){
                if(row==1 || col==1 || row==rows || col==columns){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();  
        }
    }

    public static void inverted_rotated_half_pyramid(int totalrows){
        for(int row =1;row<=totalrows; row++){
            for(int sp=1;sp<=totalrows-row;sp++){
                System.out.print("  ");
            }

            for(int st=1;st<=row;st++){
                System.out.print("* ");
            }
         System.out.println();   
        }

    }

    public static void Inverted_half_pyramid1(int totalrows){
        for(int row=1; row<=totalrows;row++){
            for(int col=1; col<=totalrows-row+1;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }


    public static void Inverted_half_pyramid2(int totalrows){
        for(int row=totalrows; row>=1; row--){
            for(int col=1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    } 


    public static void FloydTriangle(int totalrows){
        int count=1;
        for(int row=1;row<=totalrows;row++){
            
            for(int col=1; col<=row;col++){
                System.out.print(count+"  ");
                count++;
            }
            System.out.println();

        }
    }

    public static void binTriangle(int totalrows){
        for(int row=1;row<=totalrows;row++){
            for(int col=1;col<=row;col++){
                if((row+col)%2 == 0){
                    System.out.print(1+ " ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }


    public static void Butterfly(int n){
        for(int row =1;row<=n; row++)
        {
            for(int st=1; st<=row;st++){
                System.out.print("* ");
            }

            for(int sp=1;sp<=(n-row)*2;sp++){
                System.out.print("  ");
            }

            for(int st=1; st<=row;st++){
                System.out.print("* ");
            }
            System.out.println();
        }


        for(int row=n; row>=1;row--){
            for(int st=1; st<=row;st++){
                System.out.print("* ");
            }

            for(int sp=1;sp<=(n-row)*2;sp++){
                System.out.print("  ");
            }
            
            for(int st=1; st<=row;st++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void solidRhombus(int totalrows){
        for(int row =1; row<=totalrows; row++){
            for(int sp=1; sp<=totalrows-row; sp++){
                System.out.print("  ");
            }
            
            for(int st =1; st<=totalrows; st++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void HollowRhombus(int totalrows){
        for(int row =1; row<=totalrows; row++){
            for(int sp=1; sp<=totalrows-row; sp++){
                System.out.print("  ");
            }
            
            for(int st =1; st<=totalrows; st++){
                if(st==1 || row==1 || st==totalrows || row==totalrows){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }



    public static void Diamond(int totalrows){
        for(int row=1;row<=totalrows;row++){
            for(int sp=1; sp<=totalrows-row;sp++){
                System.out.print("  ");
            }

            for(int st=1; st<=2*row-1; st++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int row=totalrows;row>=1;row--){
            for(int sp=1; sp<=totalrows-row;sp++){
                System.out.print("  ");
            }

            for(int st=1; st<=2*row-1; st++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void palindrom(int totalrows){

        for(int row=1;row<=totalrows;row++){
            for(int sp=1;sp<=totalrows-row;sp++){
                System.out.print("  ");
            }
            
            for(int st=row;st>=1;st--){
                System.out.print(st+" ");
            }
            for(int st=2;st<=row;st++){
                System.out.print(st+" ");
            }
            System.out.println();
        }



    }

    public static void main(String []args){
        // hollowrectangle(4, 5);
        // inverted_rotated_half_pyramid(10);
        // Inverted_half_pyramid1(9);
        // FloydTriangle(10);
        // binTriangle(5);
        // Butterfly(9);
        // solidRhombus(8);
        // HollowRhombus(10);
        // Diamond(10);
        // palindrom(18);
        
       


        

        
        
        
    }
}

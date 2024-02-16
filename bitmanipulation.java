public class bitmanipulation {
    public static void oddorEven(int n){
        int bitmask=1;
        if((n & bitmask)==1){
            System.out.println("Number id odd");
        }
        else{
            System.out.println("Number is even");
        }

    }

    public static int getbit(int num, int i){
        int bitmask = 1<<i;
        if((num & bitmask)==0){
        return 0;}
        else {
            return 1;
        }
    }


    public static int setbit(int num, int i){
        int bitmask = 1<<i;
        return num | bitmask;
 
    }
    public static int clearbit(int n,int i){
        int bitmask= ~(1<<i) ;
        return n& bitmask;

    }


    public static int clearIbits(int n, int i){
        int bitmask=(~0)<<i;
        return n & bitmask;
    }

    public static boolean isPowofTwo(int n){
        return (n&(n-1)) ==0;
    }

    public static void main(String[] args) {
        // System.out.println(5&6);     
        // System.out.println(5|6);      
        // System.out.println(5^6);  
        // System.out.println(~5);
        // System.out.println(3<<1 );   
        // System.out.println(3>>1);    
        // oddorEven(14);   
        // System.out.println(clearIbits(15, 1));
        // System.out.println(isPowofTwo(7));


    }   
}

public class javabasic2 {

   public static boolean isPrime(int a)
   {

        boolean isPrime=true;
        for(int i=2;i<=a-1;i++)
        {
            if(a%i==0)
            {
                isPrime=false;
                break;
            }
        }
        return isPrime;

   }

   public static void prineInRange(int n){
        for(int i=2; i<=n;i++) {
            if(isPrime(i)) {
                System.out.print(i+ " ");

            }
        }
        System.out.println();
   }

   public static void binToDec(int binNum){
    int mynum = binNum;
    int pow=0;
    int dec=0;

    while (binNum>0) {
        int lastdigit= binNum % 10;
        
        dec=dec+ (lastdigit * (int)Math.pow(2, pow));

        binNum/=10;
        pow++;

    }

    System.out.println("decimal of "+ mynum + " is "+ dec );
   }

   public static void Dectobin(int decNum){
    int mynum=decNum;
    int pow=0;
    int binNo =0;

    while(decNum>0){
       
        binNo=0;
        while (decNum>0) {
            int rem = decNum%2;
            binNo=binNo +(rem *(int)Math.pow(10, pow));
            pow ++;
            decNum/=2;

        }
        System.out.println("Binary form of "+ mynum +"is  "+binNo);



    }


   }

   public static void main(String[] args)
   {    
    
    int num2 = 4;
    Dectobin(num2);
        
   } 
    
}

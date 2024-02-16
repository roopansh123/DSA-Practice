// import java.util.Scanner;

// for(int line =0;line<=3 ;line++)
//         {
//             for(int j=0;j<=line;j++)
//             {
//                 System.err.print("* " );
//             }
//             System.out.println();
//         } star

// int n=4;
//         for(int line=1; line<=4; line++ )
//         {
//             for(int star=1; star<=n-line+1; star++)
//             {
//                 System.out.print("* ");
//             }
//             System.err.println();
//         } inverted star


// for(int i=1;i<=4;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.println();
//         } character pattern

// char ch ='A';
//         for(int i=1;i<=4;i++)
//         {
//             for(int j=1; j<=i; j++)
//             {
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }


        
public class javabasics {

    public static int reversenum(int n){
      int reverse=0;
      while(n!=0){
        int lastdigit= n%10;
        reverse= (reverse*10)+ lastdigit;
        n/=10;
      }
      return reverse;
      

    }

      public static void main(String[] args) {
        int n=10899;
        System.out.println(reversenum(n));
    }

}
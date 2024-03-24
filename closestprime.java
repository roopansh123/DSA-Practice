public class closestprime {

    public static  boolean isprime(int num){
        boolean isPrime = true;
        for(int i=2; i<num-1;i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }

    public static int NearestPrime(int num){
        int smallest = num-1;
        int largest = num+1;
        while (!isprime(smallest)) {
            smallest--;
        }

        while (!isprime(largest)) {
            largest++;
        }

        if(num-smallest<=largest-num){
            return smallest;
        }
        else{
            return largest;
        }
    }


    public static void main(String[] args) {

        System.out.println(NearestPrime(20));
        
    }
    
}

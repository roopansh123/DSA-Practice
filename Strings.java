import java.util.Scanner;

public class Strings {

    public static int Shortestpath(String path){
        int x=0, y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);

            if(dir == 'S'){
                y--;
            }

            else if(dir=='N'){
                y++;
            }

            else if(dir=='E'){
                x++;
            }

            else{
                x--;
            }

        }
        int x2 = x*x;
        int y2 = y*y;

        return(int) Math.sqrt(x2+y2);

    }
    public static String touppercase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        

        for(int i=1;i<str.length();i++){
            if(str.charAt(i) ==' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

    public static String Compression(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1&& str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }            
        }
        return newStr;


    }

    public static void main(String[] args) {
    // String fruits[]= {"apple", "mango", "banana"};
    // String largest = fruits[0];
    // for(int i=1;i<fruits.length;i++){
    //     if(largest.compareTo(fruits[i])<0){
    //         largest=fruits[i];}}
    // System.out.println(largest);
    // StringBuilder sb =new StringBuilder("");
    // for(char ch='a';ch<='z';ch++){
    //     sb.append(ch);}
    // System.out.println(sb);

    try (Scanner sc = new Scanner(System.in)) {
        String str=sc.nextLine();
        // System.out.println(touppercase(str));
        System.out.println(Compression(str));
    }





        



    }
    
}

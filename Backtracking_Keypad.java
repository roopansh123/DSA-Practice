public class Backtracking_Keypad {
    public static void combination(String digits,String letters,int idx,String[]keypad){
        if(idx==digits.length()){
            System.out.println(letters);
            return;
        }
        char digit= digits.charAt(idx);

        for(char letter:keypad[digit-'0'].toCharArray()){
            combination(digits, letters+letter, idx+1, keypad);
        }


    }


    public static void main(String args[]){
        String digits="23";
        String [] keypad={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(digits, "", 0, keypad);
    }
    
}

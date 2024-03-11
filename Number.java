import java.util.HashSet;
import java.util.Set;

public class Number {

    public static int numDifferentIntegers(String word) {
        Set<Integer> temp = new HashSet<>();
        int num = -1;
        for(int i=0; i<word.length(); i++){
            if(Character.isDigit(word.charAt(i))){
                if(num == -1){
                    num = 0;
                }
                num = (num*10) + Character.getNumericValue(word.charAt(i));
            }else{
                if(num != -1){
                    temp.add(num);
                    num = -1;
                }
            }
        }
        if(num != -1){
            temp.add(num);
        }
        return temp.size();
    }

    public static void main(String[] args) {
        String word = "035985750011523523129774573439111590559325a1554234973";

        System.out.println(numDifferentIntegers(word));
    }
}

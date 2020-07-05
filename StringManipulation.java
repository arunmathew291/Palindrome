
//import java.util.* r to bring in Scanner
import java.util.*;

public class StringManipulation {

    public static void main (String[] args){

        //creating Scanner object in order to allow users to input their own word
        Scanner scan = new Scanner(System.in);
        //How to check if word is a Palindrome
        System.out.println("Type word to check if Palindrome");
        String word = scan.nextLine();

        char[] originalWord = word.toCharArray();
        char[] palindromeTest = new char[originalWord.length];
        boolean palindromeYesorNo = false;
        int x = 0;

        for(int i= originalWord.length-1; i>=0; i--){

            palindromeTest[x] = originalWord[i];
                x++;
               }
        palindromeYesorNo = Arrays.equals(originalWord,palindromeTest);

        if(palindromeYesorNo == true){
            System.out.println("You have a Palindrome!");
        } else{
            System.out.println("You do not have a Palindrome");
        }




          /* put this for loop to check if the new array actually captured the word properly
         for(int y=0; y<originalWord.length; y++){
            System.out.print(palindromeTest[y]);
         }
        */

    }
}

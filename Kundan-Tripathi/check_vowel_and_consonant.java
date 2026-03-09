import java.util.Scanner;

public class check_vowel_and_consonant {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Enter the alphabet to check whether it is vowel or consonant:- ");
        char alphabet = input.next().charAt(0);

        if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'){
            System.out.println(alphabet +" is vowel."); 
        }
        else{
            System.out.println(alphabet +" is consonant."); 
        }
    }
}

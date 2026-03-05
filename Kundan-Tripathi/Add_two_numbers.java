import java.util.Scanner;

public class Add_two_numbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the the first number:- ");
        int num1 = reader.nextInt();

        System.out.println("Enter the the second number:- ");
        int num2 = reader.nextInt();

        System.out.println("Addition of these two numbers is:- "+(num1+num2));
    }
}

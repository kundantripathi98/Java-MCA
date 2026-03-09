import java.util.Scanner;

public class Swap_two_number {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 

       System.out.println("Enter the first number:- ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number:- ");
        int num2 = input.nextInt();

         System.out.println("So the numbers before swap are x:- "+ num1 + ", y:- "+num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Now the numbers after swap are x:- "+ num1 + ", y:- "+num2);
    }
}

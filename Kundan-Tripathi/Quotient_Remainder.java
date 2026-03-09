import java.util.Scanner;

public class Quotient_Remainder{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the dividend");
        int dividend = input.nextInt();

        System.out.println("Enter the divisor");
        int divisor = input.nextInt();

        float quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient is:- "+ quotient);
        System.out.println("Remainder is:- "+ remainder);
    }
}
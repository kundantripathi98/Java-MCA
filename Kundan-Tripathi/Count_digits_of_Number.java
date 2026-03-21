import java.util.Scanner;

public class Count_digits_of_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number:- ");
        int n = input.nextInt();

        if(n<0){
            System.out.println("Please enter positive number above 0");
        } else{
            System.out.println("Number of digits in "+n+" is "+countDigit(n));
        }
    }

    public static int countDigit(int n) {
        int count = 1;
        if(n<10){
            return 1;
        }
        while (n > 10){
           n = n / 10;
            count++;
        }
        return count;
    }

}

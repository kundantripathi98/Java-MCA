import java.util.Scanner;

public class Number_positive_or_negative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = input.nextInt();

        if(num > 0) {
            System.out.println(num + " is a positive number");
        } else if (num < 0){
            System.out.println(num + " is a negative number");
        } else{
            System.out.println("Number is a zero");
        }

        input.close();
    }
}

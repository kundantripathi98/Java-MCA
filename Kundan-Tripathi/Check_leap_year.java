import java.util.Scanner;

public class Check_leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year to check whether it is leap year or not:- ");
        int year = input.nextInt();

        if(year%400 == 0) {
            System.out.println(year + " is a leap year.");
        } else if(year%100 == 0) {
            System.out.println(year + " is not a leap year.");
        } else if(year%4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

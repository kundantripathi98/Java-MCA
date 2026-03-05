import java.util.Scanner;

public class Print_Int_GivenByUser{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:- ");

        int num = input.nextInt();

        System.out.println("You have entered:- " + num);
    }
}

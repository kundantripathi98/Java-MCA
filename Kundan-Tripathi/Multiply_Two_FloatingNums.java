import java.util.Scanner;

public class Multiply_Two_FloatingNums {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first floationg number:- ");
        float num1 = reader.nextFloat();

        System.out.println("Enter the second floationg number:- ");
        float num2 = reader.nextFloat();

        System.out.println("So the multiplication of these two are:- " + (num1*num2));

        reader.close();
    }
}

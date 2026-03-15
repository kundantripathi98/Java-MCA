import java.util.Scanner;

public class Roots_of_quadratic_eq {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Enter the coeficient of x², x and the constant:- ");
        int a = input.nextInt(); 
        int b = input.nextInt(); 
        int c = input.nextInt();
        double x1, x2;
        
        double d = (b*b) - (4*a*c);

        if(d>0){
            x1 = (-b + Math.sqrt(d)) / (2*a);
            x2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("Roots are real and distinct, and here they are x1 = "+x1+" and x2 = "+x2);
        } else if (d==0){
            x1 = x2 = (-b) / (2*a);
            System.out.println("Roots are real and equal, and here they are x1 = "+x1+" and x2 = "+x2);
        } else{
            double real = -b / (2*a);
           double imaginary = Math.sqrt(-d) / (2*a);
           System.out.println("Roots are imaginary");
            System.out.println(real + " + " + imaginary + "i");
            System.out.println(real + " - " + imaginary + "i");
        }
    }
}

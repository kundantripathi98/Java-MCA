import java.util.Scanner;

public class Patterns {

    static void print1(int num) {
       for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                System.out.print("* ");
            }
            System.out.println("");
        } 
    }

    static void print2(int num) {
       for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        } 
    }

    static void print3(int num) {
       for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+ " ");
            }
            System.out.println("");
        } 
    }

    static void print4(int num) {
       for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i+ " ");
            }
            System.out.println("");
        } 
    }

    static void print5(int num) {
       for(int i = 1; i <= num; i++){
            for(int j = num; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println("");
        } 
    }

    static void print6(int num) {
       for(int i = num; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        } 
    }

    static void print7(int num) {
       for(int i = num; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        } 
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number:- ");
        int num = input.nextInt();

        // print1(num);
        // print2(num);
        // print3(num);
        // print4(num);
        // print5(num);
        print6(num);
        // print7(num);
    }

     
}

public class Largest_among_three_numbers {
    public static void main(String[] args) {
        int a = 45,
        b = 102,
        c = 89;

        if(a>b){
            if(a>c){
                System.out.println(a + " is the largest number among three.");
            } else {
                System.out.println(c + " is the largest number among three.");
            }
        } else {
            if(b>c){
                System.out.println(b + " is the largest number among three.");
            } else {
                System.out.println(c + " is the largest number among three.");
            }
        }
    }
}

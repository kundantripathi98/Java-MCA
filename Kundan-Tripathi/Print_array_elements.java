public class Print_array_elements {
    public static void main(String[] args) {
        int arr[] = {5, 23, 56, 85, 02};
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.println("Value at index: "+ index+ " is "+ arr[i]);
            index++;
        }
    }
}

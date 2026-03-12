public class Maximum_and_SecondMax_element_in_Array {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 4};

        System.out.println(findMax(arr));
    }

    public static int findMax(int[] arr) {
        int maxVal = arr[0];
        int secondMaxVal = Integer.MIN_VALUE;
        for(int num : arr){
           if( num > maxVal){
            maxVal = num;
           }
           
           if( num < maxVal && num > secondMaxVal){
            secondMaxVal = num;
           }
        }
        return maxVal;

        // return secondMaxVal;
    }
}

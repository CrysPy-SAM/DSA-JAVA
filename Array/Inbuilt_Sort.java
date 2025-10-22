import java.util.Arrays;

public class Inbuilt_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        
        Arrays.sort(arr);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
import java.util.*;

public class BinarySerch {
    public static int binarySearch(int numbers[], int key){
        int start=0,
         end= numbers.length-1; 
         while(start <= end){
            int mid = (start + end)/2;

            // comparisona
            if (numbers[mid] == key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }else{
                end = mid-1; 
            }
         }
         return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 5, 7, 3, 2, 4, 6, 4};
        int key =4;

        System.out.println("index for key is :" + binarySearch(numbers, key));
        
    }
    
}

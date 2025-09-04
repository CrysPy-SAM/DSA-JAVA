// import java.util.*;

// public class Assignment_array {

//     public boolean containsDuplicate(int[] nums) {
//         for (int i = 0; i < nums.length - 1; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] == nums[j]) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         Assignment_array obj = new Assignment_array();

//         int[] nums1 = {1, 2, 3, 1};
//         int[] nums2 = {1, 2, 3, 4};
//         int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

//         System.out.println(obj.containsDuplicate(nums1)); // true
//         System.out.println(obj.containsDuplicate(nums2)); // false
//         System.out.println(obj.containsDuplicate(nums3)); // true
//     }
// }
import java.util.*;

public class RotatedArraySearch {
    public int search(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {   // corrected here
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        RotatedArraySearch obj = new RotatedArraySearch();

        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println(obj.search(nums1, target1));  // 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println(obj.search(nums2, target2));  // -1

        int[] nums3 = {1};
        int target3 = 0;
        System.out.println(obj.search(nums3, target3));  // -1
    }
}

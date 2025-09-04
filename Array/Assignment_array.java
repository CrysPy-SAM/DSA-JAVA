import java.util.*;

public class Assignment_array {

    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Assignment_array obj = new Assignment_array();

        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(obj.containsDuplicate(nums1)); // true
        System.out.println(obj.containsDuplicate(nums2)); // false
        System.out.println(obj.containsDuplicate(nums3)); // true
    }
}

import java.util.HashSet;

class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        HashSet<Integer> set = new HashSet<>();
        int[] count = new int[value];
        for (int n : nums) {
            int mod = ((n % value) + value) % value;
            count[mod]++;
        }
        int i = 0;
        while (true) {
            int mod = i % value;
            if (count[mod] == 0) return i;
            count[mod]--;
            i++;
        }
    }
}

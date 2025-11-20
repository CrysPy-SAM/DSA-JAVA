class Solution {
    public int numSub(String s) {
        long ans = 0, count = 0;
        int mod = 1000000007;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            } else {
                ans = (ans + count * (count + 1) / 2) % mod;
                count = 0;
            }
        }
        ans = (ans + count * (count + 1) / 2) % mod;
        return (int) ans;
    }
}

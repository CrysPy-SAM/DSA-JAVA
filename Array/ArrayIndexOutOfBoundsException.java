import java.util.*;

class Solution {
    public int maxPartitionsAfterOperations(String s, int k) {
        int n = s.length();
        int[][][] dp = new int[n + 1][1 << Math.min(k, 10)][2];
        for (int i = 0; i <= n; i++)
            for (int j = 0; j < (1 << Math.min(k, 10)); j++)
                Arrays.fill(dp[i][j], -1);
        return dfs(s.toCharArray(), 0, 0, 0, k, dp);
    }

    private int dfs(char[] s, int i, int mask, int used, int k, int[][][] dp) {
        if (i == s.length) return 1;
        int id = mask & ((1 << Math.min(k, 10)) - 1);
        if (dp[i][id][used] != -1) return dp[i][id][used];

        int c = s[i] - 'a';
        int res = 0;
        int newMask = mask | (1 << (c % Math.min(k, 10)));

        if (Integer.bitCount(newMask) > k)
            res = 1 + dfs(s, i + 1, 1 << (c % Math.min(k, 10)), used, k, dp);
        else
            res = dfs(s, i + 1, newMask, used, k, dp);

        if (used == 0) {
            for (int j = 0; j < 26; j++) {
                int altMask = mask | (1 << (j % Math.min(k, 10)));
                if (Integer.bitCount(altMask) > k)
                    res = Math.max(res, 1 + dfs(s, i + 1, 1 << (j % Math.min(k, 10)), 1, k, dp));
                else
                    res = Math.max(res, dfs(s, i + 1, altMask, 1, k, dp));
            }
        }

        return dp[i][id][used] = res;
    }
}

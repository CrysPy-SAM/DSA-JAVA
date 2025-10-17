import java.util.*;

class Solution {
    public int maxPartitionsAfterOperations(String s, int k) {
        Map<String, Integer> memo = new HashMap<>();
        return dfs(s.toCharArray(), 0, 0, 0, k, memo);
    }

    private int dfs(char[] s, int i, int mask, int used, int k, Map<String, Integer> memo) {
        if (i == s.length) return 1;
        String key = i + "," + mask + "," + used;
        if (memo.containsKey(key)) return memo.get(key);

        int c = s[i] - 'a';
        int res = 0;
        int newMask = mask | (1 << c);

        if (Integer.bitCount(newMask) > k)
            res = 1 + dfs(s, i + 1, 1 << c, used, k, memo);
        else
            res = dfs(s, i + 1, newMask, used, k, memo);

        if (used == 0) {
            for (int j = 0; j < 26; j++) {
                int altMask = mask | (1 << j);
                if (Integer.bitCount(altMask) > k)
                    res = Math.max(res, 1 + dfs(s, i + 1, 1 << j, 1, k, memo));
                else
                    res = Math.max(res, dfs(s, i + 1, altMask, 1, k, memo));
            }
        }

        memo.put(key, res);
        return res;
    }
}

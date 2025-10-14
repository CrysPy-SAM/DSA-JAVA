import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        for (String w : words) {
            if (res.isEmpty()) {
                res.add(w);
                continue;
            }
            String last = res.get(res.size() - 1);
            if (!isAnagram(last, w)) res.add(w);
        }
        return res;
    }

    private boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] cnt = new int[26];
        for (int i = 0; i < a.length(); i++) {
            cnt[a.charAt(i) - 'a']++;
            cnt[b.charAt(i) - 'a']--;
        }
        for (int x : cnt) if (x != 0) return false;
        return true;
    }
}

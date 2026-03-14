class Solution {
    private int count = 0;
    private String answer = "";

    public String getHappyString(int n, int k) {
        backtrack(new StringBuilder(), n, k);
        return answer;
    }

    private void backtrack(StringBuilder curr, int n, int k) {
        if (!answer.isEmpty()) return;

        if (curr.length() == n) {
            count++;
            if (count == k) {
                answer = curr.toString();
            }
            return;
        }

        for (char ch : new char[]{'a', 'b', 'c'}) {
            if (curr.length() > 0 && curr.charAt(curr.length() - 1) == ch) {
                continue;
            }

            curr.append(ch);
            backtrack(curr, n, k);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
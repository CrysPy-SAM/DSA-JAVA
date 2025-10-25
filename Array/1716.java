class Solution {
    public int totalMoney(int n) {
        int week = n / 7, day = n % 7;
        int total = 0;
        total += 28 * week + 7 * (week - 1) * week / 2;
        int start = week + 1;
        for (int i = 0; i < day; i++) total += start + i;
        return total;
    }
}

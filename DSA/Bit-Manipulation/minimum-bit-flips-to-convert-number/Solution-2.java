class Solution {
    public int minBitsFlip(int start, int goal) {
        return Integer.bitCount(start ^ goal);
    }
}
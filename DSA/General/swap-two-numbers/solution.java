class Solution {
    /**
     * Swaps two integers and returns them as an array.
     *
     * @param a the first integer
     * @param b the second integer
     * @return an array with the two integers swapped
     */
    public int[] swap(int a, int b) {
        a=a^b;
        b=b^a;
        a=a^b;
        return new int[]{a,b};
    }
}

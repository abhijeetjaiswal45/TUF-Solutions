class Solution {
    public int maxDepth(String s) {
        int maxcount=0;
        int currentCount=0;
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch=='(') {
                currentCount++;
                maxcount=Math.max(maxcount,currentCount);
            }
            else if(ch==')') {
                currentCount--;
            }
        }
        return maxcount;
    }
}
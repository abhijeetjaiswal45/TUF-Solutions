class Solution {
    public boolean checkIthBit(int n, int i) {
        String s="";
        for(int j=0;j<=i;j++) {
            if(n%2==1) {
                s+="1";
            }
            else {
                s+="0";
            }
            n/=2;
        }
        if(s.charAt(i)=='1') {
            return true;
        }
        return false;
    }
}
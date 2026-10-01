class Solution {
    public int myAtoi(String input) {
        if(input == null || input.length()==0) {
            return 0;
        }
        int i=0;
        int n=input.length();

        while(i<n && input.charAt(i)==' ') {
            i++;
        }

        int sign=1;
        if(i<n && (input.charAt(i)=='-' || input.charAt(i)=='+')) {
            if(input.charAt(i)=='-') {
                sign=-1;
            }
            i++;
        }

        long result=0;
        while(i<n && Character.isDigit(input.charAt(i))) {
            int digit= input.charAt(i) - '0';
            result=result*10+digit;

            if (sign * result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign * result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (sign*result);
    }
}
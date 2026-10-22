class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow edge case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        
        // Convert to long to prevent overflow during absolute value conversion
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        
        long quotient = 0;
        
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor, multiple = 1;
            
            // Shift left until tempDivisor * 2 exceeds absDividend
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            
            absDividend -= tempDivisor;
            quotient += multiple;
        }
        
        // Apply sign and clamp to 32-bit signed integer range if necessary
        quotient = isNegative ? -quotient : quotient;
        
        if (quotient > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (quotient < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        return (int) quotient;
    }
}
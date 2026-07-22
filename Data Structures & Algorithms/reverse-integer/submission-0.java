class Solution {
    public int reverse(int x) {
        // boolean isNegative = x < 0;
        long reversed = 0;

        while(x != 0) {
            int digit = x%10;
            reversed = reversed*10 + digit;
            x=x/10;
        }

        if(reversed >= Integer.MIN_VALUE && reversed <= Integer.MAX_VALUE) {
            return (int)reversed;
        }
        return 0;
    }
}

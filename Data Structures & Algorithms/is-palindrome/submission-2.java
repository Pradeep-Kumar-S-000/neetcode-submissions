class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int n = str.length();

        int left = 0, right = n-1;

        while(left < right) {
            while(left < n && !((str.charAt(left) >= 'a' && str.charAt(left) <= 'z') 
                || (str.charAt(left) >= '0' && str.charAt(left) <= '9'))) {
                    left++;
                }

            char charRight = str.charAt(right);
            while(right >= 0 && !((str.charAt(right) >= 'a' && str.charAt(right) <= 'z') 
                || (str.charAt(right) >= '0' && str.charAt(right) <= '9'))) {
                    right--;
                }

            if(!(left < right)) return true;

            if(str.charAt(left) != str.charAt(right)) return false;

            left++; right--;
        }
        return true;
    }
}

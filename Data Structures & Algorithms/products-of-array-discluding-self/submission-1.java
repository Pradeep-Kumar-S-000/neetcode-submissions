class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefix = new int[nums.length]; prefix[0] = 1;
        int[] postfix = new int[nums.length]; postfix[nums.length-1] = 1;

        for(int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i-1] * prefix[i-1];
        }

        for(int j = nums.length-2; j >= 0; j--) {
            postfix[j] = nums[j+1] * postfix[j+1];
        }

        for(int k = 0; k < nums.length; k++) {
            result[k] = prefix[k] * postfix[k];
        }
        return result;
        
    }
}  

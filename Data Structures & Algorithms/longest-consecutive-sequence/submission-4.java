class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);

        for(int num : set) {
            if(!set.contains(num-1)) {
                int curr = num;
                int length = 1;

                while(set.contains(curr+1)) {
                    length++;
                    curr++;
                }

                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}

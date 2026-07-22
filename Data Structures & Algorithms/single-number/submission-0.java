class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(!set.add(num)) set.remove(num);
        }

        for(int number:set) return number;
        return 0;
    }
}

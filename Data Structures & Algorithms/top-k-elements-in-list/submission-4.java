class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n,0)+1);
        }
        List<Integer>[] buckets = new List[nums.length+1];
        freqMap.forEach((n,freq) -> {
            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(n);
        });
        int[] result = new int[k];
        int index = 0;
        for(int i = buckets.length-1; i > 0 && index < k; i--) {
            if(buckets[i] != null) {
                for(int n : buckets[i]) {
                    result[index++] = n;
                    if(index >= k) break;
                }
            }
        }
        return result;
    }
}

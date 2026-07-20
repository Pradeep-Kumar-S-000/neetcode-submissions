class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Long> map = Arrays.stream(nums).boxed()
            .collect(Collectors.groupingBy(i->i, Collectors.counting()));
        
        List<Map.Entry<Integer,Long>> entries = new ArrayList<>(map.entrySet());

        entries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int[] result = new int[k];
        int j = 0;
        for(int i = 0; i < k; i++) {
            result[i] = entries.get(j++).getKey();
        }
        return result;

    }
}

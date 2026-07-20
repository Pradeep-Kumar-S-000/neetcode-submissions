class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Long> map = Arrays.stream(nums).boxed()
            .collect(Collectors.groupingBy(n -> n,Collectors.counting()));

        List<Map.Entry<Integer,Long>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int[] result = new int[k];
        for(int j = 0; j < k; j++) {
            result[j] = entries.get(j).getKey();
        }
        return result;      

    }
}
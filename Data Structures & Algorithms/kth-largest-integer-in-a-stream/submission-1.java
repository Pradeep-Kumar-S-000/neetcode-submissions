class KthLargest {
    public int k;
    public List<Integer> numsList;
    
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.numsList = new ArrayList<Integer>(Arrays.stream(nums).boxed().toList());
        // for(int num : nums) numsList.add(num);
    }
    
    public int add(int val) {
        numsList.add(val);
        return numsList.stream().sorted(Comparator.reverseOrder())
            .skip(k-1)
            .findFirst()
            .orElse(0);
    }
}

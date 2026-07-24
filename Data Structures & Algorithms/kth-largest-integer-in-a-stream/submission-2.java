class KthLargest {
    public int k;
    public PriorityQueue<Integer> minHeap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>(Arrays.stream(nums).boxed().toList());
    }
    
    public int add(int val) {
        minHeap.offer(val);

        while(minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->{
            int distA = a[0]*a[0] + a[1]*a[1];
            int distB = b[0]*b[0] + b[1]*b[1];
            return Integer.compare(distB,distA);
        });

        for(int[] point : points) {
            maxHeap.offer(point);

            while(maxHeap.size() > k) maxHeap.poll();
        }

        int[][] closestPoints = new int[k][2];
        for(int i = 0; i < k; i++) {
            closestPoints[i] = maxHeap.poll();
        }
        return closestPoints;

    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->{
            int distA = a[0]*a[0] + a[1]*a[1];
            int distB = b[0]*b[0] + b[1]*b[1];
            return Integer.compare(distA,distB);
        });

        for(int[] point : points) {
            minHeap.offer(point);
        }

        int[][] closestPoints = new int[k][2];
        for(int i = 0; i < k; i++) {
            closestPoints[i] = minHeap.poll();
        }
        return closestPoints;

    }
}

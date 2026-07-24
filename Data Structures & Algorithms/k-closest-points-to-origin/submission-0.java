class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Map<int[],Double> map = new HashMap<>();

        for(int[] point : points) {
            int x = point[0];
            int y = point[1];

            Double d = Math.sqrt(x*x + y*y);

            map.put(point, d);
        }

        Map<int[],Double> entries = map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .limit(k)
            .collect(
                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)
                );

        int[][] closestPoints = new int[k][2];
        int index = 0;
        for(Map.Entry<int[],Double> entry : entries.entrySet()) {
            closestPoints[index++] = entry.getKey();
        }
        // entries.forEach((point,distance)->{
        //         closestPoints[index++] = point;
        //     }

        // );

        return closestPoints;

    }
}

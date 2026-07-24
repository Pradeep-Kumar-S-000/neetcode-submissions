/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();

        int[] start = new int[n];
        int[] end = new int[n];

        for(int i = 0; i < n; i++) {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int minRooms = 0, room = 0;
        int sp = 0, ep = 0;

        while(sp < n && ep < n) {
            if(start[sp] < end[ep]) {
                room++; sp++;
            } else {
                room--; ep++;
            }
            minRooms = Math.max(minRooms, room);
        }
        return minRooms;
    }
}

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
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(p -> p.start));
        for (int i = 1; i < intervals.size(); i++) {
            int prevEnd = intervals.get(i - 1).end;
            int curStart = intervals.get(i).start;
            if (curStart < prevEnd) {
                return false;
            }
        }
        return true;


    }
}

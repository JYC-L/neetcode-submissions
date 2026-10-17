class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int start = newInterval[0];
        int end = newInterval[1];
        for (int[] iv: intervals) {
            if (newInterval == null || start > iv[1]) {
                res.add(iv);
            } else if (end < iv[0]) {
                res.add(newInterval);
                res.add(iv);
                newInterval = null;
            } else {
                newInterval[0] = Math.min(iv[0], start);
                newInterval[1] = Math.max(iv[1], end);
                start = newInterval[0];
                end = newInterval[1];
            } 
        }
        if (newInterval != null) res.add(newInterval);

        return res.toArray(new int[res.size()][]);
        
    }
}

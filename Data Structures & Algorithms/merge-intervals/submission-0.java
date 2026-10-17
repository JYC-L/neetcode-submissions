class Solution {
    public int[][] merge(int[][] intervals) {
        //sort the intervals
        //for two internvals, if the first of second intervals
        //> second of the first interval = no merging, add new arr in
        //if the first of second intervals
        // <= second of the first interval => merge, overwrite the last elem
        //of the prev arr
        //
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);

        for (int[] interval: intervals) {
            int start = interval[0];
            int end = interval[1];
            int prevLast = res.get(res.size()-1)[1];


            if (start <= prevLast) {
                //in the case when we have [1, 3], [1, 2], need to ensure 3 is used as the end elem
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() -1)[1], interval[1]);
            } else {
                res.add(interval);
            }
        }

        return res.toArray(new int[res.size()][]);

        
    }
}

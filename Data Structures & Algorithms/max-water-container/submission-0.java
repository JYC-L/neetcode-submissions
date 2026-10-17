class Solution {
    public int maxArea(int[] heights) {
        //take the min of the two side and then multiply by the distance
        int maxArea = 0;
        int start = 0;
        int end = heights.length - 1;
        while (start < end) {
            int area = (end - start) * Math.min(heights[start], heights[end]);
            maxArea = Math.max(area, maxArea);
            if (heights[end] > heights[start]) {
                start++;
            } else {
                end--;
            }
        }
        return maxArea;
        
        
    }
}

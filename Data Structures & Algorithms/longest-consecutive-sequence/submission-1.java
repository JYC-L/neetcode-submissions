class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num:nums) {
            numSet.add(num);
        }

        int longest = 0;
        for (int num: nums) {
            if (!numSet.contains(num -1)) {
                int length = 1;
                while (numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }

        return longest;


        
    }
    //[1,1,1,1,1]
    //[1, 0, 0, 0]
    //[1, 2,4]
    //[1, 2, 3]
    //[1, 3, 2]
    //[3, 2, 1]
    //[3. 1, 2]
    //[3, 2, 0, 1]
}

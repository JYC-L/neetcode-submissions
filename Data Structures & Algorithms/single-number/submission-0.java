class Solution {
    public int singleNumber(int[] nums) {
        //start by first sorting the arry, making sure that the duplicate num
        //are located closely together
        Arrays.sort(nums);
        //iterate through the sorted array check if each element is equal to the neighbouring ele
        //bypass the next iteration and go the next of the next iteration. if yes -> continue the loop, else return the num 
        //[6,6,7,7,8]
        int cursor = 0;
        while (cursor < nums.length - 1) {
            if (nums[cursor] == nums[cursor+1]) cursor = cursor + 2;
            else return nums[cursor];
        }
        return nums[cursor];
        
    }
}

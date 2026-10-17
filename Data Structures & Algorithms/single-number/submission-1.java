class Solution {
    public int singleNumber(int[] nums) {
        //start by first sorting the arry, making sure that the duplicate num
        //are located closely together
        if (nums.length == 0) return 0;
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

//time complexity 
//sorting will take O(nlogn) assuming the sort function uses merge sorting
//iteration takes O(logn)
//space complexity depending on the sorting algorithm. since there is no map or set used to store the intermediate
//results -> O(1)

//test cases
//[3,2,3], 
//edges cases
//[] -> nothing
//[1,1,1,1], multiple same numbers -> last duplicate found
//[1, 2, 4] every num are unique -> first unique num
//[1], multiple duplicates different number -> last duplicate found

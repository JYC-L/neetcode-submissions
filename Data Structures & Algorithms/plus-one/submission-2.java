class Solution {
    public int[] plusOne(int[] digits) {
        //base condition
        //recursive approach: if the size of the digit is zero return arr[]{1}
        //if last digit (least significant digit < 9) replace it with incremeted value 
        //and return the arr
        //if least sig digit is 9 
        //create an arry excluding this digit and invoke plusOne on it
        //add zero to the end 

        //iterates throught the arr from the least sig digits, if its smaller than 9
        //then we just increments it and return the arr
        //if its equal to 9, we will set it 0 and increment the next sig digit by 1
        
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
            digits[i]++;
            return digits;
            } else {
                digits[i] = 0;
            }
        }
        //for edges cases where all digits in the arry is 9
        // will need to set all digits to 0 and add an additional digit to the left
        int[] answer = new int[digits.length + 1];
        answer[0] = 1;
        return answer;

        

    

    }
}

//time complexity:
//take O(n) to complete the function plusOne, in each recursive call, it
//takes O(n) to System.copyarray(), and Arrays.copyof methods
//overall O(n^2) 
//space complexity:O(n^2)
//

class Solution {
    public int[] plusOne(int[] digits) {
        //base condition
        //recursive approach: if the size of the digit is zero return arr[]{1}
        //if last digit (least significant digit < 9) replace it with incremeted value 
        //and return the arr
        //if least sig digit is 9 
        //create an arry excluding this digit and invoke plusOne on it
        //add zero to the end 
        if (digits.length == 0) return new int[]{1};
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] += 1;
            return digits;
        } else {
            int[] newArr = new int[digits.length -1];
            System.arraycopy(digits, 0, newArr, 0, digits.length -1);
            int[] results = plusOne(newArr);
            results = java.util.Arrays.copyOf(results, results.length + 1);
            results[results.length - 1] = 0;
            return results;



        }

    }
}

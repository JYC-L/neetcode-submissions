class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        String sLowerCase = s.toLowerCase();
        while (left < right) {
            while (left < right && !alphanumeric(sLowerCase.charAt(left))) {
                left++;
            }
            while (left < right && !alphanumeric(sLowerCase.charAt(right))) {
                right--;
            }
            if (sLowerCase.charAt(left) != sLowerCase.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;


    }

    public boolean alphanumeric(char c) {
        return (
            (c >= 'A' && c <= 'Z') ||
            (c >= 'a' && c <= 'z') ||
            (c >= '0' && c <= '9' )
        );
    }

}



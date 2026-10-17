class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            set.add(n);
            n = sumSquaredDigit(n);
            if (n == 1) return true;
        }
        return false;

    }

    public int sumSquaredDigit(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n%10)*(n%10);
            n = n/10;
        }
        return sum;
    }
}

//for a number as large as 999999, it takes 

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> closeBrackets = new HashMap<>();
        closeBrackets.put(']', '[');
        closeBrackets.put(')', '(');
        closeBrackets.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (Character c: s.toCharArray()) {
            if (closeBrackets.containsKey(c)) {
                if (!stack.isEmpty() && closeBrackets.get(c) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();   
    }

    //{{{}}}
    //{{[()]}}
    //{{{}}}[]
    //{{{}}}{
    //[]{}()
    //]
}

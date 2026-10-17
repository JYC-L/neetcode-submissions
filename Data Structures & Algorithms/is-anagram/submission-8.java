class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> counterS = new HashMap<>();
        Map<Character, Integer> counterT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character charS = s.charAt(i);
            Character charT = t.charAt(i);
            counterS.put(charS, counterS.getOrDefault(charS, 0)+1);
            counterT.put(charT, counterT.getOrDefault(charT, 0)+1);
        }
        return counterS.equals(counterT);

    }
}

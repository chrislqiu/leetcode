class Solution {
    public boolean isSubsequence(String s, String t) {
        int subPtr = 0;
        String temp;
        if (s.length() == 0) {
            return true;
        }
        for (int i = 0; i < t.length(); i++) {
            temp = Character.toString(t.charAt(i));
            if (temp.equals(Character.toString(s.charAt(subPtr)))) {
                subPtr++;
            }
            if (subPtr == s.length()) {
                return true;
            }
        }
        return false;
    }
}

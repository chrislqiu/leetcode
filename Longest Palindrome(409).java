class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        int len = 0;
        for (Integer letterFreq : freq) {
            len += letterFreq / 2 * 2;
            if (len % 2 == 0 && letterFreq % 2 == 1) {
                len += 1;
            }
        }
        return len;
    }
}

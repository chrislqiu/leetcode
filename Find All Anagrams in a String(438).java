class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> out = new ArrayList<>();
        int[] charCount = new int[26];
        //Calculates the freq of initial window
        for(int i = 0; i < p.length(); i++) {
            charCount[p.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = 0;
        int counter = p.length();
        //Loops until right pointer hits the end
        while (right < s.length()) {
            //Checks if letter exists
            if (charCount[s.charAt(right) - 'a'] >= 1) {
                counter--;
            }
            // Reduce count of char at right end.
            charCount[s.charAt(right) - 'a']--; 
            // Increment right end.
            right++; 
            //Checks if all letters have been checked off
            if (counter == 0) {
                out.add(left);
            }
            //Checks if window is intact
            if (right - left == p.length()) {
                //Increment counter if the left pointer needs to be checked
                if (charCount[s.charAt(left) - 'a'] >= 0) {
                    counter++;
                }
                charCount[s.charAt(left) - 'a']++;
                //Sliding window
                left++; 
            }
        }
        return out;
    }
}

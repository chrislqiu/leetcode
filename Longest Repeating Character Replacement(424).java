class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int highestFreq = 0;
        int left = 0;
        int max = 0;
        
        //Right ptr to the end
        for(int right = 0; right < s.length(); right++){
            //Increment freq
            freq[s.charAt(right) - 'A']++;
            //Keeps track of highest freq so that it does not exceed k
            highestFreq = Math.max(highestFreq, freq[s.charAt(right) - 'A']);
            int lettersToChange = (right - left + 1) - highestFreq;
            if(lettersToChange > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            
            max = Math.max(max, right - left + 1);
        }
        
        return max;
    }
}

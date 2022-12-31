class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<String, String> ST = new HashMap<>();
        HashMap<String, String> TS = new HashMap<>();

        String s1;
        String t1;

        for(int i = 0; i < s.length(); i++) {
            s1 = Character.toString(s.charAt(i));
            t1 = Character.toString(t.charAt(i));
            if ((ST.containsKey(s1) && !(ST.get(s1)).equals(t1)) || (TS.containsKey(t1) && !(TS.get(t1)).equals(s1))) {
                return false;
            }
            ST.put(s1, t1);
            TS.put(t1, s1);
        }
        return true;
    }
}

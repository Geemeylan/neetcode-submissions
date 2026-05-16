class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] arrS = s.toLowerCase().toCharArray();
        char[] arrT = t.toLowerCase().toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        return Arrays.equals(arrS, arrT);
    }
}

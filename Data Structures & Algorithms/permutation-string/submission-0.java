class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            String str = s2.substring(i, i + s1.length());
            int j = i;
            HashMap<Character, Integer> dmap = new HashMap<>(map);
            while (j - i < s1.length() && dmap.containsKey(str.charAt(j - i))) {
                char ch = str.charAt(j - i);
                dmap.put(ch, dmap.get(ch) - 1);
                if (dmap.get(ch) == 0) {
                    dmap.remove(ch);
                }
                j++;
            }
            if (dmap.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
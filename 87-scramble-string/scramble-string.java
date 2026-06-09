class Solution {

    private Map<String, Boolean> memo = new HashMap<>();

    public boolean isScramble(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        return dfs(s1, s2);
    }

    private boolean dfs(String s1, String s2) {

        if (s1.equals(s2)) {
            return true;
        }
        String key = s1 + "#" + s2;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int n = s1.length();
        int[] count = new int[26];

        for (int i = 0; i < n; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                memo.put(key, false);
                return false;
            }
        }
        for (int i = 1; i < n; i++) {

            if (dfs(s1.substring(0, i), s2.substring(0, i)) &&
                dfs(s1.substring(i), s2.substring(i))) {

                memo.put(key, true);
                return true;
            }
            if (dfs(s1.substring(0, i), s2.substring(n - i)) &&
                dfs(s1.substring(i), s2.substring(0, n - i))) {

                memo.put(key, true);
                return true;
            }
        }
        memo.put(key, false);
        return false;
    }
}
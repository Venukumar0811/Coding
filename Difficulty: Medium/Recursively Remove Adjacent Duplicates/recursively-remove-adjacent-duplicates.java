// User function Template for Java

class Solution {
    public String removeUtil(String s) {
        // code here
         String result = removeOnce(s);
        if (!result.equals(s)) {
            return removeUtil(result);
        }
        return result;
    }

    private static String removeOnce(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                char duplicate = s.charAt(i);
                while (i < s.length() && s.charAt(i) == duplicate) {
                    i++;
                }
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
        
    }
}
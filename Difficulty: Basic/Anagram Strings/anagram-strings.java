// User function template for Java
class Solution {
    static int areAnagram(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return 0;
        
        HashMap <Character, Integer> map = new HashMap<>();
        
        for(char ch : s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        
        for(char ch : s2.toCharArray()){
            if(!map.containsKey(ch)) return 0;
            
            map.put(ch, map.get(ch)- 1);

            if(map.get(ch) == 0) map.remove(ch);
            
        }
        
        return map.isEmpty()?1:0;
    }
}
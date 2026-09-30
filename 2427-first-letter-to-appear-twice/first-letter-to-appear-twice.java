class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> seen = new HashSet<>();
        
        for(int i = 0; i < s.length(); i++){
            if(seen.contains(s.charAt(i))){
                return s.charAt(i);
            } else { 
                seen.add(s.charAt(i));
            }
        }
        
        return '\0';
    }
}
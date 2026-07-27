class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List<String>> map = new HashMap<>();

        for(String s : strs) { 
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sort = new String(ch);
            map.putIfAbsent(sort, new ArrayList<>());
            map.get(sort).add(s);

        }   
        return new ArrayList<>(map.values());
    }
}
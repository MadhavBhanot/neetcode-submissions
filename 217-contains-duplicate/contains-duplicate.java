class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> yo = new HashSet<>();
        
        for(int num  : nums) { 
            if(yo.contains(num)){
                return true;
            }
            yo.add(num);
        }
        return false;
    }
}
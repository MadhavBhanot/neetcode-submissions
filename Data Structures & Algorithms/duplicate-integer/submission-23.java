class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> yo = new HashSet<>();        
        for(int i : nums){
            if(yo.contains(i)){
                
                return true;
            }
            yo.add(i);
        }
        return false;
    }
}
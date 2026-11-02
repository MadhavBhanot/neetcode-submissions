class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> yo = new HashMap<>();        
        for(int i= 0 ; i < nums.length ; i++){
            if(yo.containsValue(nums[i])){
                
                return true;
            }
            yo.put(i,nums[i]);
        }
        return false;
    }
}
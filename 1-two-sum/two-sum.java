class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int com  = target-nums[i];
            if(map.containsKey(com)){
                return new int[]{i,map.get(com)};
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}